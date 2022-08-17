package week14;

import java.util.Scanner;

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String srcString();
	abstract protected String destString();
	protected double ratio;
	
	public void run(){
		Scanner scanner=new Scanner(System.in);
		System.out.println(srcString()+"을"+destString()+"로 바꿉니다.");
		System.out.print(srcString()+"을 입력하세요>>");
		double val=scanner.nextDouble();
		double res=convert(val);
		System.out.println("변환 결과 : "+res+destString()+"입니다.");
		scanner.close();
	}
}

class C2F extends Converter{
	int a;
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	protected double convert(double val) {
		return val*1.8+32;
	}
	protected String srcString() {
		return "섭씨온도";
	}
	protected String destString() {
		return "화씨온도";
	}
	
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2F toF=new C2F();
		toF.run();
	}

}
