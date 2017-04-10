package test01;

public class test01 {
	public static void main(String[] args) {
		int int_x = 0;	// int형 변수 선언 후 0으로 초기화
		int int_y = 200; // 같은 int형 변수를 선언하고 200으로 초기화
		
		for (int_x = 0; int_x < 10; int_x++) {
			System.out.println("x는 현재 " + int_x + "입니다.");
		}
		
		System.out.println("x는 현재 " + int_x + "입니다.");
		System.out.println("y는 현재 " + int_y + "입니다.");
		
		// 사칙 연산
		// 덧셈
		
		int sum_xy = int_x + int_y;
		
		System.out.println("x와 y의 합은 " + sum_xy + "입니다.");
		
		// 뺄셈
		
		int dif_xy = int_x - int_y;
		
		System.out.println("x와 y의 차는 " + dif_xy + "입니다.");
		
		// 곱셈
		
		int pro_xy = int_x * int_y;
		
		System.out.println("x와 y의 곱은 " + pro_xy + "입니다.");
		
		// 나눗셈 몫 int형(정수)은 소수점이하 값을 저장하지 못해 가질 수 없다.
		
		int quo_xy = int_x / int_y;
		
		System.out.println("x와 y의 나눗셈 몫은 " + quo_xy + "입니다.");
		
		// 나눗셈 나머지
		
		int rem_xy = int_x % int_y;
		
		System.out.println("x와 y의 나눗셈 나머지 값은 " + rem_xy + "입니다.");
		
		// 실수형 나눗셈
		
		double dou_quo_xy = (double) int_x / int_y;
		
		System.out.println("x와 y의 나눗셈 실수형 : " + dou_quo_xy);
		
	}
}
