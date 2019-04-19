package test2;

public class App {
	public App() {
		Rectangle rectangle =new Rectangle(5, 4);
		Circle circle = new Circle(5);
		
		System.out.println(rectangle.area());
		System.out.println(rectangle.girth());
		System.out.println(circle.area());
		System.out.println(circle.girth());
		
		Cuboid cuboid = new Cuboid(rectangle, 6);
		Cylinder cylinder = new Cylinder(circle, 6);
		
		System.out.println(cuboid.volume());
		System.out.println(cylinder.volume());
		
	}
	public static void main(String[] args) {
		new App();
	}
}
