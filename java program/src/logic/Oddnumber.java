package logic;

import java.util.Scanner;

public class Oddnumber {

	public static void main(String[] args)
	{
		Scanner c=new Scanner(System.in);
		System.out.println("enter a number");
	
		int n=c.nextInt();
		for(int i=1;i<=n;i=i+2)
		{
			System.out.println(i);
		}
		

	}

}
