
public class MultiThreadingPriority extends Thread{
	public void run()
	{
		System.out.println("Running thread name" + Thread.currentThread().getName());
		System.out.println("Running thread priotity" + Thread.currentThread().getPriority());
	
	}
	public static void main(String args[])
	{
		MultiThreadingPriority m1 = new MultiThreadingPriority();
		MultiThreadingPriority m2 = new MultiThreadingPriority();
		
		m1.setPriority(Thread.MIN_PRIORITY);
		//m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		m2.start();
	}
}
