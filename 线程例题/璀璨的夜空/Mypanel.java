package human;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Mypanel extends JPanel implements Runnable{
	PersonPool personPool = PersonPool.getInstance();
	public Mypanel() {
        this.setBackground(new Color(0x444444));
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for (Person person : personPool.personList) {
//			Point newlocation=newLocation(person.getLocation());
//			person.setLocation(newlocation);
			update(person);
			switch(person.getState()){
			case 0 : 
				g.setColor(Color.GREEN);
				break;
			case 1 : 
				g.setColor(Color.RED);
				break;
			case 3 : 
				g.setColor(Color.ORANGE);
				break;
			case 4 : 
				g.setColor(Color.PINK);
				break;
			case 5 : 
				g.setColor(Color.CYAN);
				break;
			default: 
				g.setColor(Color.CYAN);
			}
			g.fillOval(person.getLocation().getX(), person.getLocation().getY(), 3, 3);
		} 
	}
	private void update(Person person){
		int state = person.getState();
		if(state == State.FREEZE){
			state = State.NORMAL;
		}else{
			state +=1;
		}
		Point location = person.getLocation();
		person.setLocation(newLocation(location));
	}
	private  Point newLocation(Point tmp){
		
		int x = tmp.getX();
		int y = tmp.getY();
		int deltaX = (int)(10 *new Random().nextGaussian());
		int deltaY = (int)(10 *new Random().nextGaussian());
		tmp.setX(x + deltaX);
		tmp.setY(y + deltaY);
		return tmp;
		
	}
	@Override
	public void run() {
		while (true) {
			this.repaint();
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
