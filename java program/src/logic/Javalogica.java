package logic;

import java.util.Scanner;

public class Javalogica {


	public static void main(String[] args) {
		Scanner c =new Scanner(System.in);
		System.out.println("enter any number");
		int a=c.nextInt();
		int d=1;
		while(a!=0)
		{ 
	      d=d*a;
	      a--;
		}
		System.out.println(d);

	}

}
