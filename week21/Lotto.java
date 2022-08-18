package week21;

import java.util.*;

public class Lotto {
	
	@Override
	public String toString() {
		return "Lotto 번호(HashSet) = "+set1+"\n"+"Lotto 번호(TreeSet) = "+set2;
	}
	
	HashSet<Integer> set1=new HashSet<Integer>();
	TreeSet<Integer> set2=new TreeSet<Integer>();
	
	public Lotto() {
		int d;
		for(int i=0; i<6; i++) {
			do {
				d=(int)((Math.random()*100.0)+1.0);
			}while(set1.contains(d));
			set1.add(d);
			while(set2.contains(d));
			set2.add(d);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lotto lotto=new Lotto();
		System.out.println(lotto);
	}

}
