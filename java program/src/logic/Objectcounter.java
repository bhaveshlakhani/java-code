package logic;

class Sample{
	 static int count;
	
	 
	{
		count++;
	}
	
	Sample()
	{
		System.out.println("running int arg constructor" );
	}
}

public class Objectcounter 
{
   public static void main(String[] args)
   {
    

	

	for(int i=0;i<10;i++)
	{
		new Sample();
	}
	Sample obj1=new Sample();
	
	System.out.println("number of object:"+obj1.count);
}
}