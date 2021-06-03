package pack01;

import java.util.Scanner;

public class Ex0603_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] ball = new int[45];
		LottoProcess p = new LottoProcess();
		//int[] numbers = new int[6];
		
		while(true) {
			System.out.println("[ 로또 프로그램 ]");
			System.out.println("1. 로또번호 생성");
			System.out.println("2. 로또번호 섞기");
			System.out.println("3. 로또 개인번호 6개입력");
			System.out.println("4. 로또번호 당첨번호 출력");
			
			System.out.println("--------------------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			switch (choice) {
			case 1: //로또번호 생성
				p.lotto_insert(ball);
				break;
			case 2: //로또번호 섞기
				//1.temp 2.random 3.for섞기
				p.lotto_random(ball);
				break;
			case 3:
				p.lotto_input(ball);
				break;
			case 4:
				p.lotto_output(ball);
				break;
				
			}
		}
		
		
		
		

	}

}