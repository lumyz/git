package test.ex;

public class Ex1 {

	public static void main(String[] args) {

		// 태양계 배열 선언
		String[] str_Star = new String[] {"태양", "수성", "금성", "지구", "화성", "목성", "토성", "천왕성", "해왕성"};
		
		// 토성과 지구의 인덱스를 저장할 변수 선언
		int saturn = 0, earth = 0;
		
		// 태양계 배열 순서대로 출력
		System.out.println("태양계 행성");
		
		for (int i = 0; i < str_Star.length; i++) {
			System.out.print(str_Star[i] + "  ");
		}
		
		// 지구의 인덱스 토성의 인덱스 변수에 저장
		// 지구의 인덱스 출력
		System.out.print("\n지구의 인덱스 : ");
		
		for (int i = 0; i < str_Star.length; i++) {
			if (str_Star[i].equals("지구")) {
				System.out.print(i);
				earth = i;
			} else if (str_Star[i].equals("토성")) {
				saturn = i;
			}

		}

		System.out.println();
		
		
		// 저장한 인덱스를 통해 토성부터 지구의 역순 출력
		for (int i = saturn; i >= earth; i--) {
			System.out.print(str_Star[i] + "  ");
		}
		
		System.out.println();
		
		// 임시저장 변수 선언
		String temp;
		
		// 지구의 값을 임시저장 변수에 저장
		temp = str_Star[earth];
		
		// 지구의 배열에 토성의 값 저장
		str_Star[earth] = str_Star[saturn];
		
		// 토성의 배열에 임시저장 변수에 저장해놓은 지구의 값 저장
		str_Star[saturn] = temp;
		
		// 정확히 변경되었는지 배열 전체 값 순서대로 출력				
		for (int i = 0; i < str_Star.length; i++) {
			System.out.print(str_Star[i] + "  ");
		}
		
	}

}
