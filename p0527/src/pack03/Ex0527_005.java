package pack03;

import java.util.Scanner;

public class Ex0527_005 {
	static Scanner scan = new Scanner(System.in);

public static void main(String[] args) {
	
	Student5[] s = new Student5[10];
	Score_Process5 score = new Score_Process5();
	
	loop1:while(true) {
		
		score.main_print(s);
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			score.stu_input(s);
			break;
		case 2:
			score.top_title();
			score.stu_output(s);
			break;
		case 3:
			score.stu_update(s);
			break;
		case 4:
			score.stu_oneoutput(s);
			break;
		case 5:
			score.ranking(s);
			break;
		case 0:
			System.out.println("프로그램 종료");
			break loop1;
			
		}
	}



	}//main
}//class