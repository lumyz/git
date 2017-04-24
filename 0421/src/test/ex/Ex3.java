package test.ex;

public class Ex3 {

	public static void main(String[] args) {

	test();	
		
	test(10);
	
	
	}

	private static void test(int i) {
		System.out.println("두번째 함수 로딩");
	}

	private static void test() {
		System.out.println("첫번째 함수 로딩");
	}


}
