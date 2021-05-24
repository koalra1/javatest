import java.util.Scanner;

public class Ex0518_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 학생3명을 선언
		
	
		
		
		//객체배열 선언
		Student[] s = new Student[3];
		
		
		//3명의 학생 이름성적입력	
		for(int i=0; i<s.length;i++) { 
			// 데이터 저장을 위한 객체선언
			s[i] = new Student(); 
			System.out.println("이름을 입력하세요.>>");
			s[i].name = scan.next();
			for(int j=0; j<s[0].score.length;j++) { // 3명의 학생 점수입력
				System.out.println("점수를 입력하세요");
				s[i].score[j] = scan.nextInt();
				
				//합계
				s[i].total = s[i].score[0]+s[i].score[1]+s[i].score[2];
				
				//평균
				s[i].avg = s[i].total/3.0;
				
			}
	
				
			
		}
		// 3명 학생 출력
		for(int i=0; i<s.length;i++) { //3명의 학생 이름성적입력
			
			System.out.print(s[i].stu_number+"\t");
			System.out.print(s[i].name+"\t");
			//점수출력
			for(int j=0; j<s[0].score.length;j++) { // 3명의 학생 점수입력
				System.out.print(s[i].score[j]+"\t");
		
				
			}
			System.out.print(s[i].total+"\t");
				System.out.print(s[i].avg+"\n");
			
		}

		
		
		
		
//		//학생 3명선언
//		Student s1 = new Student();
//		Student s2 = new Student();
//		Student s3 = new Student();
		
	}

}
