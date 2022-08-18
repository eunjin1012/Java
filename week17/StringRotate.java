package week17;

import java.util.Scanner;

public class StringRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자열을 입력하세요.");
		Scanner scanner=new Scanner(System.in);
		String text=scanner.nextLine();
		
		for(int i=0; i<14; i++) {
			String a=text.substring(0,1);
			String b=text.substring(1);
			text=b+a;
			System.out.println(text);
		}
	}

}
