class Table1{
	synchronized static void printTable(int n)
	{
		for(int i=1; i<5; i++)
		{
		System.out.println(n*i);
		}
		
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class SynchronizationStatic{
	public static void main(String args[])
	{
		Thread t = new Thread()
		{
			public void run()
			{
				Table1.printTable(1);
			}
		};

		Thread t1 = new Thread()
		{
			public void run()
			{
				Table1.printTable(5);
			}
		};

		Thread t2 = new Thread()
		{
			public void run()
			{
				Table1.printTable(20);
			}
		};

		Thread t3 = new Thread()
		{
			public void run()
			{
				Table1.printTable(100);
			}
		};
		t.start();
		t1.start();
		t2.start();
		t3.start();
	}

}
