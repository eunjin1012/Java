package week09;


public class Rectangle {
	private int z;
	private int q;
	public Rectangle(int z, int q) {
		super();
		this.z = z;
		this.q = q;
	}
	public int area() {
		return (q-z);
	}
	public void show() {
		System.out.println("("+z+","+q+")");
		System.out.println("넓이는"+area());
	}
}
