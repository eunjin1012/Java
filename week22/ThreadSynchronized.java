package week22;

class number extends Thread{
	String st;
	
	
	public number(String st) {
		super();
		this.st = st;
	}

	public void run() {
		for(int i=0; i<10; i++)
			System.out.println(st+i);
	}
}
public class ThreadSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
		number t1=new number("1st Thread : ");
		number t2=new number("2nd Thread : ");
		
		
		t1.start();
		t2.start();
		
	}

}
