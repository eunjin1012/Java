package week15;

public class Rect implements Shape {
	private int width, height;


	public Rect(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print(width+"x"+height+"크기의 사각형 입니다.");
		System.out.println("");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

}
