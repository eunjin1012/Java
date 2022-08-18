package week22;


class Job implements Runnable{
	public void run() {
		for(int n=0; n<10; n++)
			System.out.println(n);
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread j1=new Thread(new Job());
		j1.start();
	}

}
