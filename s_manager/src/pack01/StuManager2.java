package pack01;

import java.util.ArrayList;
import java.util.Scanner;

public class StuManager2 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// 1.Student2
		// 2.Stu_Process2
		// 학생성적프로그램
		ArrayList list = new ArrayList();
		Stu_Process2 p = new Stu_Process2();
	
		while(true) {
			p.mainprint();
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1://입력
				
				p.stu_input(list);
		
				break;
			case 2:
				p.stu_output(list);
				break;
			case 3:
				p.stu_update(list);
				break;
			case 4:
				p.stu_search(list);
				break;
			case 5:
				p.stu_rank(list);
				break;
			case 0:
				System.out.println("프로그램 종료");
				break;
			}//switch
		}//while
		
	}//main

}//class
