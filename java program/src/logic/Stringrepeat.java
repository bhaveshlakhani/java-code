package logic;

import java.util.ArrayList;
import java.util.Scanner;

public class Stringrepeat {


	public static void main(String[] args) {
	 System.out.println("enter the string ");
		Scanner s = new Scanner(System.in);
		String b=s.next();
	 
	  for(int i=0;i<b.length()-1;i++)
	  {
		  for(int j=i;j<b.length()-1;j++)
		  { 
	  
	  if(b.charAt(i)==b.charAt(j+1))
	  {
		 System.out.println("repeating chararcter is "+b.charAt(i));
	  }
		  }
	  }
	}

}
