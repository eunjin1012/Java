package week17;

public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="냉장고";
		String s2=",세탁기";
		String s3=",에어컨";
		String s4=",TV";
		String s5=",오디오";
		String s6=",컴퓨터";
		
		s1=s1.concat(s2);
		s1=s1.concat(s3);
		s1=s1.concat(s4);
		s1=s1.concat(s5);
		s1=s1.concat(s6);
		
		String ss[]=s1.split(",");
		for(String s:ss)
			System.out.println(s);
	}

}
