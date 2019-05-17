package oopsConcept;

class notebook
{
	
String brand;

int price;

int page;
 
void detail()
{
System.out.println("brand name: "+brand);

System.out.println("price is: "+price);
 
System.out.println("number of pages"+page);
 }
  
 
 }
public class Object {
	
	 public static void main(String[] args)
	 
	 {
		  
		   notebook obj1=new notebook();
		   
		   System.out.println("value of 1st instance");
		   
		   obj1.brand="camel";
		   
		   obj1.price=20;
		   
		   obj1.page=200;
		   
		   obj1.detail();
		   
		   
		   notebook obj2 =new notebook();
		    
		   System.out.println("value for 2nd instance" );
		   obj2.brand="classmate";
		    
		   obj2.price=23;
		   
		   obj2.page=150;
		   
		   obj2.detail();
		   
		    		
	}

}
