package week24;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator extends JFrame implements ActionListener{
	
	public static final long serialVersionUID=1L;
	Button b1, b2, b3, b4;
	JTextField t1, t2, t3;
	JLabel s1, s2, s3, s4;
	
	public Calculator() {
		setSize(350, 200);
		setLayout(new BorderLayout());
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel pg=new JPanel(new GridLayout(2,2));
		
		s1=new JLabel("                          첫번째 수 : ");
		s2=new JLabel("                          두번째 수 : ");
		s3=new JLabel("연산식 : ");
		s4=new JLabel("수식 결과 : ");
		
		
		t1=new JTextField(5);
		t2=new JTextField(5);
		t3=new JTextField(25);
		
		b1=new Button("+");
		b2=new Button("-");
		b3=new Button("*");
		b4=new Button("/");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
	
		pg.add(s1);
		pg.add(t1);
		
		pg.add(s2);
		pg.add(t2);
		
		p1.add(s3);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		
		p2.add(s4);
		p2.add(t3);
		
		add(pg, BorderLayout.NORTH);
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int plus=a+b;
			t3.setText(a+" + "+b+"="+plus);
			
		}
		else if(e.getSource()==b2)
		{
			int c=Integer.parseInt(t1.getText());
			int d=Integer.parseInt(t2.getText());
			int minus=c-d;
			t3.setText(c+" - "+d+"="+minus);
		}
		else if(e.getSource()==b3)
		{
			int f=Integer.parseInt(t1.getText());
			int g=Integer.parseInt(t2.getText());
			int multiply=f*g;
			t3.setText(f+" * "+g+"="+multiply);
		}
		else if(e.getSource()==b4)
		{
			int h=Integer.parseInt(t1.getText());
			int i=Integer.parseInt(t2.getText());
			double divide=h/(double)i;
			t3.setText(h+" / "+i+"="+Math.round((divide)*100)/100.0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();
	}

}
