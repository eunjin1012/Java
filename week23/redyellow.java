package week23;

import java.awt.*;
import javax.swing.*;

public class redyellow {

	public redyellow() {
		JFrame f=new JFrame("Panel Test");
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		
		f.setLayout(new GridLayout(2, 1));
		p1.setBackground(Color.red);
		p2.setBackground(Color.yellow);
		
		JButton b1=new JButton("빨간색");
		JButton b2=new JButton("노란색");
		
		f.add(p1);
		f.add(p2);
		p1.add(b1);
		p2.add(b2);
		
		f.setSize(300, 800);
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new redyellow();
	}

}
