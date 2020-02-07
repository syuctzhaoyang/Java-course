package com;
/**
 * 
 * @author zjc
 * 生产者(Producter)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品。
 * 店员一次只能持有固定数量的产品（比如20），如果生产者试图生产更多的产品，店员会叫生产者停一下。
 * 如果点钟有空位置放产品了再通知生产者继续生产；
 * 如果点钟没有产品了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来取走产品。
 */
public class Co_Producter {

	public static void main(String[] args) {
		Clerk c = new Clerk();
		Productor  p1 = new Productor(c, "张无忌");
		p1.start();
		Productor  p2 = new Productor(c, "令狐冲");
		p2.start();
		Customer cust1 = new Customer(c, "赵敏");
		cust1.start();
		Customer cust2 = new Customer(c, "小昭");
		cust2.start();
		Customer cust3 = new Customer(c, "师太");
		cust3.start();
	}

}
class Clerk{
	//count 产品数量
	int count = 0;
	public synchronized void save(){
		while(count >= 20){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "生产了一件产品，目前库存为：" + (++count));
		this.notifyAll();
	}
	public synchronized void get(){
		while(count <= 0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "消费了一件产品，目前库存为：" + (--count));
		this.notifyAll();
	}
}
class Productor extends Thread{
	private Clerk c;
	public Productor(Clerk c,String name) {
		super(name);
		this.c = c;
	}
	@Override
	public void run() {
		while(true){		
			//调用clerk对象的save方法
			c.save();
		}
	}
}
class Customer extends Thread{
	private Clerk c;
	public Customer(Clerk c,String name) {
		super(name);
		this.c = c;
	}
	@Override
	public void run() {
		while(true){
			//调用clerk对象的get方法
			c.get();
		}
	}
}