package test.ex1;

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
	
	public Warker(int i, String string, String string2, String string3) {
		this.num = i;
		this.name = string;
		this.pos = string2;
		this.adress = string3;
	}

	// (3) �޼ҵ带 ����(����)��
	public void printInfo() {

		System.out.printf("%d %s %s %s \n", num, name, pos, adress);
		
	}	
	
}
