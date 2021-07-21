import java.util.Scanner;

public class Test_Arrayclassname {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		Class c = arr.getClass();
		String name = c.getName();
		System.out.println(name);
	}
}
