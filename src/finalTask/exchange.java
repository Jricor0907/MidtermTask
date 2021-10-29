package finalTask;

import java.util.Scanner;

public class exchange {

	public static void main(String[] args) {
	try (Scanner sc = new Scanner (System.in)) {
		System.out.println("Choose one from the following options");
		System.out.println("1)USD to Є ");
		System.out.println("2)Є to USD");
		System.out.println("3)₤ to USD");
		int exchange = sc.nextInt();
		switch (exchange) {
		case 1: {
				System.out.println("Please,enter the number of USD");
				
				double usd = sc.nextDouble();
				
				if (usd>0) {
					System.out.println(usd + " USD is " + usd*0.908 + "Є. Thank you for prefer Juan's currency exchange.");
				}
				else { 
					System.out.println("Please put in numbers of USD");
				}
		}
		break;
		case 2:{
			System.out.println("Please,enter the number of Є");
			
			double euro = sc.nextDouble();
			
			if (euro>0) {
				System.out.println(euro + " USD is " + euro*1.101 + "USD. Thank you for prefer Juan's currency exchange.");
			}
			else { 
				System.out.println("Please put in numbers of Є");
			}
	}
	break;
		case 3: {
			System.out.println("Please enter the numbers of ₤");
			double pounds = sc.nextDouble();
			
			if (pounds>=0) {
				System.out.println(pounds + "₤ is " +pounds*1.28 + " USD. Thank you for prefer Juan's currency exchange. ");
			}
			else {
				System.out.println("Please put number of ₤ ");
			}
	
		}
		break;
		}
		sc.close();
		 }
	}
	}