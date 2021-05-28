package pack03;

import java.util.Scanner;

public class Score_Process5 {
	static Scanner scan = new Scanner(System.in);
	String search_name = "";
	int search_num = 0;
	
	void main_print(Student5[]s) {
		System.out.println("[학생 성적 프로그램]");
		System.out.println("1.학생성적 입력");
		System.out.println("2.학생성적 출력");
		System.out.println("3.학생성정 수정");
		System.out.println("4.학생 개인성적 출력");
		System.out.println("5.등수 확인");
		System.out.println("0.프로그램 종료");
	}
	
	void stu_input(Student5[]s) {
		String name = "";
		int kor=0,eng=0,math=0;
		for(int i=Student5.count;i<s.length;i++) {
			System.out.println("이름을 입력하세요 (0번초기메뉴)");
			String check = scan.next();
			if(check.equals("0")) {
				System.out.println("찾는값이 없습니다.");
				break;
			}
			name = check;
			System.out.println("국어점수를 입력하세요");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math = scan.nextInt();
			s[i] = new Student5(name,kor,eng,math);
			
		
		}
	}//1.입력 끝
	void top_title() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("===========================================");
	}
	void stu_output(Student5[]s) {
		top_title();
		for(int i=0; i<Student5.count;i++) {
			System.out.print(s[i].stu_num+"\t");
			System.out.print(s[i].name+"\t");
			System.out.print(s[i].kor+"\t");
			System.out.print(s[i].eng+"\t");
			System.out.print(s[i].math+"\t");
			System.out.print(s[i].total+"\t");
			System.out.printf("%.2f \t",s[i].avg);
			System.out.println(s[i].rank+"\n");
		}
		
	}//2.출력 끝

	
	void stu_update(Student5[]s) {
		
		System.out.println("이름을 입력하세요 0번상위메뉴");
		String search_name = scan.next();
		System.out.println("[수정할 학생선택]");
		for(int i=0; i<Student5.count; i++) {
			if(s[i].name.contains(search_name)) {
				System.out.println(i+"."+s[i].name);
				
			}
			
		}
		System.out.println("수정할 학생 번호 입력");
		int temp_num = scan.nextInt();
		System.out.println("0.국어 1.영어 2.수학");
		System.out.println("수정할 과목번호를 입력하세요");
		int temp_num2 = scan.nextInt();
		switch(temp_num2) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		}
		
		
	}//3.수정
	
	void stu_oneoutput(Student5[]s) {
		System.out.println("찾는 이름을 입력하세요");
		String search_name = scan.next();
		
		top_title();
		int search_num=-1;
		
		for(int i=0;i<Student5.count;i++) {
			if(s[i].name.contains(search_name)) {
				
				System.out.print(s[i].stu_num+"\t");
				System.out.print(s[i].name+"\t");
				System.out.print(s[i].kor+"\t");
				System.out.print(s[i].eng+"\t");
				System.out.print(s[i].math+"\t");
				System.out.print(s[i].total+"\t");
				System.out.printf("%.2f\t",s[i].avg);
				System.out.println(s[i].rank+"\n");
			}
		}
		if(search_num==-1) {
			System.out.println("찾는데이터가 없습니다.");
			return;
		}
	}//4.개인성적 출력 끝
	
	
	
	
	
	//5.등수 시작
	void ranking(Student5[]s) {
		for(int i=0;i<Student5.count;i++) {
			int rankNum=1;
			for(int j=0; j<Student5.count;j++) {
				if(s[i].total<s[j].total) {
					rankNum++;
				}
			}
			s[i].rank = rankNum;
		}
		System.out.println("등수처리 완료");
	}//5.등수 끝
	
}//class


