
public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� �� ���ڰ� �տ����� �̸��� ������ ���� �Ұ����ϴ�
		// int 1_x;
		
		// ���� ������ �ѱ۷� �غ���
		
		int ��, ��, ��;
		
		�� = 100;
		�� = ��;
		�� = �� + ��;
		
		System.out.println("���� �� = " + ��);
		System.out.println("���� �� = " + ��);
		System.out.println("�� + �� = �� �� = " + �� + "\n");
		
		double height = 25.75;
		double width = 30.25;
		
		System.out.println("�ﰢ���� ���� : " + height);
		System.out.println("�ﰢ���� �غ� : " + width);
		
		double area = width / 2 * height;
		
		System.out.println("�ﰢ���� ���� : " + area + "\n");
		
		
		double radius = 20;
		double pi = 3.141592;
		
		System.out.println("���� ������ : " + radius);
		System.out.println("���̰� ���� : " + pi);
		
		double cir_area = radius * radius * pi;
		
		System.out.println("���� ���� : " + cir_area + "\n");
		
		System.out.println("���簢���� �ִ�. �װ��� �ﰢ���� �ö� �ִ�. ���簢���� ���̿��� �ﰢ���� ���̸� ������ ������? \n");
		
		double rec_height = 50;
		double rec_width = 100;
		double tri_height = 10;
		double tri_base = 25.5;
		
		System.out.println("�ﰢ���� ���� : " + tri_height);
		System.out.println("�ﰢ���� �غ� : " + tri_base);
		System.out.println("���簢���� ���� : " + rec_height);
		System.out.println("���簢���� �ʺ� : " + rec_width);
		
		double rec_area = rec_height * rec_width;
		
		System.out.println("���簢���� ���� : " + rec_area);
		
		double tri_area = tri_base / 2 * tri_height;
		
		System.out.println("�ﰢ���� ���� : " + tri_area);
		
		double reckoning_area = rec_area - tri_area;
		
		System.out.println("��� �� : " + reckoning_area);
			
		double gu_radius = 20;
		
		double gu_volume = gu_radius * gu_radius * gu_radius / 3 * 4 * pi;
		double gu_surArea = 4 * pi * gu_radius * gu_radius;
		
		System.out.println("���� ������ : " + gu_radius);
		System.out.println("���� ���� : " + gu_volume);
		System.out.println("���� �ѳ��� : " + gu_surArea);
		
		// %10d�� �ǹ� d�� ������ ����Ѵ�. ���⼭ 10�� ��ü���ĭ �� �̸� -10ó�� ������ ���� ���ڰ� ������ ���ĵǾ� ǥ��ȴ�.
		
		System.out.printf("%10d�� %-10d \n", ��, ��);
		
		// %5.2f�� �ǹ� f�� �Ǽ��� ����Ѵ�. ���⼭ 5�� ��ü���ĭ���� �ǹ��ϸ� .2�κ��� �Ҽ� ǥ�� �ڸ��� �ǹ��Ѵ�.
		
		System.out.printf("%5.2f %f", radius, pi);
	}

}
