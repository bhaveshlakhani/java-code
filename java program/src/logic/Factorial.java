package logic;

import java.util.Scanner;

public class Factorial 
{
	
	public static void main(String[] args) {
	
		int f;
		Scanner c=new Scanner(System.in);
		System.out.println("enter a number");
		f=c.nextInt();
		int x=1;
		
		
		for(int i=1;i<=f;i++)
		
		{
		x=x*i	;
			
		}
		
		System.out.println("factorial value "+x);
		
	// using while loop	
		
	/*	while(f!=0)
			
	{
			 
			 x=x*f;
			 f--;
		}
		System.out.println("factoral value ="+x);
		
		*/
		
		
	}
	
}
