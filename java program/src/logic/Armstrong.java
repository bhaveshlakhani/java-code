package logic;

import java.util.Scanner;

public class Armstrong 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner c=new Scanner(System.in);
		
		System.out.println("enter a number");
        int a=c.nextInt();
        
        int temp=a;
        
       int  sum=0;
       
       
        while(a!=0)
        {
        	
        	int d=a%10;
        	sum=sum+d*d*d;
        	a=a/10;
        	 
        }
        if(sum==temp)
        {
        	System.out.println("it is armstrong number");
        }
        
        else
        {
        	System.out.println("not armstrong");
        }
	}

}
