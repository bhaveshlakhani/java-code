package logic;

import java.util.Scanner;

public class Stringsum {

	
	public static void main(String[] args)
	{
		Scanner c=new Scanner(System.in);
		System.out.println("enter a string");
		String str=c.nextLine();
		char a[]=new char[str.length()];
		int i;
	
		int sum=0;
		for(i=0;i<=str.length()-1;i++)
		{
		if(str.charAt(i)>48&&str.charAt(i)<58)
		 {
	    
	     	System.out.println(str.charAt(i)-48);
	     	System.out.println('a');
	    	sum=sum+str.charAt(i)-48;
		
	      }
		
		}
		
	
		
		System.out.println("sum of number  "+ sum); 
		
		
		
	}

}
