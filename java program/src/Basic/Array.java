package Basic;

public class Array {
	
	public static void main(String[] args) 
	 
	{
		//declaration of array 
		int[] arr1=new int[5];
	 
		//array initialization
		arr1[0]=12;
		arr1[1]=13;
		arr1[3]=14;
		arr1[4]=34;
		arr1[2]=23;
		// arr1[5]=25; array index out of bound compile time error
		
		for(int i=0;i<=4;i++)
			
		{  
			 
		System.out.println("array element is="+arr1[i]);	
		
		
		} 
		
		  
		
		
	}

}
