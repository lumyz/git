
public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언 중 숫자가 앞에오는 이름의 변수는 선언 불가능하다
		// int 1_x;
		
		// 변수 선언을 한글로 해보자
		
		int 가, 나, 다;
		
		가 = 100;
		나 = 가;
		다 = 가 + 나;
		
		System.out.println("변수 가 = " + 가);
		System.out.println("변수 나 = " + 나);
		System.out.println("가 + 나 = 다 다 = " + 다 + "\n");
		
		double height = 25.75;
		double width = 30.25;
		
		System.out.println("삼각형의 높이 : " + height);
		System.out.println("삼각형의 밑변 : " + width);
		
		double area = width / 2 * height;
		
		System.out.println("삼각형의 넓이 : " + area + "\n");
		
		
		double radius = 20;
		double pi = 3.141592;
		
		System.out.println("원의 반지름 : " + radius);
		System.out.println("파이값 기준 : " + pi);
		
		double cir_area = radius * radius * pi;
		
		System.out.println("원의 면적 : " + cir_area + "\n");
		
		System.out.println("직사각형이 있다. 그곳에 삼각형이 올라가 있다. 직사각형의 넓이에서 삼각형의 넓이를 제외한 면적은? \n");
		
		double rec_height = 50;
		double rec_width = 100;
		double tri_height = 10;
		double tri_base = 25.5;
		
		System.out.println("삼각형의 높이 : " + tri_height);
		System.out.println("삼각형의 밑변 : " + tri_base);
		System.out.println("직사각형의 높이 : " + rec_height);
		System.out.println("직사각형의 너비 : " + rec_width);
		
		double rec_area = rec_height * rec_width;
		
		System.out.println("직사각형의 넓이 : " + rec_area);
		
		double tri_area = tri_base / 2 * tri_height;
		
		System.out.println("삼각형의 넓이 : " + tri_area);
		
		double reckoning_area = rec_area - tri_area;
		
		System.out.println("계산 값 : " + reckoning_area);
			
		double gu_radius = 20;
		
		double gu_volume = gu_radius * gu_radius * gu_radius / 3 * 4 * pi;
		double gu_surArea = 4 * pi * gu_radius * gu_radius;
		
		System.out.println("구의 반지름 : " + gu_radius);
		System.out.println("구의 부피 : " + gu_volume);
		System.out.println("구의 겉넓이 : " + gu_surArea);
		
		// %10d의 의미 d는 정수를 얘기한다. 여기서 10은 전체출력칸 수 이며 -10처럼 음수가 오면 숫자가 좌측에 정렬되어 표기된다.
		
		System.out.printf("%10d와 %-10d \n", 가, 나);
		
		// %5.2f의 의미 f는 실수를 얘기한다. 여기서 5는 전체출력칸수를 의미하며 .2부분은 소수 표기 자리를 의미한다.
		
		System.out.printf("%5.2f %f", radius, pi);
	}

}
