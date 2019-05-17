package logic;

import java.util.Scanner;

public class Devide11 {


	public static void main(String[] args)
	{
		Scanner c=new Scanner(System.in);
		
		System.out.println("enter a number");
		
		int n=c.nextInt();
		int t=n,c1=0;
	    while(t!=0)
	    {
	    	 t=t/10;
	    	 c1++;
	    }
	    
	    int a[]=new int[c1];
	    int b[]=new int[c1];
	    int sum=0;
	    int sum1=0;
	    for(int i=0;i<c1;i++)
	    {
	    	 a[i]=n%10;
	    	 n/=10;
	    }
	    
	    
	    for(int i=0;i<c1;i++)
	    {
	    	System.out.println(a[i]);
	    }
	    for(int i=0;i<c1;i=i+2)
	    {
	    	sum=sum+b[i];
	    }
	    for(int i=1;i<c1;i=i+2)
	    {
	    	sum1=sum1+b[i];
	    }
	    
	    if((sum-sum1)==0 || (sum-sum1)==11 ||(sum-sum1)==-11)
	    {
	    	System.out.println("number is divisible by 11");
	    }
	    else
	    {
	    	System.out.println("not divisible"); 
	    }
	    
	}

}
