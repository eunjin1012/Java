package week27;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxEx extends JFrame{
	JComboBox<String> box=new JComboBox();
	
	public ComboBoxEx() {
		setTitle("콤보박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField Textinput=new JTextField(10);
		Textinput.addActionListener(new MyActionListener());
		c.add(Textinput);
		c.add(box);
		
		setSize(300, 250);
		setVisible(true);
	}
	public class MyActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			JTextField text=(JTextField)e.getSource();
			box.addItem(text.getText());
			text.setText("");
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComboBoxEx();
	}

}
