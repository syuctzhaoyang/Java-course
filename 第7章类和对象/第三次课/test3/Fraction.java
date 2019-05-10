package fraction;

public class Fraction {
	private int fenzi,fenmu;
	public Fraction() {
		this(1,1);
	}
	public Fraction(int fenzi, int fenmu) {
		super();
		this.fenzi = fenzi;
		this.fenmu = fenmu;
	}
	public void pri(){
		System.out.println(fenzi + "/" + fenmu);
	}
	public void pridouble(){
		System.out.println((double)fenzi/fenmu);
	}
	public void add(Fraction f1,Fraction f2){
		fenmu = f1.fenmu * f2.fenmu;
		fenzi = f1.fenzi * f2.fenmu + f1.fenmu * f2.fenzi;
	}
	public void sub(Fraction f1,Fraction f2){
		fenmu = f1.fenmu * f2.fenmu;
		fenzi = f1.fenzi * f2.fenmu - f1.fenmu * f2.fenzi;
	}
	public void mul(Fraction f1,Fraction f2){
		fenmu = f1.fenmu * f2.fenmu;
		fenzi = f1.fenzi * f2.fenzi;
	}
	public void div(Fraction f1,Fraction f2){
		fenmu = f1.fenmu * f2.fenzi;
		fenzi = f1.fenzi * f2.fenmu;
	}
}
