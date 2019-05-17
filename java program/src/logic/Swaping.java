package logic;

import java.util.Scanner;


class Hello
{
	
	public static void test2() 
	{
			System.out.println("running stattic method test2() of Hello");	
	}
	
	
}



public class Swaping 
{
	static void test1(int arg1,int arg2)
	{
		
		arg1=arg1+arg2;
		arg2=arg1-arg2;
		arg1=arg1-arg2;
		
		System.out.println("the swaped numbber is: ");
		System.out.println(arg1+" and " +arg2);
		
		
	}

	
	
void test(int arg1,int arg2)

{
	arg1=arg1+arg2;
	arg2=arg1-arg2;
	arg1=arg1-arg2;
	
	
	System.out.println("the swaped numbber is: ");
	System.out.println(arg1+"and "+arg2);
}

public static void main(String[] args) 

{
 Scanner c=new Scanner(System.in);
 System.out.println("enter a two number ");
	int n1,n2;
	n1=c.nextInt();
	n2=c.nextInt();
	
	System.out.println("two number are" +n1 +"and "+n2 );
	
	test1(n1,n2);
	Swaping obj1=new Swaping();
	obj1.test(n1,n2);
	
Hello.test2();
	
}

}
