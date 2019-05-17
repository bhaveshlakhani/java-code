package oopsConcept;

//constructor is special member of class it is used to initialize the data member at the time of object creation
//every class has constructor either default or user define

//if user not define constructor then compiler automatically define default constructor

//constructor type 1.user define 
//                 2.compiler define

//same name as class name
//it has no return type

class demo10
{
	int k=1;
	
	double d=10.5;
	
	//useer define constructor
	
	demo10()
	{
		System.out.println("running demo10 constructor");
		
		k=12;
		
		d=20.5;
		
	}
	
	demo10(int arg1,double arg2)
	{
		
		System.out.println("running parametarized constructor");
		
		k=arg1;
		
		d=arg2;
		
	}
	
	
}
 

public class Constructor {
	
	public static void main(String[] args) 
	
	{
		
		demo10 obj1=new demo10();
		
		System.out.println("k value= "+obj1.k);
		
		System.out.println("d value= "+obj1.d);
		 
		demo10 obj2=new demo10(10,10.5);
		
        System.out.println("k value= "+obj1.k);
		
		System.out.println("d value= "+obj1.d);
		
		demo10 obj3=obj2;
		
		System.out.println(obj3.k);
		System.out.println(obj3.d);
		
		
	}

}
