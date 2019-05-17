package oopsConcept;

// block 1.static block     // it execute only once 
//       2.non static block // whenever instance created it will executed

class block12
{ 
	static
	 {
	System.out.println("running static block of block12");	 
		 
	 }
	
	// non static block
	 
	{
		 
	 System.out.println("running non static block of block12");	 
		
	}
	
	
 
	void test()
	{
		 
		System.out.println("rrunning test method"); 
		
	}
 

}
public class Block 

{
 static
 { 
System.out.println("running static block of Block");	  
 } 
 {
	  
	 System.out.println("running non static block of Block class");
 }
  
    
 
	
public static void main(String[] args) 

{
	System.out.println("program started");
	
       block12 obj1=new block12();
       block12 obj2=new block12();
 
 
   System.out.println("program ended");
	
	
	
}
	 
}
