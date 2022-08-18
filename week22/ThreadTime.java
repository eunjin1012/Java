package week22;


class time extends Thread{
	int from, to;
	long sum;
	public time(int from, int to) {
		super();
		this.from = from;
		this.to = to;
	}
	public long getSum() {
		return sum;
	}
	public void setSum(long sum) {
		this.sum = sum;
	}
	public void run() {
		for(int i=from; i<=to; i++)
			sum+=i;
	}
}
public class ThreadTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		time mytime1=new time(1, 30000);
		time mytime2=new time(30001, 60000);
		time mytime3=new time(60001, 90000);
		long my=System.nanoTime();
		mytime1.start();
		mytime2.start();
		mytime3.start();
		try {
			mytime1.join();
			mytime2.join();
			mytime3.join();
		}catch(InterruptedException ie) { }
		long sum=mytime1.getSum()+mytime2.getSum()+mytime3.getSum();
		long t=System.nanoTime();
		
		System.out.println("Thread 합계 = \t\t"+sum);
		System.out.println("실행시간(스레드이용) = \t"+(t-my));
		long sum2=0;
		long t1=System.nanoTime();
		for(int i=1; i<=90000; i++) {
			sum2+=i;
		}
		long t2=System.nanoTime();
		System.out.println("\n전체계산 합계 = \t\t"+sum2);
		System.out.println("실행시간(전체) = \t\t"+(t2-t1));
		
		System.out.println("\n실행시간차이 = \t\t"+((t-my)-(t2-t1)));
	}

}
