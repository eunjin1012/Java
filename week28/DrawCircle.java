package week28;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class DrawCircle extends JFrame{
	public DrawCircle() {
		super("이미지 위에 원 드래깅");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		ImageIcon icon=new ImageIcon("images/back.jpg");
		Image img=icon.getImage();
		int x=100, y=100;
		public MyPanel() {
			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					x=e.getX();
					y=e.getY();
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img,  0,  0,  this.getWidth(), this.getHeight(), this);
			g.setColor(Color.GREEN);
			g.fillOval(x,  y,  20,  20);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DrawCircle();
	}

}
