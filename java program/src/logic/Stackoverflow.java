package logic;

public class Stackoverflow {
	
	public static void square(int x) 
	{
		int res=x*x;
		System.out.println("square of"+x);
		System.out.println(res);
		
		//if(x<10)
		square(++x);
		
		
	}	
	public static void main(String[] args)
	{
		
		square(2);
	
		
	}
	
	

}
