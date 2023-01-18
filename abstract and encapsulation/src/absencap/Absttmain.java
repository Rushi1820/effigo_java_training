package absencap;

public class Absttmain {

	public static void main(String[] args) {
		Abstt nis = new Abstt("toyata", 10000, 2018, "red");
		Abstt ni = new Abstt("kia", 20000, 2020, "white");

		System.out.println("this " + nis.getmake() + " is at price of $ " + nis.getprice() + " is built in year"
				+ nis.getyear() + " with color " + nis.getcolor());
		System.out.println("this " + ni.getmake() + " is at price of $ " + ni.getprice() + " is built in year "
				+ ni.getyear() + "with color" + ni.getcolor());

	}

}
