package oopsConcept;

class demo5
{
	int a=10;
	double b=10.3;
	
	void test()
	{
	
		 System.out.println("running test method");
		 
		
	}
	 }

public class ReferenceVariable {
public static void main(String[] args)
 
{
  demo5 obj1               =              new demo5();
  //   reference variable             //object
  
  // reference variable value either null or instance of class
   
  System.out.println("a value = "+obj1.a);
  
  System.out.println("b value = "+obj1.b);
  
  obj1.test();
}
}
