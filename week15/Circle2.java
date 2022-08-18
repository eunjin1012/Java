package week15;

public class Circle implements Shape {
	 private int radius;
	 

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print("반지름이"+radius+"인 원입니다.");
		System.out.println("");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius*radius*PI;
	}
	

}
