package week09;

public class Plane {
	private int num;
	private String model;
	private int pnum;
	public Plane(int num, String model, int pnum) {
		super();
		this.num = num;
		this.model = model;
		this.pnum = pnum;
		System.out.println("식별번호 :"+num+"모델 : "+model+"승객수 : "+pnum);
	}
	public Plane(int num, String model) {
		super();
		this.num = num;
		this.model = model;
		this.pnum=0;
		System.out.println("식별번호 :"+num+"모델 : "+model+"승객수 : "+pnum);
	}
	public Plane() {
		super();
		this.num=3;
		this.model="cc";
		this.pnum=150;
		System.out.println("식별번호 :"+num+"모델 : "+model+"승객수 : "+pnum);
		
	}
	private int planes=0;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public int getPlanes() {
		return planes;
	}
	public void setPlanes(int planes) {
		this.planes = planes;
	}
	
	
}
