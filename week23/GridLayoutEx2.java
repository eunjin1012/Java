package week23;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx2 extends JFrame{
	GridLayoutEx2(){
		setTitle("Ten Color Buttons Frame");
		setLayout(new GridLayout(1, 10));
		JButton [] btn=new JButton[10];
		Color [] color= {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, 
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
				Color.PINK, Color.LIGHT_GRAY};
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i=0; i<btn.length; i++) {
			btn[i]=new JButton(Integer.toString(i));
			btn[i].setBackground(color[i]);
			add(btn[i]);
		}
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutEx2();
	}

}
