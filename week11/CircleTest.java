package week11;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Circle c []=new Circle[3];
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius>>");
			double x=scanner.nextDouble();
			double y=scanner.nextDouble();
			int radius=scanner.nextInt();
			c[i]=new Circle(x, y, radius);
		}
		c[2].show();
		}

}
