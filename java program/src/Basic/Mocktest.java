package Basic;

public class Mocktest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args)
	{ 
		
		
		
	   int sum=0;
	   
	   //1
	   char as='a';
	   
	   //2
	   //float b=3.14;
	   float aaa=32;
	    float bb=3.1f;
	    
	    //3
	   boolean a=true;
	   boolean b=false;
	   boolean c=a^b;// it is x-or if both condition is same then output false
	   System.out.println(c);
	   
	   
	   //4
	   int odd=1;
	  /* if(odd)
	   {
		   System.out.println("error");
	   }
	   */
	  
	   
	   
	   //5
	   int var1=7;
	   int var2=0;
	   

	   if((var1=0)==var2)
	   {
		   System.out.println("true");
	   }
	   else 
		   System.out.println("false");
	   
	 
	
		System.out.println(110|4);//octal number
		
		System.out.println(0x010|4);
		
		
		for(int i=0,j=0;i<5;i++,i=i+1)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
