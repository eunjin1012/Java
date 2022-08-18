package week21;
import java.util.*;

public class HashSetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> low=new HashSet<Integer>();
		HashSet<Integer> even=new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			low.add(new Integer(i));
			even.add(new Integer(i*2));
		}
		System.out.println("low 집합 : "+low);
		System.out.println("even 집합 : "+even);
		HashSet<Integer> union=new HashSet<Integer>(low);
		HashSet<Integer> difference=new HashSet<Integer>(low);
		HashSet<Integer> intersection=new HashSet<Integer>(low);
		union.addAll(even);
		difference.removeAll(even);
		intersection.retainAll(even);
		System.out.println("합 집합 : "+union);
		System.out.println("차 집합 : "+difference);
		System.out.println("교 집합 : "+intersection);
	}

}
