
public class SynchronizationInterThreadCommunocation {
	int ammount = 1000;
	synchronized void withdraw(int ammount)
	{
		System.out.println("goint to withdraw..");
		
		if(this.ammount < ammount)
		{
			System.out.println("Less balance; waiting for deposit");
			try {
				wait();
			}catch(Exception e) {
			}
		}
		
		this.ammount-= ammount;
		
		System.out.println("withdraw completed");
	}
	synchronized void deposit(int ammount)
	{
		System.out.println("going to deposit..");
		this.ammount += ammount;
		System.out.println("deposit completed");
		notify();
	}
	
	public static void main(String args[])
	{
		SynchronizationInterThreadCommunocation c = new SynchronizationInterThreadCommunocation();
		
		new Thread() {
			public void run() {
				c.withdraw(1100);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(2000);
			}
		}.start();
	}
}
