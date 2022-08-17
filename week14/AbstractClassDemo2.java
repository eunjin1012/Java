package week14;

abstract class Shape{
	abstract void draw();
	abstract double findArea();
	}

class Circle extends Shape{
	double radius;
	

	public Circle(double radius) {
		
		this.radius = radius;
	}
	void draw() {
		System.out.println("원을 그리다.");
	}
	double findArea() {
		return radius*radius*3.14;
	}

}
class Rectangle extends Shape{
	double w;
	double h;
	
	
	
	public Rectangle(double w, double h) {
		
		this.w = w;
		this.h = h;
	}
	void draw() {
		System.out.println("사각형을 그리다.");
		
	}
	double findArea() {
		return w*h;
	}
	
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Circle(3);
		s.draw();
		System.out.println("원의 넓이는 "+s.findArea());
		s=new Rectangle(3,4);
		s.draw();
		System.out.println("사각형의 넓이는"+s.findArea());
	}

}
