package card;

public class Card {
	private String suitface;
	private String number;
	public Card(String suitface, String number) {
		super();
		this.suitface = suitface;
		this.number = number;
	}
	public Card() {
		super();
	}
	@Override
	public String toString() {
		return suitface + "-----" + number;
	}
	
	
}
