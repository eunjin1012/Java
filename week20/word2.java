package week20;

import java.util.*;

public class word2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String s;
		int cnt;
		System.out.println("문자열을 입력하시요 : ");
		s=sc.nextLine();
		StringTokenizer str=new StringTokenizer(s);
		StringTokenizer str2=new StringTokenizer(s);
		cnt=str.countTokens();
		String[] arr=new String[cnt];
		for(int i=0; i<cnt; i++) {
			System.out.println(str.nextToken());
		}
		for(int i=0; i<cnt; i++) {
			arr[i]=str2.nextToken();
		}
		System.out.println("모두 "+cnt+"개의 단어가 있습니다.");
		
		System.out.println("=========== 정렬 후 데이터 ===========");
		Arrays.sort(arr);
		System.out.print("[");
		for(int i=0; i<cnt; i++) {
			System.out.print(","+arr[i]);
		}
		System.out.print("]");
	}

}
