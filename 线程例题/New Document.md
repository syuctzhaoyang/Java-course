#Java线程
##线程的同步
	package com;

	public class TestThreadStartDiff {

	public static void main(String[] args) {
	//		方式1
	//		SellTicket s1 = new SellTicket();
	//		s1.start();
	//		SellTicket 
	//		s2 = new SellTicket();
	//		s2.start();
	//		SellTicket s3 = new SellTicket();
	//		s3.start();
	//		方式2
			SellTicket2 s2 = new SellTicket2();
			new Thread(s2).start();
			new Thread(s2).start();
			new Thread(s2).start();
			
		}

	}
	//方式2
	class SellTicket2 implements Runnable{
	
		static int tickets = 100;
		@Override
		public void run() {
			while(true){
				if(tickets <=0){
					System.out.println("票已经卖完了");
					break;
				}
				System.out.println(Thread.currentThread().getName()+"卖了一张票，票数余额:"+(--tickets));
			}
		}
	}
	//方式1
	class SellTicket extends Thread{
		static int tickets = 100;
		@Override
		public void run() {
			while(true){
				if(tickets <=0){
					System.out.println("票已经卖完了");
					break;
				}
				System.out.println(Thread.currentThread().getName()+"卖了一张票，票数余额:"+(--tickets));
			}
		}
	}
# hello #
## world ##
[https://www.hao123.com/](https://www.hao123.com/)

- dssdfs
- asdf
- asdf

[https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html "jdk1.8下载地址")
![下载JDK页面](C:\Users\zjc\Pictures\vt.png)
