package pack01;

import java.util.Scanner;

public class Ex0528_02 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Lotto_Process p = new Lotto_Process();
		int[]ball = new int[45];
		while(true) {
			
			System.out.println("[ 로또 프로그램 ]");
			System.out.println("1.로또번호 생성");
			System.out.println("2.로또번호 섞기");
			System.out.println("3.로또개인번호 6개입력");
			System.out.println("4.로또당첨번호 출력");
			System.out.println("============================");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			
			switch(choice){
			case 1: //1.로또번호 생성
				p.lotto_insert(ball);
				break;
			case 2: //2.로또번호 섞기
				//1.temp변수선언,2.random만들기 3.for문섞기
				p.lotto_random(ball);
				break;
			case 3:
				
				break;
			case 4:
				break;
			}
		}
		

	}

}
