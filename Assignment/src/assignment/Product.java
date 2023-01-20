package assignment;

public class Product {
	private int productid;
	private String name;
	private int price;

	public Product(int productid, String name, int price) {
		super();
		this.productid = productid;
		this.name = name;
		this.price = price;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", name=" + name + ", price=" + price + "]";
	}

}
