package pack01;

import java.util.Scanner;

public class Ex0603_03 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Scanner scan = new Scanner(System.in);
		while (true) {
			b.main();
		
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				b.buy(new Tv());
				b.print();
				break;
			case 2:
				b.buy(new SmartPhone());
				b.print();
				break;
			case 3:
				b.buy(new Computer());
				b.print();
				break;
			case 4:
				b.summary();
				break;
			case 5:

				b.cash();

				break;
			}

		}

	}

}
