package Basic;

public class String12 {
	
	public static void main(String[] args) {
		
		String name="bhavesh";
		
		System.out.println(name);
		
		System.out.println("string length "+name.length());
		
		System.out.println("string contain bha    "+name.contains("bha"));
		
		System.out.println("sub string "+name.substring(4));
		
		System.out.println("sub string  "+name.substring(3,7));
		
		System.out.println("string character in location 4 is= "+name.charAt(4));
		
		System.out.println("string in uppercase  "+name.toUpperCase());
	}

}
