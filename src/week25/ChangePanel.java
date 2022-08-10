package week25;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
	
public class ChangePanel extends JFrame implements ActionListener{
	private static final long serialVersionUID=1L;
	JPanel p1, p2, p3;
	JButton red, green, yellow, end;
	JTextField tf;
	GridLayout gb;
	
	
	
	public ChangePanel() {
		
		super("ActionEvent Test2");
		setSize(300, 200);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gb=new GridLayout(3,1,5,5);
		setLayout(gb);
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p2.setLayout(new GridLayout(1,4,5,5));
		tf=new JTextField(25);
		tf.setEditable(false);
		p1=new JPanel();
		
		
		
		red=new JButton("빨강");
		red.setBackground(Color.RED);
		green=new JButton("초록");
		green.setBackground(Color.GREEN);
		yellow=new JButton("노랑");
		yellow.setBackground(Color.YELLOW);
		end=new JButton("종료");
		end.setBackground(Color.CYAN);
		red.addActionListener(this);
		green.addActionListener(this);
		yellow.addActionListener(this);
		end.addActionListener(this);
		
		tf.setEditable(false);
		
		p2.add(red);
		p2.add(green);
		p2.add(yellow);
		p2.add(end);
		p3.add(tf);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==red)
			{
			p1.setBackground(Color.RED);
			tf.setText("빨강이 선택되었습니다.");
			}
		else if(e.getSource()==green)
			{
			p1.setBackground(Color.GREEN);
			tf.setText("초록이 선택되었습니다.");
			}
		else if(e.getSource()==yellow)
		{
			p1.setBackground(Color.YELLOW);
			tf.setText("노랑이 선택되었습니다.");
		}
		else
		{
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChangePanel();
	}

}
