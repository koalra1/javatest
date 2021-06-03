package pack01;

import java.util.Scanner;

public class Ex0603_03 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("[쇼핑몰]");
			System.out.println("1.TV구매");
			System.out.println("2.SmartPhone구매");
			System.out.println("3.Computer구매");
			System.out.println("4.구매내역 확인");
			System.out.println("5.잔액충전");
			
			int choice = scan.nextInt();
			
			switch(choice) {
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
				int cash1 = 0;
				System.out.println("충전할 금액 입력 : (0.번입력시 상위메뉴 이동)");
				int cash = scan.nextInt();
				if(cash==0) {
					System.out.println("상위메뉴 이동");
					break;
				}
				cash1 = cash+b.getMoney();
				b.setMoney(cash1);
				System.out.println("충전한 금액 :"+cash);
				System.out.println("현재 잔액 : "+cash1);
				
				break;
			}
		
		
		}

	}

}
