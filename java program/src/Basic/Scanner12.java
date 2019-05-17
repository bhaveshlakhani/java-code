package Basic;

import java.util.Scanner;

public class Scanner12 {
	public static void main(String[] args) {
		int size;
		Scanner c =new Scanner(System.in);
		
		System.out.println("how many eleent u want to eneter" );
		
		size=c.nextInt();
		int[] arr1=new int[size];
		
		
		
		
		for(int i=0;i<size;i++)
		{
			
		  arr1[i]=c.nextInt();	
		}
		System.out.println("array element");
		for(int j=0;j<size;j++)
		{
			
			System.out.println(arr1[j]);
		}
		
	}

}
