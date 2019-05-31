package geo;

public class Rectangle extends Geom {
	private double width, height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}

	@Override
	public double girth() {
		return (width + height) * 2;
	}
	
}
