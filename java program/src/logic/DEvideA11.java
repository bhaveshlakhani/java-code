package logic;

import java.util.Scanner;

public class DEvideA11 {

	
	public static void main(String[] args) 
	{
	  Scanner c=new Scanner(System.in);
	  System.out.println("enter a number");
	  int n=c.nextInt();
	  int count=0;
	  while(n!=0)
	  {
		  if(n==11)
		  {
			  count=1;
		  }
		  else
		  {
			  count++;
		  }
		  n--;
		  
	  }
	  if(count==0||count==11)
	  {
		   System.out.println("number is divisible by 11");
	  }
	  else
	  {
		  System.out.println("number is not divisible");
	  }
	}

}
