package ds.practice.patterns;

import java.util.Scanner;

public class LeftDiamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1 ; i<=n/2 ; i++)
		{
			for(int j =1; j<=n/2-i; j++)
			{
				System.out.print(" ");
			}
			for(int j =1 ; j <=i ; j++)
			{
					System.out.print("*");
			}		
			System.out.println();
		}
		for(int i = (n/2) ; i>=1 ; i--)
		{
			for(int j = 0; j <= (n/2-i) ;j++) {
				System.out.print(" ");
			}
			for(int j =1 ; j <i ; j++)
			{
					System.out.print("*");
			}		
			System.out.println();
		}

	}

}
