
public class MultiThreadingJoinThread {
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			try {
				//System.out.println(Thread.currentThread().getName()); 
				Thread.sleep(500);
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
		MultiThreadingSleep t3 =  new MultiThreadingSleep();
		t1.start();
		try {
			t1.join(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		System.out.println("Name of t1" + t1.getName());
		System.out.println("Name of t1" + t1.getId());
		t1.setName("Swati");
		System.out.println("Name of t1" + t1.getName());
	}

}
