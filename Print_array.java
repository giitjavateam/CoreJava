import java.util.Scanner;

public class Print_array {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	int a[] = {1, 2,3};
	for(int i=0; i<n; i++)
	{
		arr[i] = sc.nextInt();
	}
	for(int i=0; i<n; i++)
	{
		System.out.println(arr[i]);
	}
	for(int i: a)
	{
		System.out.println(i);
	}
	}
}
