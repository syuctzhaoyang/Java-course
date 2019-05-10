package fraction;

public class Test {

	public Test() {
		int index = 0;
		int sum = 0;
		for(;;){
			int number =(int)(Math.random() * 30 +2);
			if(number % 2 == 0){
				sum += number;
				index++;
				if(index >= 5){
					break;
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Test();
	}

}
