package test.ex;

public class Ex3 {

	public static void main(String[] args) {

		int[] int_args = new int[] {35, 40, 55, -20, -30, 78, 200, 98};
		int sum = 0;
		
		System.out.print("배열 int_args 데이터 전체 출력 : ");
		
		for (int i = 0; i < int_args.length; i++) {
			
			System.out.print(int_args[i] + "  ");
			
		}
			
		System.out.print("\n배열 데이터 중에서 음수만 출력 : ");
		
		for (int i = 0; i < int_args.length; i++) {
			
			if (int_args[i] < 0) {
				System.out.print(int_args[i] + "  ");
			}
			
		}
		
		System.out.print("\n배열 데이터들의 절대값을 출력하시오 : ");
		
		for (int i = 0; i < int_args.length; i++) {
			if (int_args[i] < 0) {
				System.out.print(-int_args[i] + "  ");
			} else {
				System.out.print(int_args[i] + "  ");
			}
		}
		
		System.out.print("\n배열 데이터의 합을 구해서 출력하시오 : ");
		
		for (int i = 0; i < int_args.length; i++) {
			sum += int_args[i];
		}
		
		System.out.print(sum);
		
	}

}
