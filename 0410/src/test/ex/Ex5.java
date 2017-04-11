package test.ex;

public class Ex5 {

	public static void main(String[] args) {
		
		String[] str_Star = new String[] {"태양", "수성", "금성", "지구", "화성", "목성", "토성", "천왕성", "해왕성"};
		
		int saturn = 0, earth = 0;
		
		System.out.println("태양계 행성");
		
		for (int i = 0; i < str_Star.length; i++) {
			System.out.print(str_Star[i] + "   ");
		}
		
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
		
		for (int i = saturn; i >= earth; i--) {
			System.out.print(str_Star[i] + "  ");
		}
		
 	}

}
