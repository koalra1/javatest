package pack;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Process2 {
	static Scanner scan = new Scanner(System.in);
	
	
	void mainprint() {
		System.out.println("[학생성적 관리 프로그램]");
		System.out.println("1.학생성적 입력");
		System.out.println("2.학생성적 출력");
		System.out.println("3.학생성적 수정");
		System.out.println("4.학생성적 검색");
		System.out.println("5.등수확인");
		System.out.println("0.프로그램 종료");
	}
	
	
	
	//1.입력
	void stu_input(ArrayList list) {
		String name = "";
		int kor=0,eng=0,math=0;
		while(true) {
			System.out.println("이름을 입력하세요. 0번초기메뉴이동");
			String check = scan.next();
			if(check.equals("0")) {
				System.out.println("상위메뉴 이동");
				break;
			}
			name = check;
			System.out.println("국어점수 입력");
			kor = scan.nextInt();
			System.out.println("영어점수 입력");
			eng = scan.nextInt();
			System.out.println("수학점수 입력");
			math = scan.nextInt();
			
			list.add(new Student2(name,kor,eng,math));
		}
	}//1.입력

	//2.출력
	void stu_output(ArrayList list) {
		
		System.out.print("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("=======================================");
		for(int i=0; i<list.size(); i++) {
		Student2 s = (Student2)list.get(i);
		System.out.print(s.stu_num+"\t");
		System.out.print(s.stu_name+"\t");
		System.out.print(s.kor+"\t");
		System.out.print(s.eng+"\t");
		System.out.print(s.math+"\t");
		System.out.print(s.total+"\t");
		System.out.printf("%.2f",s.avg); 
		System.out.println(s.rank+"\n");
		
		}
	}//2.출력

	
	void stu_update(ArrayList list) {
		System.out.println("수정할 이름 입력");
		String update_name = scan.next();
		int check_flag = 1;
		for(int i=0; i<list.size();i++) {
			Student2 s = (Student2)list.get(i);
			System.out.println("[수정할 학생 검색완료]");
			System.out.println("[수정할 과목입력]");
			System.out.println("1.국어 2.영어 3.수학");
			int temp_num = scan.nextInt();
			switch(temp_num) {
			case 1:
				System.out.println("현재점수 :"+s.kor);
				System.out.println("수정할 점수 입력:");
				s.kor = scan.nextInt();
				System.out.println("수정완료");
				break;
			case 2:
				System.out.println("현재점수 :"+s.eng);
				System.out.println("수정할 점수 입력:");
				s.eng = scan.nextInt();
				System.out.println("수정완료");
				break;
			case 3:
				System.out.println("현재점수 :"+s.math);
				System.out.println("수정할 점수 입력:");
				s.math = scan.nextInt();
				System.out.println("수정완료");
				break;
			}
			s.total = s.kor+s.eng+s.math;
			s.avg = s.total/3.0;
		}
	}
	
	//4.검색
	void stu_search(ArrayList list) {
		System.out.println("찾는학생이름을 입력하세요");
		String search_name = scan.next();
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("=======================================");
		for(int i=0; i<list.size();i++) {
			Student2 s = (Student2)list.get(i);
			if(s.stu_name.contains(search_name)) {
				System.out.print(s.stu_num+"\t");
				System.out.print(s.stu_name+"\t");
				System.out.print(s.kor+"\t");
				System.out.print(s.eng+"\t");
				System.out.print(s.math+"\t");
				System.out.printf("%.2f",s.avg); 
				System.out.println(s.rank+"\n");
			}
		}
	}//4.검색
	//5.등수
	void stu_rank(ArrayList list){
		for(int i=0; i<list.size(); i++) {
			Student2 s1 = (Student2)list.get(i);
			int rankNum=1;
			for(int j=0; j<list.size(); j++) {
			Student2 s2 = (Student2)list.get(j);
				if(s1.total<s2.total) {
					rankNum++;
				}
			}
			s1.rank = rankNum;
		}
	}//5.등수
}//class
