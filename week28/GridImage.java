package week28;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Gridimage extends JFrame{
	public Gridimage() {
		super("그래픽 이미지 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		private ImageIcon icon=new ImageIcon("images/back.jpg");
		private Image img=icon.getImage();
		private int imgWidth=img.getWidth(this);
		private int imgHeight=img.getHeight(this);
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int panelWidth=this.getWidth();
			int panelHeight=this.getHeight();
			
			g.drawImage(img, 0, 0, panelWidth/2-5, panelHeight/2-5, 0, 0, imgWidth/2, imgHeight/2, this);
			g.drawImage(img,  panelWidth/2+5,  0,  panelWidth,  panelHeight/2-5,  imgWidth/2,  0,  imgWidth,  imgHeight/2,  this);
			g.drawImage(img,  0,  panelHeight/2+5,  panelWidth/2-5,  panelHeight,  0,  imgHeight/2,  imgWidth/2,  imgHeight,  this);
			g.drawImage(img,  panelWidth/2+5,  panelHeight/2+5,  panelWidth,  panelHeight,  imgWidth/2,  imgHeight/2,  imgWidth, imgHeight,this);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Gridimage();
	}

}
