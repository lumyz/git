package test.ex3;

public  class Warker {

	// (1) �ʵ� ����
	public int num;
	public String name, pos, adress;
	
	// (2) ������ �����ϱ�
	//		- �����ڴ� Ŭ���� �̸��� ����
	// 		- �����ڴ� Ư�� ������ �޼ҵ�
	// 		- �����ڴ� ��ȯ���� ���� ����
	Warker() {
		System.out.println("�����ڰ� ����");
	}
	
	Warker(int value) {
		System.out.println("int value " + value + "�� ���޹޴� �����ڰ� ����");
	}
	
	// (3) �޼ҵ带 ����(����)��
	public void printInfo() {

		System.out.printf("%d %s %s %s \n", num, name, pos, adress);
		
	}	
	
}
