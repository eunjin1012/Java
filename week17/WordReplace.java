package week17;

import java.util.Scanner;

public class WordReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String text="우리는 호서대학교를 사랑합니다";
		System.out.println("문자열 : "+text);
		StringBuffer sb=new StringBuffer(text);
		
		while(true){
			System.out.print("입력 : ");
			String word=scanner.next();
			
			if(word.equals("stop")) {
				System.out.println("종료합니다.");
				break;
			}
			
			String ss[]=word.split(":");
			
			if(ss.length!=2)
				System.out.println(sb.toString());
			
			else {
				if(ss[0].length()==0 || ss[1].length()==0) {
					System.out.println("찾을 수 없습니다!");
					continue;
					
				}
				
				int index=sb.indexOf(ss[0]);
				if(index==-1) {
					System.out.println("찾을 수 없습니다!");
					continue;
				}
				
				sb.replace(index,  index+ss[0].length(), ss[1]);
				System.out.println(sb.toString());
			}
		}
		
		scanner.close();
	}

}
