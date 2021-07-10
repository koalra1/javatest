package pack01;

import java.util.Scanner;

public class LottoProcess {
	Scanner scan = new Scanner(System.in);
	int[] sel = new int[6];
	int[] win = new int[6];
	void insert(int[]ball) {
		for(int i=0; i<ball.length;i++) {
			ball[i] = i+1;
		}
		System.out.println("45개 번호 생성 완료");
	}
	void random(int[]ball) {
		int temp=0;
		for(int i=0; i<500; i++) {
			int ran = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[ran];
			ball[ran] = temp;
			
		}
		System.out.println("로또 섞기 완료");
	}
	void input(int[]ball) {
		for(int i=0; i<sel.length; i++) {
			System.out.println((i+1)+"번째 번호 입력");
			sel[i] = scan.nextInt();
		}
	}
	void result(int[]ball) {
		System.out.println("당첨번호");
		for(int i=0; i<6; i++) {
			System.out.print(ball[i]+" ");
		}
	}
	void winck(int[] ball) {
		int count=0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(sel[i] == ball[j]) {
					win[count] = sel[i];
					count++;
				}
			}
		}
		System.out.println("당첨번호");
		for(int i=0; i<count; i++) {
			System.out.print(win[i]+ " ");
		}
		System.out.println("입력한번호");
		for(int i=0; i<6; i++) {
			System.out.print(sel[i]+" ");
		}
	}



}//class
