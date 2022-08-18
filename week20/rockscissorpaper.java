package week20;
import java.util.Random;
import java.util.Scanner;
public class rockscissorpaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user;
		String u;
		String com;
		int computer;
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("하나를 선택하시오 : 가위(0), 바위(1), 보(2) : ");
		user=sc.nextInt();
		computer=(int)(Math.random()*3);
		if(computer==0) {
			com="가위";
		}else if(computer==1) {
			com="바위";
		}else {
			com="보";
		}
		System.out.println("컴퓨터는"+com+"를 냈습니다.");
		if((computer==0 && user==1) ||  (computer==1 && user==2) || (computer==2 && user==0)) {
			System.out.println("당신이 이겼습니다.");
		}
	else if(computer==user) {
			System.out.println("비겼습니다.");
		}else {
			System.out.println("당신이 졌습니다.");
		}
		}
	
}

