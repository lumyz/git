
public class Ex1 {
	/*
	 * 20에서 100 사이의 정수 중에서 가장 작은 17의 배수를 구하시오
	 * */
	
	public static void main(String[] args) {
		
		for (int i = 20; i <= 100; i++) {
			
			if (i % 17 == 0) {
				System.out.println("가장작은 17의 배수 : " + i);
				
				break;
			}
			
		}
		
	}
}
