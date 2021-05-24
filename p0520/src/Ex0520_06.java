import java.util.Scanner;

public class Ex0520_06 {

	public static void main(String[] args) {
		// 실수를 입력받아 -> 반올림(round),올림(ceil),내림(floor)
		//main()->실수입력,myMath메소드 호출 return받아 출력
		//myMath메소드 -> 반올림해서 return 돌려줌
		Scanner scan = new Scanner(System.in);
		System.out.println("실수를 입력하세요.>>");
		double num1 = scan.nextDouble();
		
		// 1.반올림 2.올림 3.버림
		System.out.println("[소수점 계산 선택]");
		System.out.println("1.반올림 2.올림 3.내림");
		System.out.println("원하는 번호를 입력하세요.>>");
		int choice = scan.nextInt();
		//메소드 호출
		double result = myMath(num1,choice); 

		
		System.out.println(result);

	
	
	}

	static double myMath(double num1,int choice) {
		double result = 0;
		switch(choice) {
		case 1:
			result = Math.round(num1);
			
			break;
		case 2:
			result = Math.ceil(num1); //double
			break;
		case 3:
			result = Math.floor(num1); //double
			break;
		}
		 return result;
			 
		}

		
	
}//class
