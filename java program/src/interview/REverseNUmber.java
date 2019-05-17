package interview;

import java.util.Scanner;

public class REverseNUmber {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scn.nextInt();
		int digit;
		int reverse=0;
		
		while(num>0)
		{
		
			digit=num%10;
			num=num/10;
			reverse=reverse*10+digit;
			
			
	}

		System.out.println("reverse number is:"+reverse);
	}

}
