package test01;

public class test01 {
	public static void main(String[] args) {
		int int_x = 0;	// int�� ���� ���� �� 0���� �ʱ�ȭ
		int int_y = 200; // ���� int�� ������ �����ϰ� 200���� �ʱ�ȭ
		
		for (int_x = 0; int_x < 10; int_x++) {
			System.out.println("x�� ���� " + int_x + "�Դϴ�.");
		}
		
		System.out.println("x�� ���� " + int_x + "�Դϴ�.");
		System.out.println("y�� ���� " + int_y + "�Դϴ�.");
		
		// ��Ģ ����
		// ����
		
		int sum_xy = int_x + int_y;
		
		System.out.println("x�� y�� ���� " + sum_xy + "�Դϴ�.");
		
		// ����
		
		int dif_xy = int_x - int_y;
		
		System.out.println("x�� y�� ���� " + dif_xy + "�Դϴ�.");
		
		// ����
		
		int pro_xy = int_x * int_y;
		
		System.out.println("x�� y�� ���� " + pro_xy + "�Դϴ�.");
		
		// ������ �� int��(����)�� �Ҽ������� ���� �������� ���� ���� �� ����.
		
		int quo_xy = int_x / int_y;
		
		System.out.println("x�� y�� ������ ���� " + quo_xy + "�Դϴ�.");
		
		// ������ ������
		
		int rem_xy = int_x % int_y;
		
		System.out.println("x�� y�� ������ ������ ���� " + rem_xy + "�Դϴ�.");
		
		// �Ǽ��� ������
		
		double dou_quo_xy = (double) int_x / int_y;
		
		System.out.println("x�� y�� ������ �Ǽ��� : " + dou_quo_xy);
		
	}
}
