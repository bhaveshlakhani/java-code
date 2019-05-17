package pattern;

public class Pattern10 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)// this loop executed 5 time it indicate number of row
		{ 
			  for(int j=1;j<=5;j++) //it indicate number of column
				  
			  {
				  
				  if(i==j || i+j==6)
				   {  
				 	  
				     System.out.print("*");
				     
				  }
				  
				  else 
				  {
					   
					System.out.print(" ");
					
				  }
			  }
			  
			  System.out.println();
		
		 }
		
	}

}
