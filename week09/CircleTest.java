package week09;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle myCircle1=new Circle(2.8);
		Circle myCircle2=new Circle();
		Circle myCircle3=new Circle();
		double vol=myCircle1.radius;
		double vol2=myCircle2.radius*myCircle2.radius*myCircle2.PI;
		double vol3=myCircle3.radius*2*myCircle3.PI;
		System.out.println("반지름 = "+vol);
		System.out.println("원의 면적 = "+vol2);
		System.out.println("원의 둘레 = "+vol3);
	}

}
