
public class MultiThreadingCreateThread1 implements Runnable {
	public void run()
	{
		System.out.println("Thread is running");
		
	}
	public static void main(String args[])
	{
		
		MultiThreadingCreateThread1 m = new MultiThreadingCreateThread1();
		Thread t1 = new Thread(m);
		t1.start();
		System.out.println("Hi");  
	}
}
	

