package week28;

import javax.swing.*;
import java.awt.*;

public class Olympic extends JFrame{
	Olympic(){
		super("오륜기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(350, 250);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2=(Graphics2D) g;
			g2.setStroke(new BasicStroke(5));
			
			g.setColor(Color.BLUE);
			g.drawOval(10,  10,  100,  100);
			g.setColor(Color.BLACK);
			g.drawOval(90, 10, 100, 100);
			g.setColor(Color.RED);
			g.drawOval(170,  10,  100,  100);
			g.setColor(Color.YELLOW);
			g.drawOval(50,  80,  100,  100);
			g.setColor(Color.GREEN);
			g.drawOval(120,  80,  100,  100);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Olympic();
	}

}
