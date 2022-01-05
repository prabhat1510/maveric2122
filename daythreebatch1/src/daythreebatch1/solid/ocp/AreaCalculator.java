package daythreebatch1.solid.ocp;

public class AreaCalculator {
	/**
	public double calculateRectangleArea(Rectangle rectangle) {
		return rectangle.getLength() *rectangle.getWidth();
	}
	
	public double calculateRectangleCircle(Circle circle) {
		return (3.14 *circle.getRadius()*circle.getRadius());
	}**/
	
	public double calculateShapeArea(Shape shape) {
		return shape.calculateArea();
	}
}
