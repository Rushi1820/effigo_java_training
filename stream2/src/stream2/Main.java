package stream2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<database> databases = details.getAll();
		//one to one mapping customer -> customer.email
		List<String> email = databases.stream().map(database -> database.getEmail()).collect(Collectors.toList());
		System.out.println(email);

		List<List<String>> phone = databases.stream().map(database -> database.getPhonenum())
				.collect(Collectors.toList());
		System.out.println(phone);
		List<String> phonenumber = databases.stream().flatMap(database -> database.getPhonenum().stream())
				.collect(Collectors.toList());
		System.out.println(phonenumber);

	}

}
