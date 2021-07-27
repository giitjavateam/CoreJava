
public class MultiThreadingSleep extends Thread {
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		MultiThreadingSleep t1 = new MultiThreadingSleep();
		MultiThreadingSleep t2 =  new MultiThreadingSleep();
		t1.start();
		t2.start();
	}

}
