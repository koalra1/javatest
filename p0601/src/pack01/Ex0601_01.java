package pack01;

import java.util.Scanner;

public class Ex0601_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Buyer b = new Buyer();
		
		while(true) {
			System.out.println("[상품관리]");
			System.out.println("1.컴퓨터 구매");
			System.out.println("2.스마트폰 구매");
			System.out.println("3.Tv 구매");
			System.out.println("4.구매목록관리");
			System.out.println("5.잔액충전");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				b.buy(new Computer());
				b.info();
				
				break;
			case 2:
				b.buy(new SmartPhone());
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
				System.out.println("얼마를 충전하실건가요??(만원)");
				System.out.println(b.money+"의 잔액이 남아있습니다.");
				int cash = scan.nextInt();
				cash = cash + b.getMoney();
				b.setMoney(cash);
				System.out.println("충전완료!!"+cash+"의 잔여금액이 있습니다.");
				break;
			}
		}

	}

}
