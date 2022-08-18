package week19;

import java.util.*;
class NotExistIDException extends Exception{
	
	
	public NotExistIDException(String a) {
		System.out.println("NotExistIDException : "+a);
	}
	
}
class WrongPasswordException extends Exception{
	public WrongPasswordException(String b) {
		System.out.println(b);
	}
}

public class Member {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id, passwd;
		try {
		
	
		
			Scanner sc=new Scanner(System.in);
			System.out.print("ID 입력 : ");
			id=sc.nextLine();
			
			if(id=="0") {
				throw new NotExistIDException("ID가 없음");
			}
		
		
			System.out.print("Password 입력 : ");
			passwd=sc.nextLine();
			if(passwd!="0") {
				throw new WrongPasswordException("Password가 잘못됨");
			}
		
			}catch(NotExistIDException e) {
				System.out.println(e.toString());
			}catch(WrongPasswordException e) {
				System.out.println(e.toString());
			}
		
		}
			}
		
	

