package oopsConcept;

class demo3{
	
static int a=12;

static double b=10.5;
 static void test()
 { 
	 
	 System.out.println("running test method");
	 
 }
	
	
	
}

public class Staticrefer {
public static void main(String[] args)
 
{
	System.out.println("a value = "+demo3.a); 
	System.out.println("b value= "+demo3.b);
	
	demo3.a=45;// re-assigning value of a
	
	System.out.println("after re- assigning value of a="+demo3.a);
	
	demo3.test();
	
}
}
