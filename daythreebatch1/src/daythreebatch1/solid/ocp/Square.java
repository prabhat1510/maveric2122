package daythreebatch1.solid.ocp;

public class Square implements Shape {

	private double side;
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

}
