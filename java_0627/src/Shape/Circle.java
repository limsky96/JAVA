package Shape;

public class Circle extends Shape {
	private double radius;
	
	Circle(double rad){
		radius = rad;
	}
	@Override
	public double getArea() {
		return radius * radius *Math.PI;
	}
}
