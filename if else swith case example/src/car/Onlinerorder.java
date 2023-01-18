package car;

import java.util.Scanner;

public class Onlinerorder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Welcome to onlinecar shopping");
		System.out.println("Enter '1' to buy the car:");
		System.out.println("Enter '2' to sell the car:");

		int input = s.nextInt();

		if (input == 1) {
			System.out.println("list of cars available:");
			System.out.println("1.kia,2.Maruti Suzuki,3.Hyundai Verna,4.Mahindra Thar");
			System.out.println("Choose one of the model and enter the name of the model as mentioned:");
			s.nextLine();
			String car = s.nextLine().toLowerCase();
			switch (car) {
			case "kia":
				System.out.println("you have selected kia celtos");
				System.out.println("The car current prices varies for petrol and diesel");
				System.out.println(
						"Kia seltos with petrol version costs 10,54,000 incl all taxes which has a 1497 cc, Manual, 16.8 kmpl");
				System.out.println(
						"kia seltos with diesel version costs 13,23,000  incl all taxes which has a 1493 cc, Manual, Diesel, 20.8 kmpl");
				System.out.println("Press 1 for petrol and 2 for diesel:");
				int version = s.nextInt();

				if (version == 1) {
					System.out.println("you have choose kia celtos with petrol version");
					System.out.println("So total cost for kia seltos is 10,54,000 which takes 2 months delivery");
					System.out.println("If u want to confrom the order type 1 otherwise 0:");
					s.nextLine();
					int choice = s.nextInt();
					if (choice == 1) {
						System.out.println("Enter your phone number here:");
						int phno = s.nextInt(10);
						System.out.println(
								"you will get a call from our side and be ready for documentation process,you will be asked to upload all the required files");
						System.out.println("thank you for choosing our onlineservices");
						break;
					} else if (choice == 0) {
						break;
					}
				} else {
					System.out.println("you have choose kia celtos with diesel version");
					System.out.println("So total cost for kia seltos is 13,24,000 which takes 2 months delivery");
					System.out.println("If u want to confrom the order type 1 otherwise 0:");
					s.nextLine();
					int choice = s.nextInt();
					if (choice == 1) {
						System.out.println("Enter your phone number here:");
						s.nextLine();
						int phno = s.nextInt(10);
						System.out.println(
								"you will get a call from our side and be ready for documentation process,you will be asked to upload all the required files");
						System.out.println("thank you for choosing our onlineservices");
						break;
					} else if (choice == 0) {
						break;
					}
				}
			case "Maruti Suzuki":
				System.out.println("you have selected Maruthi Suzuki");
				System.out.println("The car current prices varies for petrol and diesel");
				System.out.println(
						"Maruti Suzuki with petrol version costs 15,54,000 incl all taxes which has a 1697 cc, Manual, 16.8 kmpl");
				System.out.println(
						"Maruti Suzuki with diesel version costs 16,23,000  incl all taxes which has a 1693 cc, Manual, Diesel, 20.8 kmpl");
				System.out.println("Press 1 for petrol and 2 for diesel:");
				int versionn = s.nextInt();
				if (versionn == 1) {
					System.out.println("you have choose Maruti Suzuki  with petrol version");
					System.out.println("So total cost for Maruti Suzuki is 15,54,000 which takes 2 months delivery");
					System.out.println("If u want to confrom the order type 1 otherwise 0:");
					s.nextLine();
					int choicee = s.nextInt();
					if (choicee == 1) {
						System.out.println("Enter your phone number here:");
						//s.nextLine();
						int phno = s.nextInt(10);
						System.out.println(
								"you will get a call from our side and be ready for documentation process,you will be asked to upload all the required files");
						System.out.println("thank you for choosing our onlineservices");
						break;
					} else if (choicee == 0) {
						return;
					}
				} else {
					System.out.println("you have choose Maruti Suzuki with diesel version");
					System.out.println("So total cost for Maruti Suzuki is 16,24,000 which takes 2 months delivery");
					System.out.println("If u want to confrom the order type yes otherwise no:");
					s.nextLine();
					int choice = s.nextInt();
					if (choice == 1) {
						System.out.println("Enter your phone number here:");
						s.nextLine();
						int phno = s.nextInt(10);
						System.out.println(
								"you will get a call from our side and be ready for documentation process,you will be asked to upload all the required files");
						System.out.println("thank you for choosing our onlineservices");
						break;
					} else if (choice == 0) {
						return;
					}

				}
			case "Hyundai Verna":
				System.out.println("you have selected Hyundai Vernas");
				System.out.println("The car current prices varies for petrol and diesel");
				System.out.println(
						"Hyundai Verna with petrol version costs 21,54,000 incl all taxes which has a 1800cc, Manual, 16.8 kmpl");
				System.out.println(
						"Hyundai Verna with diesel version costs 22,23,000  incl all taxes which has a 1820 cc, Manual, Diesel, 20.8 kmpl");
				System.out.println("Press 1 for petrol and 2 for diesel:");
				//s.nextLine();
				int versionnn = s.nextInt();
				if (versionnn == 1) {
					System.out.println("you have choose Hyundai Verna  with petrol version");
					System.out.println("So total cost for Hyundai Verna is 21,54,000 which takes 2 months delivery");
					System.out.println("If u want to confrom the order type yes otherwise no:");
					s.nextLine();
					int choiceee = s.nextInt();
					if (choiceee == 1) {
						System.out.println("Enter your phone number here:");
						//s.nextLine();
						int phno = s.nextInt(10);
						System.out.println(
								"you will get a call from our side and be ready for documentation process,you will be asked to upload all the required files");
						System.out.println("thank you for choosing our onlineservices");
						break;
					} else if (choiceee == 0) {
						break;
					}
				} else {
					System.out.println("you have choose Hyundai Verna with diesel version");
					System.out.println("So total cost for Hyundai Verna is 22,24,000 which takes 2 months delivery");
					System.out.println("If u want to confrom the order type ye1 otherwise 0:");
					//s.nextLine();
					int choice = s.nextInt();
					if (choice == 1) {
						System.out.println("Enter your phone number here:");
						//s.nextLine();
						int phno = s.nextInt(10);
						System.out.println(
								"you will get a call from our side and be ready for documentation process,you will be asked to upload all the required files");
						System.out.println("thank you for choosing our onlineservices");
						break;
					} else if (choice == 0) {
						break;
					}

				}
			case "Mahindra Thar":
				System.out.println("you have selected Mahindra Thar");
				System.out.println("The car current prices varies for petrol and diesel");
				System.out.println(
						"Mahindra Thar with petrol version costs 11,54,000 incl all taxes which has a 1397 cc, Manual, 11.8 kmpl");
				System.out.println(
						"Mahindra Thar with diesel version costs 15,23,000  incl all taxes which has a 1493 cc, Manual, Diesel, 14.8 kmpl");
				System.out.println("Press 1 for petrol and 2 for diesel:");
				//s.nextLine();
				int versionnnn = s.nextInt();
				if (versionnnn == 1) {
					System.out.println("you have choose Mahindra Thar  with petrol version");
					System.out.println("So total cost for Mahindra Thar is 11,54,000 which takes 2 months delivery");
					System.out.println("If u want to confrom the order type 1 otherwise 0:");
					s.nextLine();
					int choicee = s.nextInt();
					if (choicee == 1) {
						System.out.println("Enter your phone number here:");
						//s.nextLine();
						int phno = s.nextInt(10);
						System.out.println(
								"you will get a call from our side and be ready for documentation process,you will be asked to upload all the required files");
						System.out.println("thank you for choosing our onlineservices");
						break;
					} else if (choicee == 0) {
						break;
					}
				} else {
					System.out.println("you have choose Mahindra Thar with diesel version");
					System.out.println("So total cost for Mahindra Thar is 15,23,000 which takes 2 months delivery");
					System.out.println("If u want to confrom the order type yes otherwise no:");
					//s.nextLine();
					int choice = s.nextInt();
					if (choice == 1) {
						System.out.println("Enter your phone number here:");
						//s.nextLine();
						int phno = s.nextInt(10);
						System.out.println(
								"you will get a call from our side and be ready for documentation process,you will be asked to upload all the required files");
						System.out.println("thank you for choosing our onlineservices");
						break;
					} else if (choice == 0) {
						break;
					}

				}

			}
		} else {
			System.out.println("choose the car model which we will accept:");
			System.out.println("1.kia,2.Maruti Suzuki,3.Hyundai Verna,4.Mahindra Thar");
			System.out.println("Choose one of the model:");
			s.nextLine();
			String model = s.nextLine();

			switch (model) {
			case "kia":
				System.out.println("enter the year purchased:");
				s.nextLine();
				int aa = s.nextInt();
				int year = 2023 - aa;
				if (year <= 3) {
					System.out.println("the car has been used for" + year);
					System.out.println("enter the number of kilometers driven till now:");
					s.nextLine();
					int kilo = s.nextInt();
					if (kilo <= 3000) {
						System.out.println("We would ready to buy the car with a price of 8,78,000Rs");
						System.out.println("If u want to confrom the order type 1 otherwise 0:");
						//s.nextLine();
						int choice = s.nextInt();
						if (choice == 1) {
							System.out.println("Enter your phone number here:");
							//s.nextLine();
							int phno = s.nextInt(10);
							System.out.println(
									"you will get a call from our side and be ready for documentation process,you will be asked to upload all the required files");
							System.out.println("thank you for choosing our onlineservices");
							break;
						} else if (choice == 0) {
							break;
						}
					}
				} else {
					System.out.println("the car has been used for" + year);
					System.out.println("enter the number of kilometers driven till now(in kms):");
					s.nextLine();
					int kiloo = s.nextInt();
					if (kiloo <= 8000) {
						System.out
								.println("We would ready to buy the car with a price of 6,78,000Rs incl of all taxes");
						System.out.println("If u want to confrom the order type 1 otherwise 0:");
						//s.nextLine();
						int choice = s.nextInt();
						if (choice == 1) {
							System.out.println("Enter your phone number here:");
							//s.nextLine();
							int phno = s.nextInt(10);
							System.out.println(
									"you will get a call from our side and be ready for documentation process,you will be asked to upload all the required files");
							System.out.println("thank you for choosing our onlineservices");
							break;
						} else if (choice == 0) {
							break;
						}
					}
				}
			case "Maruti Suzuki":
				System.out.println("enter the year purchased:");
				s.nextLine();
				int aaa = s.nextInt();
				int yearr = 2023 - aaa;
				if (yearr <= 3) {
					System.out.println("the car has been used for" + yearr);
					System.out.println("enter the number of kilometers driven till now:");
					s.nextLine();
					int kilooo = s.nextInt();
					if (kilooo <= 3000) {
						System.out.println("We would ready to buy the car with a price of 13,78,000Rs");
						System.out.println("If u want to confrom the order type 1 otherwise 0:");
						//s.nextLine();
						int choice = s.nextInt();
						if (choice == 1) {
							System.out.println("Enter your phone number here:");
							//s.nextLine();
							int phno = s.nextInt(10);
							System.out.println(
									"you will get a call from our side and be ready for documentation process,you will be asked to upload all the required files");
							System.out.println("thank you for choosing our onlineservices");
							break;
						} else if (choice == 0) {
							break;
						}
					}
				} else {
					System.out.println("the car has been used for" + yearr);
					System.out.println("enter the number of kilometers driven till now(in kms):");
					s.nextLine();
					int kiloo = s.nextInt();
					if (kiloo <= 8000) {
						System.out
								.println("We would ready to buy the car with a price of 15,78,000Rs incl of all taxes");
						System.out.println("If u want to confrom the order type 1 otherwise 0:");
						//s.nextLine();
						int choice = s.nextInt();
						if (choice == 1) {
							System.out.println("Enter your phone number here:");
							//s.nextLine();
							int phno = s.nextInt(10);
							System.out.println(
									"you will get a call from our side and be ready for documentation process,you will be asked to upload all the required files");
							System.out.println("thank you for choosing our onlineservices");
							break;
						} else if (choice == 0) {
							break;
						}
					}
				}
			case "Hyundai Verna":
				System.out.println("enter the year purchased:");
				s.nextLine();
				int aaaa = s.nextInt();
				int yearrr = 2023 - aaaa;
				if (yearrr <= 3) {
					System.out.println("the car has been used for" + yearrr);
					System.out.println("enter the number of kilometers driven till now:");
					s.nextLine();
					int kilooo = s.nextInt();
					if (kilooo <= 3000) {
						System.out.println("We would ready to buy the car with a price of 12,78,000Rs");
						System.out.println("If u want to confrom the order type yes otherwise no:");
						s.nextLine();
						int choice = s.nextInt();
						if (choice == 1) {
							System.out.println("Enter your phone number here:");
							//s.nextLine();
							int phno = s.nextInt(10);
							System.out.println(
									"you will get a call from our side and be ready for documentation process,you will be asked to upload all the required files");
							System.out.println("thank you for choosing our onlineservices");
							break;
						} else if (choice == 0) {
							break;
						}
					}
				} else {
					System.out.println("the car has been used for" + yearrr);
					System.out.println("enter the number of kilometers driven till now(in kms):");
					s.nextLine();
					int kiloo = s.nextInt();
					if (kiloo <= 8000) {
						System.out
								.println("We would ready to buy the car with a price of 16,78,000Rs incl of all taxes");
						System.out.println("If u want to confrom the order type 1 otherwise 0:");
						s.nextLine();
						int choice = s.nextInt();
						if (choice == 1) {
							System.out.println("Enter your phone number here:");
							//s.nextLine();
							int phno = s.nextInt(10);
							System.out.println(
									"you will get a call from our side and be ready for documentation process,you will be asked to upload all the required files");
							System.out.println("thank you for choosing our onlineservices");
							break;
						} else if (choice == 0) {
							break;
						}
					}
				}
			case "Mahindra Thar":
				System.out.println("enter the year purchased:");
				int aaaaa = s.nextInt();
				int yearrrr = 2023 - aaaaa;
				if (yearrrr <= 3) {
					System.out.println("the car has been used for" + yearrrr);
					System.out.println("enter the number of kilometers driven till now:");
					s.nextLine();
					int kilooo = s.nextInt();
					if (kilooo <= 3000) {
						System.out.println("We would ready to buy the car with a price of 8,78,000Rs");
						System.out.println("If u want to confrom the order type yes otherwise no:");
						s.nextLine();
						int choice = s.nextInt();
						if (choice == 1) {
							System.out.println("Enter your phone number here:");
							//s.nextLine();
							int phno = s.nextInt(10);
							System.out.println(
									"you will get a call from our side and be ready for documentation process,you will be asked to upload all the required files");
							System.out.println("thank you for choosing our onlineservices");
							break;
						} else if (choice == 0) {
							break;
						}
					}
				} else {
					System.out.println("the car has been used for" + yearrrr);
					System.out.println("enter the number of kilometers driven till now(in kms):");
					s.nextLine();
					int kiloo = s.nextInt();
					if (kiloo <= 8000) {
						System.out
								.println("We would ready to buy the car with a price of 11,78,000Rs incl of all taxes");
						System.out.println("If u want to confrom the order type 1 otherwise 0:");
						int choice = s.nextInt();
						if (choice == 1) {
							System.out.println("Enter your phone number here:");
							int phno = s.nextInt(10);
							System.out.println(
									"you will get a call from our side and be ready for documentation process,you will be asked to upload all the required files");
							System.out.println("thank you for choosing our onlineservices");
							break;
						} else if (choice == 0) {
							return;
						}
					}
				}
			}

		}

	}
}
