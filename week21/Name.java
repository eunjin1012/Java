package week21;

import java.util.*;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fruit= {"orange", "banana", "apple", "plum", "pear"};
		LinkedList<String> name=new LinkedList<String>(Arrays.asList(fruit));
		
		Iterator<String> it=name.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		
		}
	}

}
