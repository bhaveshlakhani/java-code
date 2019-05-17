package logic;

import java.util.Scanner;

public class HexToDecimal {

	public static void main(String[] args)
	{
		Scanner c=new Scanner(System.in);
		
		String str=c.nextLine();
		//System.out.println(0x123);
		
		if(str.charAt(0)=='0'&& str.charAt(1)=='x')
		{
			
			int a[]= new int [str.length()-2];
			
			for(int i=2;i<str.length();i++){
				
				if(str.charAt(i)>47&&str.charAt(i)<58){
					
					
					a[i-2]=str.charAt(i)-48;
					
					
				}
				else 
					a[i-2]=str.charAt(i)-55;
					
					
				}
				
				
			
			int temp=16;
			int sum = a[a.length-1];
			
			for(int i=a.length-2;i>=0;i--){
				
				sum=sum+(temp*a[i]);
				temp=temp*16;
				
			}
			
			
			
			
			
			System.out.println(sum);
			
			}
			
	
			
			
			
		else
		{
			 System.out.println("invalid number");
		}	
			
			
			
			
			
			
		}
		
	}


