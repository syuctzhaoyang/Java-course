package human;

import java.util.Random;

public class Person {
	private int id;
	private int state;
	private Point location = new Point();
	
	public Person(int id) {
		super();
		this.id = id;
		state = State.NORMAL;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", state=" + state + ", location=" + location + "]";
	}


	public int getId() {
		return id;
	}



	public Point getLocation() {
		return location;
	}
	public void setLocation(Point location) {
		this.location = location;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
}
interface State{
    int NORMAL = 0;
    int SUSPECTED = NORMAL+1;
    int SHADOW = SUSPECTED+1;
    int CONFIRMED = SHADOW+1;
    int FREEZE = CONFIRMED+1;
}

class Point{
	
	public Point() {
		x = Constants.centerX + (int)(100 *new Random().nextGaussian());
		y = Constants.centery + (int)(100 *new Random().nextGaussian());
	}
	private int x;
	private int y;
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}

