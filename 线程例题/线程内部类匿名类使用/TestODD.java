package com;

public class TestODD {

	public static void main(String[] args) {
//		Oddsum oddsum = new Oddsum();
//		oddsum.start();
//		new Thread(new Runnable() {
//			public void run() {
//				int sum = 0;
//				for(int i =1;i<=100;i = i+2){
//					sum += i;
//				try {
//					Thread.sleep(10);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			System.out.println(sum);
//			}
//		}).start();
		new Thread() {
			public void run() {
				int sum = 0;
				for(int i =1;i<=100;i = i+2){
					sum += i;
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(sum);
			}
		}.start();
	}
}
class Oddsum extends Thread{
	private int sum = 0;
	@Override
	public void run() {
		for(int i =1;i<=100;i = i+2){
			
				sum += i;
			
			
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(sum);
	}
}