package logic;

import java.util.Scanner;

public class Leapyear 
{
	public static void main(String[] args)
	{
		int year;
		
		Scanner c=new Scanner(System.in);
		System.out.println("enter a year");
		year=c.nextInt();
		
		if(year%4==0 && year%400==0)
		{
			System.out.println("it is leap year");
		}
		else if(year%100==0)
		{
			 System.out.println("not a leap year");
		}
		
		else 
		{
			 System.out.println("it is not a leap year");
		}
		
		
		
	}

}
