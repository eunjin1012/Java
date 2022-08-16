package week13;

class Complex{
	public int a;
	public int b;
	public Complex(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "(" + a + "+" + b + "i)";
	}
	
}

public class ComplexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1=new Complex(10,20);
		System.out.println("복소수 = "+c1);

	}

}
