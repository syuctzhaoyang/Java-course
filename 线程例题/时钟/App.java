package human;

import javax.swing.JFrame;

public class App {

	public App() {
//		Life life =new Life(1,"毛毛");
//		life.start();
//		Life life1 =new Life(2,"铁蛋");
//		life1.start();
		Mypanel p = new Mypanel();
        Thread panelThread = new Thread(p);
        JFrame frame = new JFrame();
        frame.add(p);
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelThread.start();
		
	}
	
	public static void main(String[] args) {
		new App();
	}
}

class Life extends Thread{
	int id;
	String name;
	
	public Life(int id,String name) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public void run() {
		Person p = new Person(id,name);
		System.out.println(p);
		pause();
		p.toBaby();
		pause();
		System.out.println(p);
		p.toAdolescence();
		pause();
		System.out.println(p);
		p.toAdult();
		pause();
		System.out.println(p);
		p.toOld();
		pause();
		System.out.println(p);
		pause();
		p.toDead();
		System.out.println(p);
	}
	private void pause(){
		int time = (int) (1000 *Math.random()); 
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}