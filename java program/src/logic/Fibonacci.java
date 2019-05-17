package logic;
import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args)
	{
	 Scanner c=new Scanner(System.in);
	 
	 System.out.print("enter a number");
	 
     int n=c.nextInt();
     int n1=0;
     int n2=1;
     int n3=0;
     System.out.print(0+" "+1);
     while(n3<n)
     {
    	 n3=n1+n2;
    	 n1=n2;
    	 n2=n3;
    	 System.out.print(" "+n3+" ");
    	 
     }
     
	}

}
