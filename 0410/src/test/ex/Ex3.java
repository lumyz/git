package test.ex;

public class Ex3 {

	public static void main(String[] args) {

		int[] int_args = new int[] {35, 40, 55, -20, -30, 78, 200, 98};
		int sum = 0;
		
		System.out.print("�迭 int_args ������ ��ü ��� : ");
		
		for (int i = 0; i < int_args.length; i++) {
			
			System.out.print(int_args[i] + "  ");
			
		}
			
		System.out.print("\n�迭 ������ �߿��� ������ ��� : ");
		
		for (int i = 0; i < int_args.length; i++) {
			
			if (int_args[i] < 0) {
				System.out.print(int_args[i] + "  ");
			}
			
		}
		
		System.out.print("\n�迭 �����͵��� ���밪�� ����Ͻÿ� : ");
		
		for (int i = 0; i < int_args.length; i++) {
			if (int_args[i] < 0) {
				System.out.print(-int_args[i] + "  ");
			} else {
				System.out.print(int_args[i] + "  ");
			}
		}
		
		System.out.print("\n�迭 �������� ���� ���ؼ� ����Ͻÿ� : ");
		
		for (int i = 0; i < int_args.length; i++) {
			sum += int_args[i];
		}
		
		System.out.print(sum);
		
	}

}
