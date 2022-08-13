package week09;

public class Box {
	public int width;
	public double height;
	
	public Box(int width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public void show()
	{
		System.out.println(width);
		System.out.println(height);
	}
}
