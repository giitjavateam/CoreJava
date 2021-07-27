
public class MultiThreadingCreateThread extends Thread {
	
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String args[])
	{
		MultiThreadingCreateThread t = new MultiThreadingCreateThread();
		t.start();
	}
}
