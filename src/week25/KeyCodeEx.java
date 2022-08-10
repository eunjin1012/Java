package week25;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame implements KeyListener{
	JPanel contentPane=new JPanel();
	JLabel la=new JLabel();
	
	KeyCodeEx(){
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
		int code=e.getKeyCode();
		String str=e.getKeyText(code);
		la.setText(str);
		if(e.getKeyChar()=='%')
			contentPane.setBackground(Color.YELLOW);
		else if(e.getKeyCode()==KeyEvent.VK_F1)
			if(e.isShiftDown())
				contentPane.setBackground(Color.pink);
			else
				contentPane.setBackground(Color.GREEN);
	}

	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyCodeEx();
	}

}
