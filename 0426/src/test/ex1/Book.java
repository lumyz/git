package test.ex1;

public class Book {

	private String name, publisher, author;
	private int price, inventory;

	public Book(String string, String string2, String string3, int i, int j) {

		setName(string);
		setPublisher(string2);
		setAuthor(string3);
		setPrice(i);
		setInventory(j);
		
	}
	
	public void print() {
		System.out.println(getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

}
