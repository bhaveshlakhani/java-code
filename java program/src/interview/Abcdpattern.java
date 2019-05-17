package interview;

import java.util.Scanner;

public class Abcdpattern {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter any number");
        int n=scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			 for(int j=0;j<i;j++)
			 {
				 System.out.printf("%c",'A'+j);
				 
			 }
			 System.out.println();
		}

	}

}
