package human;

import javax.swing.JFrame;

public class App {

	public App() {

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
