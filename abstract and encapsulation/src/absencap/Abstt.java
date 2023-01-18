package absencap;

public class Abstt {
	private String make;
	private double price;
	private int year;
	private String color;

	public Abstt(String make, double price, int year, String color) {
		this.make = make;
		this.price = price;
		this.year = year;
		this.color = color;
	}

	public String getmake() {
		return make;
	}

	public double getprice() {
		return price;
	}

	public int getyear() {
		return year;
	}

	public String getcolor() {
		return color;
	}
}
