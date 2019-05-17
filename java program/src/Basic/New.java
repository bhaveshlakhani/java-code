package Basic;


class T
{
	
public void test()
{
	
	System.out.println("Test");
	
}

}


class Q extends T
{
	
public void test()
{
	

	System.out.println("Run");
}

}

public class New 
{

	
	public static void main(String[] args) 
	{
	
		T t1=new Q();
		t1.test();
		
		
	}
}
