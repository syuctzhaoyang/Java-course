package sim2;

public abstract class Sim {
	private String number;
	public abstract String getCropName();
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
