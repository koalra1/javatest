import java.util.Scanner;

public class Ex0525_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck();
		
		loop1:while(true) {
			d.menu_print();
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1: //카드 1장출력
				System.out.println("카드번호입력");
				int num = scan.nextInt();
				d.print_1card(num);
				
				break;
			case 2: //카드 5장출력
				d.print_5card();
				break;
			case 3: //카드 52장출력
				d.print_52card();
				break;
			case 4: //카드 섞기
				d.shuffle();
				break;
			case 5: //7장배분
				d.handOut7card();
				break;
			case 0: //종료
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			}
		}
		
	}
}
