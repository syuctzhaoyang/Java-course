package test2;

public class App {
	public App() {
		Rectangle rectangle =new Rectangle(5, 4);
		Circle circle = new Circle(5);
		
		System.out.println(rectangle.area());
		System.out.println(rectangle.girth());
		System.out.println(circle.area());
		System.out.println(circle.girth());
	}
	public static void main(String[] args) {
		new App();
	}
}
