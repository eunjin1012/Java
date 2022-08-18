package week27;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class JSliderEx2 extends JFrame{
	JLabel label=new JLabel("I Love Java");
	JSlider size=new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
	Font font=new Font("고딕체", Font.ITALIC, 1);
	
	public JSliderEx2() {
		setTitle("슬라이더 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		size.setPaintLabels(true);
		size.setPaintTicks(true);
		size.setMajorTickSpacing(20);
		size.setMinorTickSpacing(5);
		size.addChangeListener(new MyChangeListener());
		c.add(size, BorderLayout.NORTH);
		
		label.setFont(font);
		label.setHorizontalAlignment(JSlider.CENTER);
		c.add(label, BorderLayout.CENTER);
		
		setSize(600, 250);
		setVisible(true);
	}
	class MyChangeListener implements ChangeListener{
		public void stateChanged(ChangeEvent e) {
		JSlider size=(JSlider)e.getSource();
		label.setForeground(Color.ORANGE);
		Font newFont=new Font("Ariel", Font.PLAIN,size.getValue());
		label.setFont(newFont);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JSliderEx2();
		}

}
