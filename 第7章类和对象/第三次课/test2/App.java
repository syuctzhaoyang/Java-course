package card;

public class App {

	public App() {
		String []SUITFACE = {"ºìÌÒ","ºÚÌÒ","·½¿é","²İ»¨"};
		String []NUMBER = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
//		Card card = new Card("ºìÌÒ","A");
//		System.out.println(card.toString());
		
		Card []deck = new Card[52];
		for(int i = 0; i < deck.length;i++){
			Card tmp = new Card(SUITFACE[i / 13], NUMBER[i % 13]);
			deck[i] = tmp;
		}
		for(Card card:deck){
			System.out.println(card.toString());
		}
		
	}

	public static void main(String[] args) {
		new App();
	}

}
