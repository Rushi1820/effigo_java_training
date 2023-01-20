package assignment;

import java.util.List;

public class main {

	public static void main(String[] args) {
		List<Product> products = details.getAll();
		Product price = products.stream()
				.min((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();
		System.out.println("Min price product" + (price));
		System.out.println("************************************");

		List<Product> maxprice = details.getAll();
		Product maxprice1 = maxprice.stream()
				.max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();
		System.out.println("MAX price product" + maxprice1);
	}

}
