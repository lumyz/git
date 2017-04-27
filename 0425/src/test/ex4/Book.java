package test.ex4;

public class Book {

	String name, publisher, author;
	int price, inventory;
	
	public Book(String name, String publisher, String author, int price, int inventory) {
		this.name = name;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.inventory = inventory;
	}

	public void printInfo() {
		System.out.println("도서명      출판사        저자    판매가 재고 수량");		
		System.out.printf("%s %s %s %d %d", this.name, this.publisher, this.author, this.price, this.inventory);
	}

	public String printName() {
		return this.name;
	}

	public String printPublisher() {
		// TODO Auto-generated method stub
		return this.publisher;
	}

	public String printAuthor() {
		// TODO Auto-generated method stub
		return this.author;
	}

	public int printPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	public void changePrice(int price) {
		// TODO Auto-generated method stub
		this.price = price;
	}

	public int printInven() {
		// TODO Auto-generated method stub
		return this.inventory;
	}

	public void changeInven(int inventory) {
		// TODO Auto-generated method stub
		this.inventory = inventory;
	}
	
}
