package week14;

abstract class Fruit{
	abstract protected String abcstring();
	protected void print() {
		System.out.println("나는 "+abcstring()+"이다");
	}
}
class Grape extends Fruit{
	protected String abcstring() {
		return "포도";
	}
}
class Apple extends Fruit{
	protected String abcstring() {
		return "사과";
	}
}

class Pear extends Fruit{
	protected String abcstring() {
		return "배";
	}
}

public class AbstractTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit fAry[]= {new Grape(), new Apple(), new Pear()};
		for(Fruit f : fAry)
			f.print();
	}

}
