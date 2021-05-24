import java.util.Scanner;
public class Ex0510_06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// 97점이상 A+
		// 96~94점 A
		// 93~90점 A-
		// 87점이상 B+
		// 86~84점 B
		// 83~80점 B-
		System.out.println("점수를 입력하세요.>> ");
		int score = scan.nextInt();
		String grade;
        if (score >= 90) {
            grade = "A";
            
            if (score >= 96) {
                grade += "+"; 
            } else if (score < 93) {
                grade += "-";
            } else {
                
            }
        } else if (score >= 80 && score < 90) {
            grade = "B";
            if (score >= 86) {
                grade += "+";
            } else if (score < 83) {
                grade += "-";
            } else {
                
            }
        } else {
            grade = "C";
        }
        
 
        
        
        
        System.out.println("당신의 학점은 : " + grade );
		

		
		
		
//		System.out.println("점수를 입력하세요.");
//		int score = scan.nextInt();
//		//점수를 입력받아
//		// 90점 이상이면 A, 80점이상이면 B, 70점이상이면 C, 60점이상이면 D, 나머지F
//		score = score/10;
//		
//		switch(score) {
//		case 9: 
//			System.out.println("A");
//			break;
//		case 8:
//			System.out.println("B");
//			break;
//		case 7:
//			System.out.println("C");
//			break;
//		case 6:
//			System.out.println("D");
//			break;
//		default:
//			System.out.println("F");
//			break;
//		
//		}
		
		
		


		
		
//		if(num >= 90) {
//			System.out.println("A");
//		}
//		else if(num >= 80){
//			System.out.println("B");
//		}
//		else if(num >= 70){
//			System.out.println("C");
//		}
//		else if(num>=60){
//			System.out.println("D");
//		}
//		else {
//			System.out.println("F");
//		}
		
		
//		System.out.println("국번을 입력하세요.>>");
//		int num = scan.nextInt();
//		
//		if(num==1 || num==7){
//			System.out.println("SK");
//		}
//		else if(num==6) {
//			System.out.println("KT");
//		}
//		else if(num==9) {
//			System.out.println("LG");
//		}
//		else {
//			System.out.println("통신사 없음");
//		}
	}
	

}
