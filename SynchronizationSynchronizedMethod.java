class Table extends Thread{
	synchronized void printTable(int n)
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
class MyThread1 extends Thread{
	
	Table t;
	MyThread1(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable(5);
	}
}

class MyThread2 extends Thread{
	Table t1;
	MyThread2(Table t1){
		this.t1 = t1;
	}
	public void run()
	{
		t1.printTable(100);
	}
}
public class SynchronizationSynchronizedMethod {
	public static void main(String args[])
	{
		Table obj = new Table();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		
		t1.start();
		t2.start();
	}
	

}
