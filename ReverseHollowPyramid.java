package ds.practice.patterns;

import java.util.Scanner;

public class ReverseHollowPyramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		for(int i = r ; i>=1 ; i--)
		{
			for(int j =1; j<=r-i; j++)
			{
				System.out.print(" ");
			}
			for(int j =1 ; j<=2*i-1; j++)
			{
				if(i == r) 
				{
					System.out.print("*");
				}
				else
				{
					if(j == 1 || j == i*2-1)
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

	}

}
