package geo;

public class Circle extends Geom {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius* radius;
	}

	@Override
	public double girth() {
		return Math.PI * radius* 2;
	}
	
}
