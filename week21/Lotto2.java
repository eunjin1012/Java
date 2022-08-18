package week21;

import java.util.*;

public class Lotto2 {
	static int cnt;
	HashSet<Integer> set=new HashSet<Integer>();
	
	
	@Override
	public String toString() {
		return "Lotto "+cnt+" = "+set;
	}

	public Lotto2() {
		int d;
		for(int i=0; i<6; i++)
		{
			do {
				d=(int)((Math.random()*45.0)+1.0);
			}while(set.contains(d));
			set.add(d);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		boolean loop=false;
		char ch;
		do {
			System.out.println("구입 갯수 ?");
			String s=scanner.next();
			Lotto2 lotto=new Lotto2();
			int k=Integer.parseInt(s);
			if(k>20) {
				System.out.println("20장 이상 구입 불가합니다.");
				break;
			}
			for(int i=0; i<k; i++) {
				lotto=new Lotto2();
				cnt=i+1;
				System.out.println(lotto);
			}
			System.out.println("다른 번호를 원하십니까?");
			s=scanner.next();
			ch=s.charAt(0);
			if(ch=='y') loop=true;
			else {
				System.out.println("감사합니다!!!");
				break;
			}
		}while(true);
		scanner.close();
		
	}

}
