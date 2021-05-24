import java.util.Scanner;

public class Ex0511_02_01 {

	public static void main(String[] args) {
		//학교를 영어로 입력한 값을 확인하시오.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("학교를 영어로");
//		String input = scan.nextLine();
//		if(input.equals("school")) {
//			System.out.println("정답");
//		}else {
//			System.out.println("오답");
		
//====================================================================	
		
		//문자 1개를 입력받아 알파벳인지 아닌지를 출력하시오.
		//알파벳입니다. 알파벳이 아닙니다.
		//대소문자 모두 포함.
		Scanner scan = new Scanner(System.in);
			System.out.println("입력하세요");
		char ch = scan.next().charAt(0);
		if(ch>='a'&&ch<='z' || ch>='A'&& ch<='Z') {
			System.out.println("알파벳");
		}else {
			System.out.println("알파벳 아님");
		}
	
	
	
	
	
		}
	}


