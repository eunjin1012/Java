package week11;


public class Grade {
	private int math;
	private int science;
	private int english;
	private int average;
	public Grade(int math, int science, int english) {
		super();
		this.math = math;
		this.science = science;
		this.english = english;
		volume();
	}
	private void volume() {
		average=(math+science+english)/3;
	}
	public int getAverage() {
		return average;
	}
	

}
