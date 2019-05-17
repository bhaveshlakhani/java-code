package interview;


import java.util.Scanner;
public class Spiralpattern 
{
public static void main(String[] args) 
{
	Scanner c=new Scanner(System.in);
	System.out.println("enter a number");
	int b=c.nextInt();
	
	int[][] a=new int[b][b];
	int c1=0,r1=0,c2=b-1,r2=b-1;
	int k=1;
	
	while(k<=b*b)
	{
		for(int i=c1;i<=c2;i++)
		{
			a[r1][i]=k++;
		}
		for(int j=r1+1;j<=r2;j++)
		{
			a[j][c2]=k++;
		}
		for(int m=c2-1;m>=c1;m--)
		{
			 a[r2][m]=k++;
		}
		for(int n=r2-1;n>r1;n--)
		
		{
			a[n][c1]=k++;
		}
		c1++;
		c2--;
		r1++;
		r2--;
		
	}
	
for(int i=0;i<b;i++)
	{
		for(int j=0;j<b;j++)
		{
			
			System.out.print(a[i][j]+"     ");
			
			
		}
		
		System.out.println();
	}
	
	
	
	
	
	
	
	
}
}
