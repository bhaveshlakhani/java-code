package logic;

import java.util.Scanner;

public class Interview2
{
	public static void main(String[] args) 
	{
		Scanner c=new Scanner(System.in);
		
		System.out.println("enter a string");
		String b=c.nextLine();
		char[] a=new char[b.length()];
		int n=a.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=b.charAt(i);
		}
		
		for(int i=0;i<n-1;i++)
		{
			
		if(a[i]==a[i+1]){
		count++;
		int k=i;
			while(k<n-1){
				a[k]=a[k+1];
				
				k++;
			}
			n--;
		}
			
			
			
		}
			
		
		
		System.out.println(count);
		for(int i =0;i<n;i++){
			System.out.print(a[i]);
		}
	}
	
		
}

