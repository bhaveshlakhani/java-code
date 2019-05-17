package logic;
import java.util.Scanner;
public class Reversenumber {

	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        System.out.println("enter number");
        
		int n=scn.nextInt();

		int digit=0;
		int reverse=0;
		
		while(n!=0)
		{
			digit=n%10;
			
			n=n/10;
			reverse=reverse*10+digit;
			
			
			
		}
		System.out.println(reverse);
	}

}
