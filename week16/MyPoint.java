package week16;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint a=new MyPoint(3,20);
		System.out.println(a);
		
	}

}

class MyPoint{
	int a, b;

	public MyPoint(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "MyPoint (" + a + ", "+b + ")";
	}
	
}
