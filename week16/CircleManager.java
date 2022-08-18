package week16;

public class CircleManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle(1,3,5);
		Circle c2=new Circle(-3,1,4);
		Circle c3=new Circle(10,13,5);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c3.equals(c2));
	}

}
class Circle{
	int x;
	int y;
	int radius;
	public Circle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public boolean equals(Object obj) {
		Circle c=(Circle)obj;
		if(this.radius==c.radius)return true;
		else return false;
		
	}
}
