package week22;

class Job2 extends Thread{
	public void run() {
		for(int j=0; j<10; j++) {
			System.out.println(j);
		}
	}
}
public class Jobclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job2 j1=new Job2();
		j1.start();
		
	}

}
