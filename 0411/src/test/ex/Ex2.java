package test.ex;

public class Ex2 {

	public static void main(String[] args) {
		
		// 비교할 값들의 배열 선언
		int[] data = new int[]{70, 85, 60, 90, 95, 75};
		
		// 가장 첫 배열 값을 먼저 max값에 넣어서 비교를 시작
		int max = data[0];
		
		// 가장 큰 값의 인덱스를 저장할 변수 선언
		int index = 0;
		
		// max값을 시작으로 배열마다 비교를 시작 값이 더 크면
		// 그 값을 max변수에 저장하여 그 값보다 더 큰값을 찾는
		for (int i = 1; i < data.length; i++) {
			
			if (max < data[i]) { 						
				max = data[i];							
				index = i;
			}
			
		}
		
		System.out.println("가장 큰 수는  : " + max);
		System.out.println("가장 큰 값의 인덱스 : " + index);
		
	}
	
}
