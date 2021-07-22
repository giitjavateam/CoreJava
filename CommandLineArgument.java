/**
 * This class implements command line argument.
 * @author Swati Singhal
 * @version 1.0
 *
 */
public class CommandLineArgument {
	public static void main(String args[])
	{
		System.out.println("Command line argumnet" + args[0]);
		System.out.println("Multiple Command line argumnet");
		for(int i=0;i<args.length;i++) 
		{
			System.out.println(args[i]);  
		}
	}

}
