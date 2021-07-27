
public class MultithreadingDaemonThread extends Thread {

	public void run()
	{
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Deamon Thread working");
		}
		else
		{
			System.out.println("User Thread working");
		}
	}
	public static void main(String args[])
	{
		MultithreadingDaemonThread t1 = new MultithreadingDaemonThread();
		MultithreadingDaemonThread t2 =  new MultithreadingDaemonThread();
		MultithreadingDaemonThread t3 =  new MultithreadingDaemonThread();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		
	}

}



