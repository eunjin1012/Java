package week20;


class Box<T>{
	private T t;
	public T get() {return t;}
	public void set(T t) {this.t=t;}
	}


public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> i =new Box<>();
		i.set(100);
		System.out.println(i.get());
		
		Box<String> s=new Box<>();
		s.set("Hello!");
		System.out.println(s.get());
		
	}

}
