package pack01;

import java.util.Scanner;

public class Ex0603_02 {

	public static void main(String[] args) {
		int[] ball = new int[45];
		Scanner scan = new Scanner(System.in);
		LottoProcess p = new LottoProcess();
		
		while(true) {
			System.out.println();
	         System.out.println("[로또 프로그램]");
	         System.out.println("1. 로또번호 생성");
	         System.out.println("2. 로또번호 섞기");
	         System.out.println("3. 로또 개인번호 6개입력");
	         System.out.println("4. 로또번호 당첨번호 출력");
	         System.out.println("5. 당첨확인");
	         System.out.println("0. 종료");
	         System.out.println("===========================");
	         System.out.println("원하는 번호를 입력하세요");
	         int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				p.insert(ball);
				break;
			case 2:
				p.random(ball);
				break;
			case 3:
				p.input(ball);
				break;
			case 4:
				p.result(ball);
				break;
			case 5:
				p.winck(ball);
				break;
			case 0:
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
