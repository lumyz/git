package Hello;

public class Hello {
	// 주석달기 주석(설명)은 그냥 입력하면 안되고 "//"를 앞에 넣고 입력한다
	// 항상 코드를 입력하고 해당 코드가 어떤 것인지 설명하는걸 하도록 하여 추후 유지보수나 타인이 볼 때 쉽게 할 수 있도록 주석을 사용하자
	/* 이 주석은 한 줄만 주석 처리하는 것이 아니고 각 표시 안에 모두 주석처리하여 표시한다.*/
	public static void main(String[] args) {
		System.out.println("print()와 println()의 차이는 줄바꿈의 차이이다.");
		System.out.println("println(\"Hello World!!!\"); -> Hello World!!!");
		System.out.print("print(\"Hello\"); print(\"\\bWorld!!!\"); -> Hello");
		System.out.print("\bWorld!!!\n");
		System.out.println("\\b는 한칸 뛰기");
		System.out.println("\\n은 줄바꾸기");
	}
}
