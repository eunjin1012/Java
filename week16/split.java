package week16;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="a,b,c";
		
		String str2[]=str1.split(",");
		
		for(String str : str2) {
			System.out.println(str);
		}
	}

}

