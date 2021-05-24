import java.util.Scanner;

public class Ex0511_02 {

	public static void main(String[] args) {
		
		//학교를 영어로 입력한 값을 확인하시오
		Scanner scan = new Scanner(System.in);
		System.out.println("학교를 영어로 입력하세요");
		String input = scan.nextLine();
		if(input.equals("school")) {
			System.out.println("정답 : " + input);
		}
		else {
			System.out.println("오답 정답 :school, 입력 : " + input);
		}
		
		String str = "";
		if(str!=null && !str.equals("")) {
			char ch = scan.next().charAt(0);
		}
		

		
		
/* ==============================================================
		// 문자 1개를 입력받아 알파벳인지 아닌지를 출력하시오.
		// 알파벳입니다. 알파벳이 아닙니다.
		// 대소문자 모두 포함.
		System.out.println("알파벳 문자를 입력하세요");
		char ch = scan.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
			System.out.println("알파벳입니다.");
		}
		else {
			System.out.println("알파벳이 아닙니다.");
		}
*/ 

		
		
//		System.out.println("프로그램을 종료 하려면 X또는 x를 입력하세요. >>");
//		char ch = scan.next().charAt(0);
//
//		if(ch=='X' || ch=='x') {
//			System.out.println("프로그램이 종료 되었습니다.");
//		}
//		else {
//			System.out.println("프로그램을 계속 실행합니다.");
//		}
		
		
		
//		if(ch>='0' && ch<='9') {
//			System.out.println("숫자 1개를 입력하셨습니다.");
//		}else {
//			System.out.println("숫자가 아닙니다.");
//		}
		
		
		
		
		//String str = "abcdef";
		// char ch1 = str.charAt(3);
		//System.out.println(ch1);
		

	}

}
