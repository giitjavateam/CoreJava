
public class ExceptionHandlingCustomException {
	
	static void validate(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			
			throw new InvalidAgeException("Not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
	}
	public static void main(String args[])
	{
		try {
			validate(12);
			
		}catch(Exception e)
		{
			System.out.println("Exception occured " + e);
		}
		
		System.out.println("Rest of the code");
	}

}
