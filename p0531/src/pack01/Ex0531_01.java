package pack01;

import java.util.Scanner;

public class Ex0531_01 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
	
	Buyer b = new Buyer();
	
	while(true) {
		System.out.println("[ 쇼핑몰 구매 ]");
		System.out.println("1.컴퓨터 구매");
		System.out.println("2.스마트폰 구매");
		System.out.println("3.TV 구매");
		System.out.println("4.구매목록");
		System.out.println("5.잔액충전");
		System.out.println("===================");
		
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			b.buy(new Computer());
			b.info();
			break;
		case 2:
			b.buy(new Smartphone());
			b.info();
			break;
		case 3:
			b.buy(new Tv());
			b.info();
			break;
		case 4:
			b.summary();
			b.info();
			break;
		case 5:
			b.cash();
			b.info();
			break;
		}
	
	}
		
	}
}
		
		
		
		

//		Buyer b = new Buyer();
//		
//		while (true) {
//			System.out.println("[쇼핑몰 프로그램]");
//			System.out.println("1.맥북노트북 구매");
//			System.out.println("2.갤럭시 구매");
//			System.out.println("3.oledtv 구매");
//			System.out.println("4.구매목록 보기");
//			System.out.println("5.현금충전");
//			System.out.println("0.프로그램 종료");
//
//			int choice = scan.nextInt();
//			switch (choice) {
//			case 1:
//				b.buy(new Computer());
//				b.myInfo();
//				break;
//			case 2:
//				b.buy(new Smartphone());
//				b.myInfo();
//				break;
//			case 3:
//				b.buy(new Tv());
//				b.myInfo();
//				break;
//			case 4: //구매목록
//				b.summary();
//				b.myInfo();
//				break;
//			case 5: //현금충전
//				System.out.println("얼마를 충전하실껀가요 (0.번 상위메뉴이동)");
//				int cash = scan.nextInt();
//				if(cash==0) {
//					System.out.println("상위메뉴 이동");
//					break;
//				}
//				cash = cash+b.getMoney();
//				b.setMoney(cash);
//				System.out.println(cash+"(만원)이 충전되었습니다.");
//				b.myInfo();
//				break;
//
//			}
//
//		}
//
//	}//main
//
//}// class
