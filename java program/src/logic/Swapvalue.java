package logic;

public class Swapvalue {

	
    public static void main(String[] args) {
		int a=10;
		int b=30;
    	System.out.println("before swaping value:a="+a + "b="+b);
    	swap(a,b);
    	

	}
    public static void swap(int a,int b)
    {
    	int c=a;
    	a=b;
    	b=c;
    	
    	System.out.println("after swaping value: a="+a + "b="+b);
    	
    	
    }
    
    

}
