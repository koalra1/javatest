package pack01;

import java.util.ArrayList;
import java.util.Scanner;

public class StuManager {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// ArrayList<Student> as = new ArrayList<Student>();
		// 학생성적저장 객체 배열
		ArrayList list = new ArrayList();

		Stu_Process p = new Stu_Process();

		loop1:while (true) {

			System.out.println("[ 학생 성적 프로그램 ]");
			System.out.println("1.학생 성적 추가");
			System.out.println("2.학생 성적 출력");
			System.out.println("3.학생 성적 수정");
			System.out.println("4.학생 성적 검색");
			System.out.println("5.등수처리");
			System.out.println("0.프로그램 종료");
			System.out.println("-------------------------------------------------");
			System.out.println("원하는 번호를 입력 : ");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:// 1.학생점수 추가
				p.student_insert(list);

				break;

			case 2:// 2.학생성적 출력
					// 1.상단출력
					// 2.for문을 사용해서
					// 3.list에 있는 데이터 출력
					// 번호 이름 국어 영어 수학 합계 평균 등수
				p.student_print(list);

				break;

			case 3:// 3.학생성적 수정

				p.student_update(list);
				break;

			case 4:// 4.학생성적검색
					
				p.student_search(list);
				break;
				
			case 5: // 5.등수처리
				p.student_rank(list);
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			}// switch

		} // while

	}// main

}// class