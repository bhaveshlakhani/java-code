package Basic;

public class Method {
	
	public static void main(String[] args) {
		 System.out.println("program started");
		 
        test(); // calling test method	
        test(); // you can calltime test method any number of time
        
        test1(10);
        test2(10,10.5);    
		 System.out.println("program ended");
	}
	
	static void test()
	{
		
		System.out.println("running test method");
		
	}
	// mathod with argument
	static void test1(int a)//mathod argument used to pass value in method
	{
		
		 System.out.println("runnning test1 arg method");
		 System.out.println("a value ="+a);
		 
	}
	
	
	//you  can also define multiple argument
	
	static void test2(int a,double b)
	{
	System.out.println("running test2() multiple argument method");	
	
	System.out.println("value of a="+a);
	System.out.println("value of b="+b);
	
	
	}
	  
}
