package tryit;

import org.omg.Messaging.SyncScopeHelper;

class D
{
	
void test()
{

	System.out.println("Test super");

}


}

class DD extends D
{
	
void test()
{
	
System.out.println("test child");


}
	
	
}


public class Demo 
{
	public static void main(String[] args)
	{
	
		
		D d=new DD();
		
		d.test();
		
		
		DD dd=new DD();
		
		dd.test();
			
		
	}
	

}
