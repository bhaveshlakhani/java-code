package pattern;

import java.util.Scanner;

public class Pattern13 {
	public static void main(String[] args) {
		
		Scanner c =new Scanner(System.in);
		System.out.println("enter a number");
		int n=c.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.printf("%c",'A'+j);
				
			}
			System.out.println();
		}
	}

}
