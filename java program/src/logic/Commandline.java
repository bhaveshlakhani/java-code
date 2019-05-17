package logic;

class Commandline 
{
	public static void main(String[] args) 
	{
		System.out.println("Program started");

		char grade='A';


        switch(grade)

		{
			 case 'A':
				 System.out.println("first class with ditinction");

			     break;
			 case 'B':

		 	     System.out.println("first class");
			     break;

             case 'C':

				 System.out.println("second class");
				 break;

				 default:
					  System.out.println("invalid grade");
		}
	}
}
