
public class Ex2 {

	/*
	 * 1에서 1000 사이의 정수 중에서 가장 큰 13의 배수를 구하시오
	 * */	
	public static void main(String[] args) {
		
		int max13 = 0;
		
		for (int i = 1000; i >= 1; i--) {
			
			if (i % 13 == 0) {
				
				max13 = i;
				
				break;
			}
			
		}
		
		System.out.println("1에서 1000 사이의 정수 중에서 가장 큰 13의 배수는 :" + max13);
		
	}

}
