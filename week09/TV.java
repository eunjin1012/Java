package week09;

public class TV {
	private String company;
	private int year;
	private int inch;



	public TV(String company, int year, int inch) {
		super();
		this.company = company;
		this.year = year;
		this.inch = inch;
	}



	public void show() {
		System.out.println(company+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}

}
