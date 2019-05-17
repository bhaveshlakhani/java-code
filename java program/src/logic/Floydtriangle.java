package logic;

import java.util.Scanner;

public class Floydtriangle
{
public static void main(String[] args)
{
	
    Scanner c =new Scanner(System.in);
	int n=c.nextInt();
	int cn=0;
	
	for(int i=1;i<n;i++)
	{
		
		
		for(int j=1;j<=i;j++)
		{
		    cn++;
			System.out.print(cn);
			
		}
		
     System.out.println();
	}	
}
	
}
