package logic;


	//compostion example
	//System.out.println is composition example
	class Demo1
	{
		int a=10;
		
		void test()
		{
			System.out.println("running test method");
		}
		

	}

	class Sample11
	{
		int k=12;
		static Demo1 rf1=new Demo1();
		Demo1 obj1=new Demo1();
		
	     void disp()
	     {
	    	 System.out.println("running disp method");
	    	 System.out.println("a value:"+rf1.a);
	    	 rf1.a=12;
	    	 System.out.println(obj1.a);
	    	 
	    	 
	     }
		
	}

	public class Staticobject {


		public static void main(String[] args) {
			
			System.out.println("********************");
		    Sample11 obj1=new Sample11();
		    obj1.disp();
		    
		    System.out.println("a value:"+obj1.rf1.a);
		    obj1.rf1.test();
		    
		    System.out.println("**********************");

		}

	}
