package Basic;

public class basic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
c a = new c();

	}

}class a {
	a(){
	System.out.println("ca");	
	}
static{
	System.out.println("a");
}
}


class b extends a{
	static{
		System.out.println("b");
	}
	b(){
		System.out.println("cb");
	}
}
class c extends b{
	static{
		System.out.println("c");
	}
	c(){
		System.out.println("cc");
	}
	
}