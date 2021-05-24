import java.util.Scanner;

public class Ex0511_01 {

	public static void main(String[] args) {
		//문제2 숫자 2.031457 에서 5자리 반올림 하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		double num = scan.nextDouble();
		double result = Math.round(num*10000) / 10000d;
		System.out.println("결과값 : "+result);
		
		
		
		// 문제 1
		// 숫자를 입력을 받아 짝수인지,홀수인지 출력 (if)
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		// scan.nextInt(); // 정수형
//		// scan.nextLine(); // 문자열
//		// scan.nextDouble(); // 실수형
//		int num = scan.nextInt(); // 정수형
////		System.out.println("문자를 입력하세요");
////		String str = scan.next(); // 문자열
////		System.out.println("출력 : " + num);
////		System.out.println("문자출력 : " + str);
//		if(num%2==0){
//			System.out.println("짝수");
//		}
//		else {
//			System.out.println("홀수");
//		}
	}

}
