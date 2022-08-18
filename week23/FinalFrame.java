package week23;

import java.awt.*;
import javax.swing.*;

class FirstPanel extends Panel{
	public FirstPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new GridLayout(3, 1));
		add(new Button("Open"));
		add(new Button("Read"));
		add(new Button("Close"));
		
	}
}
class SecondPanel extends Panel{
	public SecondPanel() {
		Label a=new Label("Java", Label.CENTER);
		a.setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		add(a, BorderLayout.CENTER);
	}
}
public class FinalFrame2 extends JFrame{

	public FinalFrame2() {
		super("실습 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 2));
		add(new FirstPanel());
		add(new SecondPanel());
		setSize(300, 200);
		setVisible(true);
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FinalFrame2();
	}

}
