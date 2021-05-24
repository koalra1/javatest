import java.util.Scanner;

public class Ex0520_13 {

	public static void main(String[] args) {
		// 10명 학생입력 학생성적추가 만 해보세요.
	
		Scanner scan = new Scanner(System.in);
		Student[] s = new Student[10];
		int search_num = -1;
		String search_name = "";
		
		loop1 : while(true) {
			System.out.println("[학생 성적 프로그램]");
			System.out.println("1.학생 성적 추가");
			System.out.println("2.학생 성적 출력");
			System.out.println("3.학생 성적 수정");
			System.out.println("4.학생 개인 성적 검색");
			System.out.println("5.등수 정리");
			System.out.println("0.프로그램 종료");
			int choice = scan.nextInt();
			
			switch(choice) {
			
			case 1:
				for(int i=Student.count; i<s.length; i++) {
					System.out.println("이름을 입력하세요");
					String check = scan.next();
					
					if(check.equals("0")) {
						break;
					}
					s[i] = new Student();
					s[i].name = check;
					System.out.println("국어점수 입력");
					s[i].kor = scan.nextInt();
					System.out.println("영어점수 입력");
					s[i].eng = scan.nextInt();
					System.out.println("수학점수 입력");
					s[i].math = scan.nextInt();
					s[i].total = s[i].kor+s[i].eng+s[i].total;
					s[i].avg = s[i].total/3.0;
					
				}
				
				
				break;
	
			
		case 2:
			System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
			System.out.println("====================================");
			for(int i=0; i<Student.count; i++) {
				System.out.print(s[i].stu_num+"\t");
				System.out.print(s[i].name+"\t");
				System.out.print(s[i].kor+"\t");
				System.out.print(s[i].eng+"\t");
				System.out.print(s[i].math+"\t");
				System.out.print(s[i].total+"\t");
				System.out.printf("%.2f \t",s[i].avg);
				System.out.println(s[i].rank);
			}
			
			
				break;
		
		case 3: // 수정
			
			System.out.println("수정할 학생이름 입력");
			search_name = scan.next();
			
			search_num = -1;
			System.out.println("[검색된 학생 이름]");
			for(int i=0; i<Student.count; i++) {
				if(s[i].name.contains(search_name)) {
					System.out.println(i+"."+s[i].name);
					search_num=0;
				}
			}
			
				if(search_num==-1) {
					System.out.println("찾는데이터가 없습니다.");
					break;
				}
				
				System.out.println("수정하고자 하는 학생번호 입력>>");
				int temp_num = scan.nextInt();
				
				System.out.println("수정할과목 입력");
				System.out.println("0.국어 1.영어 2.수학");
				System.out.println("수정할 과목번호 입력");
				int temp_num2 = scan.nextInt();
			
		switch(temp_num2) {
		case 0:
					System.out.println("현재점수 : "+s[temp_num].kor);
					System.out.println("수정할 점수 입력>>");
					s[temp_num].kor = scan.nextInt();
					break;
				
		case 1:
		
			System.out.println("현재점수 : "+s[temp_num].eng);
			System.out.println("수정할 점수 입력>>");
			s[temp_num].eng = scan.nextInt();
			
			break;
			
		case 2:
			System.out.println("현재점수 : "+s[temp_num].math);
			System.out.println("수정할 점수 입력>>");
			s[temp_num].math = scan.nextInt();
			
			s[temp_num].total = s[temp_num].kor+s[temp_num].eng+s[temp_num].math;
			s[temp_num].avg = s[temp_num].total/3.0;
			
			break;
		}
				
			
		case 4://찾기
			
			System.out.println("검색할 학생이름 입력");
			search_name = scan.next();
			
			System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
			System.out.println("========================================");
			search_num=-1;
			
			for(int i=0; i<Student.count; i++) {
				
				if(s[i].name.contains(search_name)) {
					System.out.print(s[i].stu_num+"\t");
					System.out.print(s[i].name+"\t");
					System.out.print(s[i].kor+"\t");
					System.out.print(s[i].eng+"\t");
					System.out.print(s[i].math+"\t");
					System.out.print(s[i].total+"\t");
					System.out.printf("%.2f\t",s[i].avg);
					System.out.println(s[i].rank);
				}
			}
			
			
			
			break;
			
		case 5: //등수
			
			for(int i=0; i<Student.count; i++) {
				int rankNum = 1;
				for(int j=0; j<11; j++) {
					if(s[i].total<s[j].total) {
						
						rankNum++;
					}
				}
				s[i].rank = rankNum;
			}
			System.out.println("등수처리 완료");
			break;
			
			
		
		case 0:
			System.out.println("프로그램 종료");
				break loop1;
	
	
				
	}//switch
		}//while
	}//main



}//class

	
	
		
	
	

