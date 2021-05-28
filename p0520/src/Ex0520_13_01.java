import java.util.Scanner;

public class Ex0520_13_01 {

	public static void main(String[] args) {
		// 학생성적프로그램

		
		Scanner scan = new Scanner(System.in);
		Student[] s = new Student[10];
		String search_name="";
		int search_num=0;
		
		while(true) {
			System.out.println("[학생 성적 프로그램]");
			System.out.println("1.학생 성적 추가");
			System.out.println("2.학생 성적 출력");
			System.out.println("3.학생 성적 수정");
			System.out.println("4.학생 개인 성적 검색");
			System.out.println("5.등수 정리");
			System.out.println("0.프로그램 종료");
			System.out.println("------------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			switch(choice) {
			case 1: //추가
				for(int i=0; i<s.length;i++) {
					System.out.println("이름을 입력하세요 0번초기화");
					String check = scan.next();
					if(check.equals("")) {
						System.out.println("초기메뉴로 나갑니다.");
						break;
					}
					s[i] = new Student();
					s[i].name = check;
					System.out.println("국어점수입력");
					s[i].kor = scan.nextInt();
					System.out.println("영어점수입력");
					s[i].eng = scan.nextInt();
					System.out.println("수학점수입력");
					s[i].math = scan.nextInt();
					s[i].total = s[i].kor+s[i].eng+s[i].math;
					s[i].avg = s[i].total/3.0;
					
				}
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 0:
				
				break;
			}
		}

	}

}
