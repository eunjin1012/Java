package week24;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ListenerSample2 extends JFrame{
	JTextField jf=new JTextField(15);
	JButton btn1=new JButton("Copy");
	JButton btn2=new JButton("Clear");
	JLabel j1=new JLabel("이곳에 출력됨");
	ListenerSample2(){
		setTitle("Action 이벤트");
		setLayout(new GridLayout(3, 1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		jp1.add(jf);
		jp2.add(btn1);
		jp2.add(btn2);
		jp3.add(j1);
		MyActionListener2 listener=new MyActionListener2();
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		add(jp1);
		add(jp2);
		add(jp3);
		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListenerSample2();
	}
	class MyActionListener2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton btn=(JButton)e.getSource();
			if(btn.getText().equals("Copy")) {
				String sr=jf.getText();
				Font f=new Font("Serif", Font.BOLD, 30);
				j1.setForeground(Color.red);
				j1.setFont(f);
				j1.setText(sr);
			}
			if(btn.getText().equals("Clear")) {
				jf.setText("");
				j1.setText("이곳에 출력됨");
			}
		}
	}
}
