package oopsConcept;

class demo4
 {
  	
 int a=12;
 
 void test()
 {
	 
	 System.out.println("running test method");
 }
	
	
	
}

public class NonstaticRefer {
	 
	public static void main(String[] args) 
	
	{    
		//refering non static variable we have to create instance of class
		// non static variable associate with instance of class
		
		
		System.out.println("a value= "+new demo4().a); 
		
		
		System.out.println(new demo4().a=14);
		
		new demo4().test();
		
		
		
		
	}

}
