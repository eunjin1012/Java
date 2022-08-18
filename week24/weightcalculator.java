package week24;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator2 extends JFrame implements ActionListener{
	
	private static final long serialVersionUID=1L;
	
	Button b1;
	JTextField t1, t2, t3;
	JLabel s1, s2, s3, s4, s5;
	
	public Calculator2() {
		setSize(350, 200);
		setLayout(new BorderLayout());
		setTitle("체중 계산");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel pg=new JPanel(new GridLayout(2, 3));
		
		s1=new JLabel("키는?");
		s2=new JLabel("체중은?");
		s3=new JLabel("cm");
		s4=new JLabel("kg");
		s5=new JLabel("결과 출력");
		
		t1=new JTextField(10);
		t2=new JTextField(10);
		
		b1=new Button("체중 계산");
		
		b1.addActionListener(this);
		
		pg.add(s1);
		pg.add(t1);
		pg.add(s3);
		
		pg.add(s2);
		pg.add(t2);
		pg.add(s4);
		
		p1.add(b1);
		
		p2.add(s5);
		
		add(pg, BorderLayout.NORTH);
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int height, weight;
		if(e.getSource()==b1) {
			height=Integer.parseInt(t1.getText());
			weight=Integer.parseInt(t2.getText());
			double stand=(height-100)*0.9;
			s5.setOpaque(true);
			if(weight<stand) {
				s5.setBackground(Color.YELLOW);
				s5.setText("저체중입니다.");
			}
			else if(weight==stand) {
				s5.setBackground(Color.GREEN);
				s5.setText("표준 체중입니다.");
			}
			else {
				s5.setBackground(Color.RED);
				s5.setText("과체중입니다.");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator2();
	}

}
