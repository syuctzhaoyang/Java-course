package geo;

public class App {

	public App() {
		Geom g1 = new Rectangle(5, 4);
		Geom g2 = new Circle(5);
		
		System.out.println(g1.area());
		System.out.println(g1.girth());
		System.out.println(g2.area());
		System.out.println(g2.girth());
	}

	public static void main(String[] args) {
		new App();
	}

}
