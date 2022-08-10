package week25;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeeyCode extends JFrame implements KeyListener{
	JPanel contentPane=new JPanel();
	JLabel la=new JLabel();
	
	KeeyCode(){
		setTitle("Key Code ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.addKeyListener(this);
		contentPane.add(la);
		setSize(500, 300);
		setVisible(true);
		contentPane.requestFocus();
	}
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyChar()=='a')
			System.exit(0);
		else if(e.getKeyCode()==KeyEvent.VK_ALT)
				contentPane.setBackground(Color.pink);
		
	}
	
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeeyCode();
	}

}
