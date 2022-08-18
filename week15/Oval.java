package week15;

public class Oval implements Shape{
	private int width, height;

	public Oval(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print(width+"x"+height+"에 내접하는 타원입니다.");
		System.out.println("");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height*PI;
	}

}
