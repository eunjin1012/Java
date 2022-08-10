package week25;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Mouse extends JFrame implements MouseMotionListener{
	private static final long serialVersionUID=1L;
	JPanel pnl=new JPanel();
	JLabel la=new JLabel("Hello");
	JLabel la2;
	Point p;
	final int UNIT=10;
	
	
	Mouse(){
		setTitle("KeyEvent Å×½ºÆ®");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(pnl);
		pnl.setLayout(null);
		la.setOpaque(true);
		la.setLocation(250, 150);
		la.setSize(150, 50);
		la.setBounds(100, 100, 50, 30);
		la.setForeground(Color.RED);
		addMouseMotionListener(this);
		pnl.addKeyListener(new MyKeyListener());
		pnl.add(la);
		
		la2=new JLabel("x, y");
		pnl.add(la2);
		la2.setSize(250, 235);
		la2.setLocation(20, 90);
		
		
		
		
		setSize(400, 300);
		setVisible(true);
		pnl.requestFocus();
		
		
		
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			String str;
			int x, y, z, xx, yy;
			x=la.getX();
			y=la.getY();
			if(e.isControlDown())
				z=3;
			else if(e.isShiftDown())
				z=2;
			else
				z=1;
			
			int keyCode=e.getKeyCode();
			switch(keyCode) {
			case KeyEvent.VK_UP:
				if((y-UNIT*z)<0)
					yy=0;
				else
					yy=y-UNIT*z;
				la.setLocation(x, yy);
				str=x+","+y;
				la2.setText(str);
				break;
			case KeyEvent.VK_DOWN:
				if((y+UNIT*z)>350)
					yy=350;
				else
					yy=y+UNIT*z;
				la.setLocation(x, yy);
				str=x+","+y;
				la2.setText(str);
				break;
			case KeyEvent.VK_LEFT:
				if((x-UNIT*z)<0)
					xx=0;
				else
					xx=x-UNIT*z;
				la.setLocation(xx, y);
				str=x+","+y;
				la2.setText(str);
				break;
			case KeyEvent.VK_RIGHT:
				if((x+UNIT*z)>350)
					xx=350;
				else
					xx=x+UNIT*z;
				la.setLocation(xx, y);
				str=x+","+y;
				la2.setText(str);
				break;
			}
		}
	}
	
	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		p=e.getPoint();
		la.setLocation(p);
		
		
		
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Mouse();
	}
}
