package test.ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String search;
		
		Scanner scan = new Scanner(System.in);
		
		Book[] books = new Book[] {
				new Book ( "자바 공부", "한빛 미디어", "홍길동", 20000, 10 ),
				new Book ( "부자 되기", "하늘과 바다", "유재석", 25000, 20),
				new Book ( "좋은 시간 관리", "정신문화사", "강호동", 17000, 30),
				new Book ( "성공 하기", "하늘과 바다", "유재석", 25000, 5)
		};
		
		books[0].printInfo();
		
		books[0].printName();
		
		books[0].printPublisher();
		
		books[0].printAuthor();
		
		books[0].printPrice();
		
		books[0].changePrice(15000);
		
		books[0].printInven();
		
		books[0].changeInven(10);
		
		System.out.println("\n");
		
		BookStore store = new  BookStore(books);
		
		store.printBooks();
		
		System.out.println("\n");
		
		System.out.println("이름으로 검색합니다 책 이름을 입력하세요");
				
		search = scan.nextLine();
		
		store.searchName(search);
		
		System.out.println("출판사이름으로 검색합니다 출판사 이름을 입력하세요");
		
		search = scan.nextLine();
		
		store.searchPublisher(search);
		
		System.out.println("저자 이름으로 검색합니다 저자 이름을 입력하세요");
		
		search = scan.nextLine();
		
		store.searchAuthor(search);
		
		scan.close();
		
	}

}
