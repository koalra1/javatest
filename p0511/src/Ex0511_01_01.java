import java.util.Scanner;

public class Ex0511_01_01 {

	public static void main(String[] args) {
		// 숫자 2.031457에서 5자리 반올림 하시오.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력");
		double num = scan.nextDouble();
		double result = Math.round(num*10000)/10000d;
		System.out.println("결과값 :"+result);
	}

}
