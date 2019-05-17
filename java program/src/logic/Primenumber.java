package logic;

import java.util.Scanner;

public class Primenumber {

	
	public static void main(String[] args) {
		
		System.out.println("enter a number");
		Scanner c=new Scanner(System.in);
		int a=c.nextInt();
		int d=0;
		
    for(int i=2;i<a;i++)
    {
	
	  if(a%i==0)
	    {
	     	d++;
	    }
	
    }

if(d==0)
{
	System.out.println("prime");
	} 


else
	
{
	System.out.println("not prime");
	
	
	
}
	


 }
	
	
}
	
