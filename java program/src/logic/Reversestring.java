package logic;

import java.util.Scanner;

public final class Reversestring 
{
	public static void main(String[] args)
	{
		
	 String input;
	 String reverse="";
	 
		Scanner scn=new Scanner(System.in);
	    System.out.println("enter a string");
	    
	    input=scn.nextLine();
	    
        int length=input.length();
	    for(int i=length-1;i>=0;i--)
	    {
	    	reverse=reverse +input.charAt(i);
	    }
	    
	    System.out.println("reverse string  "+reverse);
	}
	
}
