package test.ex;

public class Ex5 {

	public static void main(String[] args) {
		
		String[] str_Star = new String[] {"�¾�", "����", "�ݼ�", "����", "ȭ��", "��", "�伺", "õ�ռ�", "�ؿռ�"};
		
		int saturn = 0, earth = 0;
		
		System.out.println("�¾�� �༺");
		
		for (int i = 0; i < str_Star.length; i++) {
			System.out.print(str_Star[i] + "   ");
		}
		
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
		
		for (int i = saturn; i >= earth; i--) {
			System.out.print(str_Star[i] + "  ");
		}
		
 	}

}
