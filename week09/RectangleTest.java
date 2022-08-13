package week09;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point(10,20);
		Point p2=new Point(21,35);
		
		Rectangle r=new Rectangle(10,20);
		r.show();
		System.out.println("");
		
		Point p3=new Point(15,20);
		Point p4=new Point(25,35);
		
		Rectangle s=new Rectangle(25,35);
		s.show();
		System.out.println("");
		
		if(r.equals(s))
			System.out.println("사각형의 면적이 같다!!");
		else
			System.out.println("사각형의 면적이 다르다!!");
	}

}
