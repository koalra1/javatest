package pack02;

import java.util.Scanner;

public class Ex0601_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Buyer2 b = new Buyer2();
		
		
		while(true) {
			System.out.println("[구매프로그램]");
			System.out.println("1.컴퓨터 구매");
			System.out.println("2.스마트폰 구매");
			System.out.println("3.Tv 구매");
			System.out.println("4.구매관리");
			System.out.println("5.잔액충전");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				b.buy(new Computer2());
				b.info();
				break;
			case 2:
				b.buy(new SmartPhone2());
				b.info();
				break;
			case 3:
				b.buy(new Tv2());
				b.info();
				break;
			case 4:
				b.summary();
				b.info();
				break;
			case 5:
				System.out.println("충전금액 입력");
				int cash = scan.nextInt();
				cash = cash + b.getMoney();
				b.setMoney(cash);
				System.out.println("잔액이"+cash+"만원있습니다.");
				
				break;
			}
		}
		
	}

}
