//By default, Checked Exceptions are not forwarded in calling chain (propagated).
public class ExceptionHandlingExceptionPropogation {
	void m()
	{
		String str = null;
		System.out.println(str.length());
	}
	void n()
	{
		m();
	}
	void p()
	{
		try {
			n();
			
		}catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String args[])
	{
		ExceptionHandlingExceptionPropogation obj = new ExceptionHandlingExceptionPropogation();
		obj.p();
		
	}

}
