package test.ex;

public class Ex1 {

	public static void main(String[] args) {

		// �¾�� �迭 ����
		String[] str_Star = new String[] {"�¾�", "����", "�ݼ�", "����", "ȭ��", "��", "�伺", "õ�ռ�", "�ؿռ�"};
		
		// �伺�� ������ �ε����� ������ ���� ����
		int saturn = 0, earth = 0;
		
		// �¾�� �迭 ������� ���
		System.out.println("�¾�� �༺");
		
		for (int i = 0; i < str_Star.length; i++) {
			System.out.print(str_Star[i] + "  ");
		}
		
		// ������ �ε��� �伺�� �ε��� ������ ����
		// ������ �ε��� ���
		System.out.print("\n������ �ε��� : ");
		
		for (int i = 0; i < str_Star.length; i++) {
			if (str_Star[i].equals("����")) {
				System.out.print(i);
				earth = i;
			} else if (str_Star[i].equals("�伺")) {
				saturn = i;
			}

		}

		System.out.println();
		
		
		// ������ �ε����� ���� �伺���� ������ ���� ���
		for (int i = saturn; i >= earth; i--) {
			System.out.print(str_Star[i] + "  ");
		}
		
		System.out.println();
		
		// �ӽ����� ���� ����
		String temp;
		
		// ������ ���� �ӽ����� ������ ����
		temp = str_Star[earth];
		
		// ������ �迭�� �伺�� �� ����
		str_Star[earth] = str_Star[saturn];
		
		// �伺�� �迭�� �ӽ����� ������ �����س��� ������ �� ����
		str_Star[saturn] = temp;
		
		// ��Ȯ�� ����Ǿ����� �迭 ��ü �� ������� ���				
		for (int i = 0; i < str_Star.length; i++) {
			System.out.print(str_Star[i] + "  ");
		}
		
	}

}
