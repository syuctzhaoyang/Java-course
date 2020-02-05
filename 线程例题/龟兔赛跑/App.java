package com;

public class App {

	public static void main(String[] args) {
		Tortoise t = new Tortoise();
		Rabit r = new Rabit();
		r.start();
		t.start();
		

	}

}
class Tortoise extends Thread{
	@Override
	public void run() {
		for (int i = 1;i <= 30;i++){
			if(i%10 ==0){
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Tortoise"+i);
			}

		}
	}
}
class Rabit extends Thread{
	@Override
	public void run() {
		for (int i = 10;i <= 30;i=i+10){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Rabit"+i);
		}
	}
}