package week21;

import java.util.*;

public class HashSetTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d;
		LinkedHashSet <Integer> low=new LinkedHashSet<Integer>();
		LinkedHashSet <Integer> even=new LinkedHashSet<Integer>();
		
		
		for(int i=0; i<10; i++)
		{
			do {
				d=(int)((Math.random()*100.0)+1.0);
			}while(low.contains(d));
			low.add(d);
			System.out.print(" low"+d);
			
			do {
				d=(int)((Math.random()*100.0)+1.0);
			}while(even.contains(d));
			even.add(d);
			System.out.print(" even"+d);
			
		}
		
		System.out.println();
		
		LinkedHashSet <Integer> union=new LinkedHashSet<Integer>(low);
		
		union.addAll(even);
		
		System.out.println();
		
		System.out.println("LinkedHashSet을 이용한 합집합");
		System.out.println();
		System.out.println("low 집합 : "+low);
		System.out.println("even 집합 : "+even);
		System.out.println();
		System.out.println("union 합집합 : "+union);
		
	}
	

}
