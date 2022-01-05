package daythreebatch1.solid.lsp;

public class SqaureRectMainApp {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.setLength(15);
		rect.setWidth(10);
		System.out.println(rect.getArea());
		
		Rectangle square = new Square();
		square.setLength(2);
		square.setWidth(2);
		System.out.println(square.getArea());

	}

}
