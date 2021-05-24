import java.util.Scanner;

public class Ex0512_02 {

	public static void main(String[] args) {
		// 문제
		// 학생이름,국어점수,수학점수,영어점수 4개를 입력받아
		// 학생이름,합계,평균 3개를 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		String name="";
		int kor = 0;
		int math = 0;
		int eng = 0;
		System.out.println("이름을 입력하세요.>>");
		name = scan.next();
		System.out.println("국어점수를 입력하세요.>>");
		kor = scan.nextInt();
		System.out.println("수학점수를 입력하세요.>>");
		math = scan.nextInt();
		System.out.println("영어점수를 입력하세요.>>");
		eng = scan.nextInt();
		
		
		
		
		System.out.println("이름 : "+name);
		System.out.println("합계 : "+(kor+math+eng));
		System.out.printf("평균 : %.2f %n",((kor+math+eng)/3.0));
	

	}

}
