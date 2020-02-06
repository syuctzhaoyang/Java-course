package com;

public class TestSyn {

	public static void main(String[] args) {
		WithDraw w1 =new WithDraw();
		Thread t1 = new Thread(w1);
		t1.setName("周芷若");
		t1.start();
		Thread t2 = new Thread(w1);
		t2.setName("小龙女");
		t2.start();

	}

}
class WithDraw implements Runnable{
	int money =30000;
	@Override
	public void run() {
		while(true){

			synchronized (this) {
				if (money <= 0) {
					System.out.println("钱已经取完了！");
					break;
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " 取了1000元钱，还剩" + (money -= 1000));
				this.notify();
				if(money <= 0){
					break;
				}
				else{
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}