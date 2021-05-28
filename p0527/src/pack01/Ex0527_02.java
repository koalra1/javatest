package pack01;

import java.util.Scanner;

public class Ex0527_02 {

	public static void main(String[] args) {
		// oled Tv 구매
		Scanner scan = new Scanner(System.in);
		Buyer b1 = new Buyer();
		
		while(true) {
			System.out.println("[ 쇼핑몰 프로그램 ]");
			System.out.println("1.맥북노트북 구매");
			System.out.println("2.아이폰 구매");
			System.out.println("3.OLEDTV 구매");
			System.out.println("4.구매목록 보기");
			System.out.println("5.현금충전");
			int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			b1.buy(new Computer());
			b1.myInfo();
			break;
		case 2:
			b1.buy(new SmartPhone());
			b1.myInfo();
			break;
		case 3:
			b1.buy(new Tv());
			b1.myInfo();
			break;
		case 4:
			break;
			
			
		}
		
		}

	}

}
