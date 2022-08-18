package week22;

class job3 extends Thread{
	String sr="Thread : ";
	public job3() { }
	public job3(String sr) {
		super();
		this.sr = sr;
	}
	public void run() {
		for(int i=0; i<=9; i++) {
			System.out.println(sr+i);
		}
	}
}
public class JobTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t2=new job3();
		t2.start();
		
		
	}

}
