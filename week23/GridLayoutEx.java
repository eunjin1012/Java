package week23;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame{
	GridLayoutEx(){
		setTitle("Ten Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 10));
		for(int i=0; i<10; i++) {
			JButton b=new JButton(Integer.toString(i));
			add(b);
		}
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutEx();
	}

}
