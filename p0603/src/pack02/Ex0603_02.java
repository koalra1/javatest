package pack02;

import java.util.Scanner;

public class Ex0603_02 {
	   
	static Scanner scan = new Scanner(System.in);
	   public static void main(String[] args) {
	      
	      int[] ball = new int[45];
	      
	      
	      LottoProcess2 p = new LottoProcess2();
	      loop1:while(true) {
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
	            
	         switch (choice) {
	         case 1://로또번호 생성
	            p.lotto_insert(ball);
	            
	            break;
	         case 2://번호 썩기, 출력
	            p.lotto_random(ball);
	            
	            break;
	         case 3: //로또번호 6개 입력 
	            p.lotto_input(ball);
	            
	            break;
	         case 4://당첨 번호 출력
	            p.lotto_result(ball);
	            
	            break;
	         case 5://당첨확인
	            p.lotto_winner(ball);
	            break;
	         default :
	            System.out.println("잘못 입력하셧습니다.");
	            break;
	         
	         
	         case 0:// 종료
	            System.out.println("종료");
	            break loop1;
	            
	         }
	         }
	         
	      }
	      
	      
	      

	   }
