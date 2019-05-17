package logic;

import java.util.Scanner;

public class Uppercase
{

	public static void main(String[] args) 
	{
	
		System.out.println("enter a string ");
		
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		
		char[] arr=s.toCharArray();//converting into char array
		
		char[] temp=new char[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			
			int a=arr[i];
			
			temp[i]= (char) (a-32);
	         
					
		}
		System.out.println("uppercasr string");
		
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(temp[i]);
		}
		
	}
}
