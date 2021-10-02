package oopIntro;

public class Product {
	
	private int id;
	private String name;
	private String details;
	private double price;
	private double discount;
	
	
	public Product() {
		
	}
	
	public Product(int id, String name, String details, double price, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.details = details;
		this.price = price;
		this.discount = discount;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getPriceAfterDiscount() {
		return this.price-(this.price*this.discount/100);
	}
	
	
	
}
