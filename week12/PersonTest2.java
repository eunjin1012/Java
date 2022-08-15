package week12;

public class PersonTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer("홍길동", "아산시 호서대학교", "041 540 5114");
		Customer c2=new Customer("이순신", "천안시 호서대학교", 1234, 540);
		System.out.println("객체 1 : \n"+c1);
		System.out.println("객체 2 : \n"+c2);
		Customer c3=new Customer("장영실");
		System.out.println("객체 3 : \n"+c3.name);
	}
	}
