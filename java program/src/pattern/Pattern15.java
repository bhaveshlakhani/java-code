package pattern;

import java.util.Scanner;

public class Pattern15 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner c=new Scanner(System.in);
		int n=c.nextInt();
		int count=0;
		int count1=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				count++;
				System.out.print(count);
				
			}
			System.out.println();
		}
		
		System.out.println("enter m");
		int m=c.nextInt();
		for(int i=1;i<=m;i++)
		{
			for(int j=i;j<=m;j++)
			{
				count1++;
				System.out.print(count1);
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
