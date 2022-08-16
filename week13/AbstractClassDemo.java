package week13;

abstract class Shape{
	abstract void draw();
	}

class Circle extends Shape{
	double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	void draw() {
		System.out.println("원을 그리다.");
	}
	void findArea() {
		System.out.println(radius*radius*3.14);
	}
}
class Rectangle extends Shape{
	double w;
	double h;
	
	public Rectangle(double w, double h) {
		super();
		this.w = w;
		this.h = h;
	}
	void draw() {
		System.out.println("사각형을 그리다.");
		
	}
	void findArea() {
		System.out.println(w*h);
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
