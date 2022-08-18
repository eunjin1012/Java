package week23;

import javax.swing.*;
import java.awt.*;

public class container extends JFrame{
	container(){
		setTitle("Container c");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		contentPane.setLayout(null);
		
		JLabel la=new JLabel("Click");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		contentPane.add(la);
		
		
		for(int i=0; i<10; i++) {
			JButton j=new JButton(Integer.toString(i));
			j.setLocation(i*15, i*15);
			j.setSize(50, 20);
			contentPane.add(j);
		}
		
		setSize(300, 200);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new container();
	}

}
