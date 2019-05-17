package logic;

import java.util.Scanner;

public class SwapWithoutThird 
{
	 static void swap(int arg1,int arg2)
	 {
		 arg1=arg1+arg2;
		 arg2=arg1-arg2;
		 arg1=arg1-arg2;
		 
		 System.out.println("after Swapin value of n1= "+arg1);
		 System.out.println("after Swapin value of n2= "+arg2);
		 
	 }

	public static void main(String[] args) 
	{
		Scanner c=new Scanner(System.in);
		System.out.println("enter a first number");
		int n1=c.nextInt();
		
		System.out.println("enter second number");
		
        int n2=c.nextInt();
        System.out.println("value of n1= "+n1);
        System.out.println("value of n2= "+n2);
        swap(n1,n2);
        
	}

}
