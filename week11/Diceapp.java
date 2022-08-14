package week11;

import java.util.Scanner;

public class Dicapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary myDictionary=new Dictionary();
		Scanner scanner=new Scanner(System.in);
		System.out.println("한영, 영한 단어 검색 프로그램(종료시 stop입력)");
		while(true) {
			System.out.print("찾을 단어? ");
			String a=scanner.nextLine();
			
			if(!(a.equals("사랑")||(a.equals("아기")||
					(a.equals("돈")||(a.equals("미래")||
							(a.equals("희망")||(a.equals("love")||
									(a.equals("baby")||(a.equals("money")||
											(a.equals("future")||(a.equals("hope"))))))))))))
				System.out.println(a+"는 저의 사전에 없습니다.");
			if(a.equals("stop")) {
				System.out.println("프로그램을 종료합니다 !");
				break;
					
			}
			if(a.equals("사랑"))
				System.out.println(a+"은"+"love");
			else if(a.equals("아기"))
				System.out.println(a+"은"+"baby");
			else if(a.equals("돈"))
				System.out.println(a+"은"+"money");
			else if(a.equals("미래"))
				System.out.println(a+"은"+"future");
			else if(a.equals("희망"))
				System.out.println(a+"은"+"hope");
			else if(a.equals("love"))
				System.out.println(a+"은"+"사랑");
			else if(a.equals("baby"))
				System.out.println(a+"은"+"아기");
			else if(a.equals("money"))
				System.out.println(a+"은"+"돈");
			else if(a.equals("future"))
				System.out.println(a+"은"+"미래");
			else if(a.equals("hope"))
				System.out.println(a+"은"+"희망");
		}
	}

}
