package hash;

import java.util.HashMap;
import java.util.Map;

public class Demohash {

	public static void main(String[] args) {
		Map<String, Double> ma = new HashMap();
		ma.put("Rushi", 0.99);
		ma.put("sri", 1.9);
		ma.put("jay", 0.5);
		ma.put("Kiran", 1.34);
		ma.put("raghu", 2.33);
		ma.put("pin", 4.5);
		System.out.println("\nwelcome to students list:");
		System.out.println("what is the percentage of rushi:");
		System.out.println(ma.get("Rushi"));

		System.out.println("what is the percentage of sri:");
		System.out.println(ma.get("sri"));

		System.out.println("what is the percentage of jaya:");
		System.out.println(ma.get("jay"));

	}

}
