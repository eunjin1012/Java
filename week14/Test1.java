package week14;

abstract class MyPoint{
	int x;
	int y;
	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	protected abstract void move(int x, int y);
	protected abstract void reverse();
	protected void show() {
		System.out.println(x+","+y);
	}
}
class MyColorPoint extends MyPoint{
	String color;
	
	public MyColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	protected void move(int x1, int y1) {
		System.out.println("4"+","+"3");
		}
	protected void reverse() {
		System.out.println(color);
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p=new MyColorPoint(2,3,"blue");
		p.move(3, 4);
		p.reverse();
		p.show();
	}

}
