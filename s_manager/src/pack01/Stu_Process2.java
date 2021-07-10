package pack01;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Process2 {
	static Scanner scan = new Scanner(System.in);
	ArrayList<Student2> s = new ArrayList<Student2>();
	
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
	void stu_output(ArrayList<Student2> list) {
		
		System.out.print("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("=======================================");
		for(int i=0; i<list.size(); i++) {
		
		System.out.print(list.get(i).getStu_num()+"\t");
		System.out.print(list.get(i).getStu_name()+"\t");
		System.out.print(list.get(i).getKor()+"\t");
		System.out.print(list.get(i).getEng()+"\t");
		System.out.print(list.get(i).getMath()+"\t");
		System.out.print(list.get(i).getTotal()+"\t");
		System.out.printf("%.2f \t",list.get(i).getAvg()); 
		System.out.println(list.get(i).getRank()+"\n");
		
		}
	}//2.출력

	
	//3.수정
	void stu_update(ArrayList<Student2> list) {
		System.out.println("수정할 이름 입력");
		String update_name = scan.next();
		int ck = 0,num = 0;
		//int check_flag = 1;
		for(int i=0; i<list.size();i++) {
			//Student2 s = (Student2)list.get(i);
			System.out.println("[수정할 학생 검색완료]");
			System.out.println("[수정할 과목입력]");
			System.out.println("1.국어 2.영어 3.수학");
			int temp_num = scan.nextInt();
			switch(temp_num) {
			case 1:
				System.out.println("현재점수 :"+list.get(i).getKor());
				System.out.println("수정할 점수 입력:");
				num = scan.nextInt();
				list.get(ck).setKor(num);
				System.out.println("수정완료");
				break;
			case 2:
				System.out.println("현재점수 :"+list.get(i).getEng());
				System.out.println("수정할 점수 입력:");
				num = scan.nextInt();
				list.get(ck).setEng(num);
				System.out.println("수정완료");
				break;
			case 3:
				System.out.println("현재점수 :"+list.get(i).getMath());
				System.out.println("수정할 점수 입력:");
				num = scan.nextInt();
				list.get(ck).setMath(num);
				System.out.println("수정완료");
				break;
			}
			
			System.out.println("수정 완료");
			//list.get(i).getTotal() = list.get(ck).setKor(num)+list.get(ck).setEng(num)+list.get(ck).setMath(num);
			//s.avg = s.total/3.0;
		}
	}//3.수정
	
	//4.검색
	void stu_search(ArrayList<Student2> list) {
		String search_name = scan.next();
		int ck = 0;
		System.out.println("찾는학생이름을 입력하세요");
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("=======================================");
		for(int i=0; i<list.size();i++) {
			//Student2 s = (Student2)list.get(i);
			if(list.get(i).getStu_name().contains(search_name)) {
				System.out.print(list.get(ck).getStu_num()+"\t");
				System.out.print(list.get(ck).getStu_name()+"\t");
				System.out.print(list.get(ck).getKor()+"\t");
				System.out.print(list.get(ck).getEng()+"\t");
				System.out.print(list.get(ck).getMath()+"\t");
				System.out.print(list.get(ck).getTotal()+"\t");
				System.out.printf("%.2f \t",list.get(ck).getAvg()); 
				System.out.println(list.get(ck).getRank()+"\n");
			}
		}
	}//4.검색
	//5.등수
	void stu_rank(ArrayList<Student2> list){
		for(int i=0; i<list.size(); i++) {
			Student2 s1 = (Student2)list.get(i);
			int rankNum=1;
			for(int j=0; j<list.size(); j++) {
			//Student2 s2 = (Student2)list.get(j);
				if(list.get(i).getTotal()<list.get(j).getTotal()) {
					rankNum++;
				}
			}
			list.get(i).setRank(rankNum);
		}
	}//5.등수
}//class
