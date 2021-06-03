package pack02;

import java.util.Scanner;

public class LottoProcess2 {

	 Scanner scan = new Scanner(System.in);
	   int[] sel = new int[6];
	   int[] win = new int[6];
	   
	   //로또번호 생성
	   void lotto_insert(int[] ball) { //인스턴스 메소드
	      for(int i=0; i<ball.length; i++) {
	         ball[i]=i+1;
	      }
	      System.out.println("45개 번호가 생성되었습니다.");
	   }//로또번호 생성
	   
	   //로또번호 섞기
	   void lotto_random(int[] ball) {
	      int temp=0;
	      for(int i=0; i<500; i++) {
	         int random = (int)(Math.random()*45);
	         temp = ball[0];
	         ball[0] = ball[random];
	         ball[random] = temp;
	      }
	      System.out.println("로또번호 섞기가 완료 되었습니다.");
	      
	      
	   }//로또 섞기
	   
	   void lotto_input(int[] ball) {//3. 6자리번호입력
	      for(int i=0; i<sel.length; i++) {
	         System.out.println((i+1)+"번호를 입력하세요");
	         sel[i] = scan.nextInt();
	      }

	   
	   }//3. 6자리번호입력
	   
	   void lotto_result(int[] ball) { //4.당첨번호 출력
	      System.out.println("당첨번호");
	      for(int i=0; i<6; i++) {
	         System.out.print(+ball[i]+" ");
	      }
	   }//4.당첨번호 출력
	   
	   void lotto_winner(int[] ball) {//5.당첨확인
	      int count = 0;
	      for(int i=0; i<6; i++) {
	         for(int j=0; j<6; j++) {
	            if(sel[i] == ball[j]) {
	               win[count] = sel[i];
	               count++;
	            }
	         }
	      }
	      System.out.println("당첨 번호");
	      
	      for(int i=0; i<count; i++) {
	         System.out.print(win[i]+ " ");
	      }
	      System.out.println("입력한번호");
	      for(int i=0; i<6; i++) {
	         System.out.print(sel[i] +" ");
	      }
	      

	      
	   }//5.당첨확인
	   
	   //로또 결과

	}
