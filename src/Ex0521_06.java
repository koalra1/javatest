import java.util.Scanner;

public class Ex0521_06 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		//10명의 학생을 입력받음.
		Student2[] s = new Student2[10];
		String search_name = "";
		int search_num = 1;
		//무한반복
		loop1:while(true) {
			
			menu_print();
			
			
			int choice = scan.nextInt();
		
			switch(choice) {
			
			case 1: //학생 성적 입력
			
				student_insert(s); //1.학생성적 추가 메소드
				
				break;
				
			case 2:
				
				stu_output(s); //2.학생성적 출력 메소드
		
				break;
			
			case 3: //수정
				break;
				
			case 4://학생 개인 출력
				System.out.println("이름을 입력하세요");
				search_name = scan.next();
				System.out.println(i+"."+);
				if(s[0].name.contains(search_name)) {
					System.out.println("0번입력 상위메뉴이동");
					break;
				}
				
				System.out.println("찾는 학생 번호를 입력하세요");
				search_num = scan.nextInt();
				
				System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
				System.out.println("=====================================");
				for(int i=0; i<Student2.count;i++) {
				System.out.print(s[i].stu_number+"\t");
				System.out.print(s[i].name+"\t");
				System.out.print(s[i].kor+"\t");
				System.out.print(s[i].eng+"\t");
				System.out.print(s[i].math+"\t");
				System.out.print(s[i].total+"\t");
				System.out.printf("%.2f\t",s[i].avg);
				System.out.print(s[i].rank+"\n");
				
				}
				break;
				
			case 5: // 등수확인
				break;
				
				
			case 0: //프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			}//switch
			
			
		}//while

	}//main

	//상단메뉴 출력 메소드
	static void menu_print() {
	System.out.println("[ 학생성적처리 프로그램 ]");
	System.out.println("1. 학생성적 입력");
	System.out.println("2. 학생성적 출력");
	System.out.println("3. 학생성적 수정");
	System.out.println("4. 학생성적 검색");
	System.out.println("5. 등수처리");
	System.out.println("0. 프로그램 종료");
	System.out.println("========================");
	System.out.println("원하는 번호를 입력하세요.>>");
	
	}//상단메뉴 출력 메소드
	
	//1.학생성적 추가 메소드
	static void student_insert(Student2[]s) {
		//배열만큼 반복입력
		for(int i=Student2.count; i<s.length; i++) {
			
			//반복 시작
			System.out.println("학생이름을 입력하세요.(0.상위메뉴이동)");
			String name = scan.next();
			if(name.equals("0")) {
				//0이 입력되었을경우
				System.out.println("상위메뉴로 이동합니다.!");
				break;
			}else {
				//0이 아닌 경우
				System.out.println("국어점수를 입력하세요.");
				int kor = scan.nextInt();
				System.out.println("영어점수를 입력하세요.");
				int eng = scan.nextInt();
				System.out.println("수학점수를 입력하세요.");
				int math = scan.nextInt();
				
				//학생성적 등록
				s[i] = new Student2(name,kor,eng,math);
				System.out.println("1명의 학생이 등록되었습니다.");
				
			}
			//반복 끝
		
		}
	}//1.학생성적 추가 메소드
	
	
	//2.학생성적 출력 메소드
	static void stu_output(Student2[] s) {
		
		System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("=====================================");
		
		for(int i=0; i<Student2.count; i++) {
			System.out.print(s[i].stu_number+"\t");
			System.out.print(s[i].name+"\t");
			System.out.print(s[i].kor+"\t");
			System.out.print(s[i].eng+"\t");
			System.out.print(s[i].math+"\t");
			System.out.print(s[i].total+"\t");
			System.out.printf("%.2f \t",s[i].avg);
			System.out.print(s[i].rank+"\n");
		}
	}//2.학생성적 출력 메소드
	
}//class
