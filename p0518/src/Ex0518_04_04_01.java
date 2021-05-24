import java.util.Scanner;

public class Ex0518_04_04_01 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		Student3[] s = new Student3[10];
		
		while(true) {
			
			mainPrint();//메인화면 출력 메소드 호출
			
			int choice = scan.nextInt();
			
			switch(choice) {
			
			case 1:

				stuInput(s);
				
				break;
				
			
			
			
			
			case 2:
				
				System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
				System.out.println("---------------------------------------------------");
				for(int i=0; i<Student3.count;i++) {
					System.out.print(s[i].name+"\t");
					System.out.print(s[i].kor+"\t");
					System.out.print(s[i].eng+"\t");
					System.out.print(s[i].math+"\t");
					System.out.print(s[i].total+"\t");
					System.out.printf("%.2f\t",s[i].avg);
					System.out.println(s[i].rank+"\n");
				}
				
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			case 5:
				for(int i=0; i<Student3.count;i++) {
					int rankNum = -1;
				}
				
				break;
			
			
			
			default:
				break;
				
			}
		}
	
	
	
	
	}//main

static void mainPrint(){
	System.out.println("[학생성적프로그램]");
	System.out.println("1.학생 성적 입력");
	System.out.println("2.학생 성적 출력");
	System.out.println("3.학생 성적 수정");
	System.out.println("4.학생 성적 검색");
	System.out.println("5.등수확인");
	System.out.println("6.프로그램 종료");
}
static void stuInput(Student3[] s) {
	for(int i=Student3.count;i<s.length;i++) {
		System.out.println("이름을 입력하세요: (0번 상위메뉴이동)");
		String name_check = scan.next();
	
		if(name_check.equals("0")) {
			System.out.println("상위메뉴로 이동");
			break;
		}
	
		s[i] = new Student3();
		s[i].name = name_check;
		System.out.println("국어점수를 입력하세요");
		s[i].kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요");
		s[i].eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요");
		s[i].math = scan.nextInt();
		s[i].total = s[i].kor+s[i].eng+s[i].math;
		s[i].avg = s[i].total/3.0;
	}
}


}//class
