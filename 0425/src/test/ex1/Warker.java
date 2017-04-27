package test.ex1;

public  class Warker {

	// (1) 필드 생성
	public int num;
	public String name, pos, adress;
	
	// (2) 생성자 정의하기
	//		- 생성자는 클래스 이름과 같음
	// 		- 생성자는 특별 목적의 메소드
	// 		- 생성자는 반환형을 갖지 않음
	Warker() {
		System.out.println("생성자가 사용됨");
	}
	
	Warker(int value) {
		System.out.println("int value " + value + "를 전달받는 생성자가 사용됨");
	}
	
	public Warker(int i, String string, String string2, String string3) {
		this.num = i;
		this.name = string;
		this.pos = string2;
		this.adress = string3;
	}

	// (3) 메소드를 정의(선언)함
	public void printInfo() {

		System.out.printf("%d %s %s %s \n", num, name, pos, adress);
		
	}	
	
}
