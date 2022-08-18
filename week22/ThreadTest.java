package week22;

class th extends Thread{
	int from, to;
	long sum;
	public th(int from, int to) {
		super();
		this.from = from;
		this.to = to;
	}
	public long getSum() {
		return sum;
	}
	public void run() {
		for(int i=from; i<=to; i++)
			sum+=i;
	}
}
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		th mythread1=new th(1, 30000);
		th mythread2=new th(30001, 60000);
		th mythread3=new th(60001, 90000);
		mythread1.start();
		mythread2.start();
		mythread3.start();
		try {
			mythread1.join();
			mythread2.join();
			mythread3.join();
		}catch(InterruptedException ie) { }
		long sum=mythread1.getSum()+mythread2.getSum()+mythread3.getSum();
		System.out.println("1부터 30000까지의 합 = \t "+mythread1.getSum());
		System.out.println("30001부터 60000까지의 합 = \t "+mythread2.getSum());
		System.out.println("60001부터 90000까지의 합 = \t "+mythread3.getSum());
		
		System.out.println("총합 = \t\t\t"+sum);
		long sum2=0;
		for(int i=1; i<=90000; i++) {
			sum2+=i;
		}
		System.out.println("총합2 = \t\t\t"+sum2);
	}

}
