package test2;

public class Rectangle {
	private double width,height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double area(){
		return width * height;
	}
	public double girth(){
		return (width + height) * 2;
	}
}
