package week28;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;


public class Imagepractice2 extends JFrame{
	public Imagepractice2() {
		super("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		private ImageIcon icon=new ImageIcon("images/back.jpg");
		private Image img=icon.getImage();
		private JButton button=new JButton("show");
		private boolean showFlag=true;
		
		public MyPanel() {
			setLayout(new FlowLayout());
			add(button);
			
			button.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					showFlag=!showFlag;
					repaint();
				}
			});
		}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(showFlag)
			g.drawImage(img,  0, 0, this.getWidth(), this.getHeight(), this);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Imagepractice2();
	}

}
