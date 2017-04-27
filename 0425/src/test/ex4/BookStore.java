package test.ex4;

public class BookStore {

	Book[] books;

	public BookStore(Book[] books) {

		this.books = books;

	}

	public void printBooks() {

		for (int i = 0; i < books.length; i++) {
			System.out.printf("%15s %10s %6s %5d %3d \n", books[i].name, books[i].publisher, books[i].author,
					books[i].price, books[i].inventory);

		}

	}

	public void searchName(String search) {
		boolean searchSuccess = false;
		for (int i = 0; i < books.length; i++) {
			
			if (books[i].name.equals(search)) {
				System.out.println("----�˻��Ͻ� �̸��� ����----");
				System.out.printf("%15s %10s %6s %5d %3d \n", books[i].name, books[i].publisher, books[i].author,
						books[i].price, books[i].inventory);

				searchSuccess = true;

				
			} else if (i + 1 == books.length && !searchSuccess) {
				System.out.println("�ش� �̸��� å�� ã�� �� �����ϴ�.");
			}
		}

	}

	public void searchPublisher(String search) {
		boolean searchSuccess = false;
		for (int i = 0; i < books.length; i++) {
			
			if (books[i].publisher.equals(search)) {
				System.out.println("----�˻��Ͻ� ���ǻ��� ����----");
				System.out.printf("%15s %10s %6s %5d %3d \n", books[i].name, books[i].publisher, books[i].author,
						books[i].price, books[i].inventory);
				searchSuccess = true;
			} else if (i + 1 == books.length && !searchSuccess) {
				System.out.println("�ش� ���ǻ��� å�� ã�� �� �����ϴ�.");
			}
		}

	}

	public void searchAuthor(String search) {
		boolean searchSuccess = false;
		for (int i = 0; i < books.length; i++) {
			
			if (books[i].author.equals(search)) {
				System.out.println("----�˻��Ͻ� ������ ����----");
				System.out.printf("%15s %10s %6s %5d %3d \n", books[i].name, books[i].publisher, books[i].author,
						books[i].price, books[i].inventory);
				searchSuccess = true;
			} else if (i + 1 == books.length && !searchSuccess) {
				System.out.println("�ش� ������ å�� ã�� �� �����ϴ�.");
			}
		}

	}

}
