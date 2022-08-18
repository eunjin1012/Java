package week19;

import java.util.Scanner;

class NegativeNumberException extends Exception{
	
	
	public NegativeNumberException(String a) {
		System.out.println("NegativeNumberException : "+a);
	}
	
}
class ArithmeticException extends Exception{
	public ArithmeticException(String b) {
		System.out.println(""+b);
	}
}
public class score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[3];
		Scanner sc=new Scanner(System.in);
		int total=0;
		try {
			System.out.print("정수의 개수 : ");
			int score=sc.nextInt();
			if(score==0) {
				throw new ArithmeticException("by zero 산술 오류");
			}
			
			for(int i=0; i<3; i++) {
				System.out.print("정수를 입력하세요 : ");
				arr[i]=sc.nextInt();
				if(arr[i]<0) {
					throw new NegativeNumberException("음수 입력 오류");
				}
			}
			for(double j:arr)
				total+=j;
			System.out.println("평균은"+(total/3));
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		catch(NegativeNumberException e) {
			System.out.println(e.toString());
		}
	}

}
