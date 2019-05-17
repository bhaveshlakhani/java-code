package logic;

import java.util.Scanner;

public class Interview1
{
	public static void main(String[] args) 
	{
		
	Scanner c =new Scanner(System.in);
	System.out.println("enter a string");
	String b=c.nextLine();
	
	char a[]=new char[b.length()];
	for(int i=0;i<a.length;i++){
		a[i]=b.charAt(i);
	}
    for(int i=0;i<b.length()-1;i++)	
    {
    	if(a[i]=='a' && a[i+1]=='m')
    	{
    		char temp=a[i+1];
    	      a[i+1]=a[i];
    	      a[i]=temp;
    		
    	}
    	
    	
    }
    for(int i=0;i<a.length;i++)
    {
    	System.out.print(a[i]);
    	
    }
    
	
	}

}
