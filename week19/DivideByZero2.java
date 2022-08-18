package week19;

import java.util.*;

class DivideByZeroException extends ArithmeticException{
	public DivideByZeroException() {
		super("0으로 나눌 수 없음.");
	}
}
public class DivideByZero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1, number2, result;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		number1=sc.nextInt();
		System.out.print("두 번째 정수 : ");
		number2=sc.nextInt();
		try {
		result=quotient(number1, number2);
		System.out.println(result);
		}
		catch(DivideByZeroException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static int quotient(int numerator, int denominator)
	throws DivideByZeroException
	{
		if(denominator==0)
			throw new DivideByZeroException();
		return numerator/denominator;
	
}
}
