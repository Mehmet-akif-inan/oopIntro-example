package oopIntro;

public class ProductManager {
	public void addToCart(Product product) {
		System.out.println("Sepete eklendi "+ product.getName());
	}

}
/*bu classda ki amacýmýz, sepete ekleme kodunu her seferinde yazmamak için. Burada bir kere yaz, sonra sürekli buradan çaðýr. */