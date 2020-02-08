package human;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.SimpleDateFormat;

import javax.swing.JPanel;

public class Mypanel extends JPanel implements Runnable{
	java.util.Date d;
	SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
	
	public Mypanel() {
		this.setBackground(new Color(0x444444));
	}
	
	@Override
	public void paint(Graphics g) {
		
		d= new java.util.Date();
		g.clearRect(0, 0, 1000, 800);
		g.setFont(new Font("宋体",Font.BOLD,70));
		g.drawString(new String(sf.format(d)), 100 , 400);
		
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
