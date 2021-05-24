import java.util.Scanner;

public class Ex0520_05 {

	public static void main(String[] args) {
		// 두수를 입력받아 더하기를 해서 결과값을 출력하시오.
		//main() -> 두수를 입력, add메소드 호출후 리턴받아 출력
		// add()-> 두수를 더해서 return해서 돌려줌.
		// sub()->빼기 , multi()곱하기, div()나누기
		Scanner scan = new Scanner(System.in);
		System.out.println("1번째 데이터를 입력하세요.>>");
		int num1 = scan.nextInt();
		System.out.println("2번째 데이터를 입력하세요");
		int num2 = scan.nextInt();
		
		int result = add(num1,num2);
		System.out.println("더하기 :"+result);
		int result2 = sub(num1,num2);
		System.out.println("빼기 :"+result2);
		int result3 = multi(num1,num2);
		System.out.println("곱하기 :"+result3);
		double result4 = div(num1,num2);
		System.out.println("나누기 :"+result4);
	
	
	
	}
	
	static int add(int num1, int num2) {
		 int result = num1+num2;
		 
		 return result;
	}

	static int sub(int num1, int num2) {
		int result2 = num1-num2;
		return result2;
	}
	static int multi(int num1, int num2) {
		int result3 = num1*num2;
		return result3;
	}

	static double div(int num1, int num2) {
		int result4 = num1/num2;
		return result4;
	}
}//class
