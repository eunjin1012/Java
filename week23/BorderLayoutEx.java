package week23;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame{
	BorderLayoutEx(){
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout(5, 7));
		add(new JButton("북쪽"), BorderLayout.NORTH);
		add(new JButton("남쪽"), BorderLayout.SOUTH);
		add(new JButton("오른쪽"), BorderLayout.EAST);
		add(new JButton("왼쪽"), BorderLayout.WEST);
		add(new JButton("중앙"), BorderLayout.CENTER);
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutEx();
	}

}
