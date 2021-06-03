package pack03;

import java.util.ArrayList;
import java.util.Scanner;

public class StuProcess {
	
	Scanner scan = new Scanner(System.in);
	
	
	void main() {
		System.out.println("[학생관리 프로그램]");
		System.out.println("1.학생성적 입력");
		System.out.println("2.학생성적 출력");
		System.out.println("3.학생성적 수정");
		System.out.println("4.학생개인출력");
		System.out.println("5.등수정리");
	}
	
	
	void input(ArrayList list) { // 1.
		String name = "";
		int kor=0,eng=0,math=0;
		while(true) {
			System.out.println("이름을 입력하세요: (0번입력 상위메뉴이동)");
			String input = scan.next();
			if(input.equals("0")) {
				System.out.println("상위메뉴로 이동");
				return;
			}
			name = input;
			System.out.println("국어점수 입력");
			kor = scan.nextInt();
			System.out.println("영어점수 입력");
			eng = scan.nextInt();
			System.out.println("수학점수 입력");
			math = scan.nextInt();
			//Student s = new Student(name,kor,eng,math);
			Student s = new Student(name,kor,eng,math);
			list.add(s);
		}
	}//1.
	
	void output(ArrayList list) {//2.
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("========================================");
		for(int i=0; i<list.size(); i++) {
			Student s = (Student)list.get(i);
			System.out.print(s.count+"\t");
			System.out.print(s.name+"\t");
			System.out.print(s.kor+"\t");
			System.out.print(s.eng+"\t");
			System.out.print(s.math+"\t");
			System.out.print(s.total+"\t");
			System.out.printf("%.2f \t",s.avg);
			System.out.println(s.rank+"\n");
		}
	}//2.
	
	void update(ArrayList list) { //3.
		
		System.out.println("수정할 학생 입력");
		String search_name = scan.next();
		
		for(int i=0; i<list.size();i++) {
			Student s = (Student)list.get(i);
			if(s.name.equals(search_name)) {
				System.out.println("[수정할 과목 선택]");
				System.out.println("1.국어 2.영어 3.수학");
				int check = scan.nextInt();
				switch(check) {
				case 1:
					System.out.println("현재점수 :"+s.kor);
					System.out.println("수정할 점수 입력 :");
					s.kor = scan.nextInt();
					System.out.println("수정완료"+s.kor);
					break;
				case 2:
					System.out.println("현재점수 :"+s.eng);
					System.out.println("수정할 점수 입력 :");
					s.eng = scan.nextInt();
					System.out.println("수정완료"+s.eng);
					break;
				case 3:
					System.out.println("현재점수 :"+s.math);
					System.out.println("수정할 점수 입력 :");
					s.math = scan.nextInt();
					System.out.println("수정완료"+s.math);
					break;
				}
				s.total = s.kor+s.eng+s.math;
				s.avg = s.total/3.0;
			}
		}
	} //3.
	
	void search(ArrayList list) {//4.
		System.out.println("검색할 학생이름 입력");
		String search_name = scan.next();
		int check_flag = 0;
		for(int i=0; i<list.size();i++) {
			Student s = (Student)list.get(i);
			if(s.name.contains(search_name)) {
				System.out.print(s.count+"\t");
				System.out.print(s.name+"\t");
				System.out.print(s.kor+"\t");
				System.out.print(s.eng+"\t");
				System.out.print(s.math+"\t");
				System.out.print(s.total+"\t");
				System.out.printf("%.2f \t",s.avg);
				System.out.println(s.rank+"\n");
				check_flag = 1;
				
			}
			
			
			
		}
		if(check_flag == 0) {
			System.out.println("찾는 데이터가 없음");
		}
		
	}//4.
	void rank(ArrayList list) {
		int rank_num = 1;
		for(int i=0; i<list.size(); i++) {
			Student s1 = (Student)list.get(i);
			for(int j=0; j<list.size(); j++) {
				Student s2 = (Student)list.get(j);
				
				if(s1.avg<s2.avg) {
					rank_num++;
				}
				 
			}
			s1.rank = rank_num;
		}
		System.out.println("등수처리 완료");
	}
}//class
