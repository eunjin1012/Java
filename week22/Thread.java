package week22;


class MyThread extends Thread{
	String sr;
	public MyThread(String sr) {
		this.sr=sr;
	}
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(sr);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {}
		}
	}
}
public class Thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1=new MyThread("Thread ~");
		t1.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("Main thread~");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {}
		}
	}

}
