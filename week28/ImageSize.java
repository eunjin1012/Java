package week28;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class ImageSize extends JFrame{
	public ImageSize() {
		super("그래픽 이미지 확대 축소");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 300);
		setVisible(true);
		getContentPane().requestFocus();
	}
	class MyPanel extends JPanel{
		ImageIcon icon=new ImageIcon("images/apple.jpg");
		Image img=icon.getImage();
		int width;
		int height;
		public MyPanel() {
			width=img.getWidth(this);
			height=img.getHeight(this);
			addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar()=='+') {
						width=(int)(width*1.1);
						height=(int)(height*1.1);
						repaint();
					}
					else if(e.getKeyChar()=='-') {
						width=(int)(width*0.9);
						height=(int)(height*0.9);
						repaint();
					}
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img,  10,  10,  width,  height,  this);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageSize();
	}

}
