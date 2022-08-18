package week20;

class Pair<T>{
	private T t1;
	private T t2;
	public Pair(T t1, T t2) {
		this.t1=t1;
		this.t2=t2;
	}
	public T first() {return t1;}
	public T second() {return t2;}
	
}
public class PairTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Integer>p1=new Pair<>(10, 20);
		Pair<Double>p2=new Pair<>(10.0, 20.0);
		
		System.out.println(p1.first());
		System.out.println(p2.second());
	}

}
