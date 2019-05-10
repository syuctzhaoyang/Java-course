package card;

public class App {

	public App() {
		String []SUITFACE = {"黑桃","方块","红桃","草花"};
		String []NUMBER = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
//		Card card = new Card("红桃","A");
//		System.out.println(card.toString());
		
		Card []deck = new Card[52];
		for(int i = 0; i < deck.length;i++){
			Card tmp = new Card(SUITFACE[i / 13], NUMBER[i % 13]);
			deck[i] = tmp;
		}
		for(int i = 0; i < deck.length;i++){
			int index = (int) (Math.random() * 52); 
			
			Card temp_card = deck[i];
			deck[i] = deck[index];
			deck[index] = temp_card;
			
		}
		Card person0[] = new Card[13];
		Card person1[] = new Card[13];
		Card person2[] = new Card[13];
		Card person3[] = new Card[13];
		
		for(int i = 0; i < deck.length;i++){
			person0[i / 4] = deck[i];
			person1[i / 4] = deck[i];
			person2[i / 4] = deck[i];
			person3[i / 4] = deck[i];		
		}
		for(Card card:person0){
			System.out.println(card.toString());
		}
		
	}

	public static void main(String[] args) {
		new App();
	}

}
