package test2;

public class Cuboid {
	private Rectangle rectangle;
	private double height;
	public Cuboid(Rectangle rectangle, double height) {
		super();
		this.rectangle = rectangle;
		this.height = height;
	}
	public double volume(){
		return rectangle.area() * height;
	}
}
