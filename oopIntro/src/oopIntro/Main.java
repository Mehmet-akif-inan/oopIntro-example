package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(123, "Lenovo V14","16GB Ram" ,12999,10); //Referans oluþturma.
		
		Product product2 = new Product(); //Referans oluþturma.
		product2.setId(212);
		product2.setName("Lenovo V15");
		product2.setDetails("16 GB Ram");
		product2.setDiscount(12);
		product2.setPrice(16000);
		
		System.out.println(product2.getPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(101);
		category1.setName("Yiyecek");
		
		Category category2 = new Category();
		category2.setId(201);
		category2.setName("Icecek");
		
		System.out.println(category1.getName());
		
		System.out.println(category2.getName());

	}

}
