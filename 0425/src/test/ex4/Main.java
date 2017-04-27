package test.ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String search;
		
		Scanner scan = new Scanner(System.in);
		
		Book[] books = new Book[] {
				new Book ( "�ڹ� ����", "�Ѻ� �̵��", "ȫ�浿", 20000, 10 ),
				new Book ( "���� �Ǳ�", "�ϴð� �ٴ�", "���缮", 25000, 20),
				new Book ( "���� �ð� ����", "���Ź�ȭ��", "��ȣ��", 17000, 30),
				new Book ( "���� �ϱ�", "�ϴð� �ٴ�", "���缮", 25000, 5)
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
		
		System.out.println("�̸����� �˻��մϴ� å �̸��� �Է��ϼ���");
				
		search = scan.nextLine();
		
		store.searchName(search);
		
		System.out.println("���ǻ��̸����� �˻��մϴ� ���ǻ� �̸��� �Է��ϼ���");
		
		search = scan.nextLine();
		
		store.searchPublisher(search);
		
		System.out.println("���� �̸����� �˻��մϴ� ���� �̸��� �Է��ϼ���");
		
		search = scan.nextLine();
		
		store.searchAuthor(search);
		
		scan.close();
		
	}

}
