package test.ex;

public class Ex4 {

	static int x = 100;
	
	static void test() {
		
		x = 200;
		
	}

	public static void main(String[] args) {
		
		int x = 500;
				
		test();
		System.out.println("ÇÊµå x = " + x);
		
	}	

}
