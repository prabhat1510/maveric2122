/**
 * 
 */
package daytwo.streams.createstreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Properties;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author UD SYSTEMS
 *
 */
public class CreateStreamsExample {
	
	public static void main(String[] args) {
		Stream<String> currencies = Stream.of("USD","EUR","JPY","INR");
		currencies.forEach(System.out::println);
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		IntStream integers = Arrays.stream(numbers);
		//integers.forEach(System.out::println);
		//System.out.println(integers.count());
		//System.out.println(integers.average());
		OptionalDouble average =integers.filter(x->x>5).average();
		System.out.println(average);
		
		try(Stream<String> lines = Files.lines(Paths.get("C:\\Users\\UD SYSTEMS\\Desktop\\orders.csv"))){
			
			lines.forEach(System.out::println);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		
		System.out.println("***************************************");
		Properties prop = new Properties();
		try{
		
		InputStream input = new FileInputStream("src/application.properties");
		prop.load(input);
		//try with resource
		try (Stream<String> lines = Files.lines(Paths.get(prop.getProperty("filePath")))) {
			lines.forEach(System.out::println);
		}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		
		// FlatMap Operation
		try (Stream<String> lines = Files.lines(Paths.get(prop.getProperty("filePathtwo")))) {
			//flatMap()- processes a Stream<String[]> It uses Arrays::stream to generate Stream<String> from Stream<String[]>
			lines.map(line->line.split("\\s+")).flatMap(Arrays::stream).distinct().forEach(System.out::println);
			//lines.forEach(System.out::println);
		}
			
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		
	}

}
