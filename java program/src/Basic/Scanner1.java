package Basic;

import java.util.Scanner;

public class Scanner1 {


	public static void main(String[] args) 
	
	{
	  Scanner c = new Scanner(System.in);
	 
	 System.out.println("enter your name");
		 String a= c.next();
		 
     System.out.println("enter your age");		 
		int b=c.nextInt();
		
		 if(b>18)
		 
		 {
			  System.out.println("hello "+a);
			  System.out.println("you are eligible for voting");
		 }
		 else
		 {
			 System.out.println("sorry u r not eligible for voting");
		 }
			  
			  
	}

}
