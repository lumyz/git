package test.ex1;

public class Drink {

	private int no, price;
	private String name;
	
	public Drink(int no, String name, int price) {
		setNo(no);
		setName(name);
		setPrice(price);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
