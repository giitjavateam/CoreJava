class Table extends Thread{
	synchronized void printTable(int n){
		 
		for(int i=0; i<n; i++)
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
public class SynchronizedMethodByAnnonymousClass{
	public static void main(String args[])
	{
		final Table obj = new Table();
		
		
		Thread t= new Thread() {
			public void run()
			{
				obj.printTable(5);
			}
		};
		Thread t1= new Thread() {
			public void run()
			{
				obj.printTable(15);
			}
		};
		t.start();
		t1.start();
	}
	
}
