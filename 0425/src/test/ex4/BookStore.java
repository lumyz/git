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
				System.out.println("----검색하신 이름의 도서----");
				System.out.printf("%15s %10s %6s %5d %3d \n", books[i].name, books[i].publisher, books[i].author,
						books[i].price, books[i].inventory);

				searchSuccess = true;

				
			} else if (i + 1 == books.length && !searchSuccess) {
				System.out.println("해당 이름의 책을 찾을 수 없습니다.");
			}
		}

	}

	public void searchPublisher(String search) {
		boolean searchSuccess = false;
		for (int i = 0; i < books.length; i++) {
			
			if (books[i].publisher.equals(search)) {
				System.out.println("----검색하신 출판사의 도서----");
				System.out.printf("%15s %10s %6s %5d %3d \n", books[i].name, books[i].publisher, books[i].author,
						books[i].price, books[i].inventory);
				searchSuccess = true;
			} else if (i + 1 == books.length && !searchSuccess) {
				System.out.println("해당 출판사의 책을 찾을 수 없습니다.");
			}
		}

	}

	public void searchAuthor(String search) {
		boolean searchSuccess = false;
		for (int i = 0; i < books.length; i++) {
			
			if (books[i].author.equals(search)) {
				System.out.println("----검색하신 저자의 도서----");
				System.out.printf("%15s %10s %6s %5d %3d \n", books[i].name, books[i].publisher, books[i].author,
						books[i].price, books[i].inventory);
				searchSuccess = true;
			} else if (i + 1 == books.length && !searchSuccess) {
				System.out.println("해당 저자의 책을 찾을 수 없습니다.");
			}
		}

	}

}
