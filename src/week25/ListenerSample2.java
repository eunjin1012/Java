package week25;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ListenerSample2 extends JFrame{
	JButton btn1, btn2;
	JPanel pnl;
	JLabel lbl;
	MyActionListener2 listener;
	
	ListenerSample2(){
		setTitle("Action�̺�Ʈ �ܺ�Ŭ���� ������ �ۼ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pnl=new JPanel();
		
		btn1=new JButton("��ũ");
		listener=new MyActionListener2(pnl);
		btn1.addActionListener(listener);
		pnl.add(btn1);
		
		btn2=new JButton("���");
		btn2.addActionListener(listener);
		pnl.add(btn2);
		
		add(pnl);
		
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListenerSample2();
	}

}

class MyActionListener2 implements ActionListener{
	JPanel pnl;
	public MyActionListener2(JPanel pnl) {
		this.pnl=pnl;
	}
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		if(b.getText().equals("��ũ"))
			pnl.setBackground(Color.PINK);
		else
			pnl.setBackground(Color.GREEN);
	}
}