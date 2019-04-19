package test2;

public class Cylinder {
	private Circle circle;
	private double height;
	public Cylinder(Circle circle, double height) {
		super();
		this.circle = circle;
		this.height = height;
	}
	public double volume(){
		return circle.area() * height;
	}
}
