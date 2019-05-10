package fraction;

public class App {

	public App() {
		Fraction fraction1 = new Fraction(2, 3);
		Fraction fraction2 = new Fraction(3, 4);
		Fraction fraction3 = new Fraction();
		fraction3.add(fraction1, fraction2);
		fraction3.pri();
		fraction3.pridouble();
		fraction3.sub(fraction1, fraction2);
		fraction3.pri();
		fraction3.pridouble();
		fraction3.mul(fraction1, fraction2);
		fraction3.pri();
		fraction3.pridouble();
		fraction3.div(fraction1, fraction2);
		fraction3.pri();
		fraction3.pridouble();
	}

	public static void main(String[] args) {
		new App();
	}

}
