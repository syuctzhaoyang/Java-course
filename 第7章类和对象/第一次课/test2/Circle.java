package test2;

public class Circle {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public double area(){
		return Math.PI * radius * radius;
	}
	public double girth(){
		return Math.PI * radius * 2;
	}
}
