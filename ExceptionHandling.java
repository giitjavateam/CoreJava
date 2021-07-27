
public class ExceptionHandling {
	public static void main(String args[])
	{
		try {
		int data = 100/0;
		System.out.println("After exception");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("After throwing Exception");
		}
		System.out.println("Rest of the code");
	}

}
