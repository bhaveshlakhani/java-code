package logic;

import java.util.Scanner;

class Simpleinterest 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		System.out.println("enter a invested money");

		Scanner c=new Scanner(System.in);

		int a=c.nextInt();

		System.out.println("enter a interest rate");

		int r=c.nextInt();

		System.out.println("enter a time period in year");

		float f=c.nextFloat();


		int i=(int) (a *r * f/ 100);

		System.out.println("simple interest is:"+ i);

	}
}
