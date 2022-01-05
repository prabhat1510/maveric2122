package daythreebatch1.solid.ocp;

public class Circle implements Shape{

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return (3.14*radius*radius);
	}
	
}
