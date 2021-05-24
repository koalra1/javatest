import java.util.Scanner;

public class Ex0511_06 {
d
	public static void main(String[] args) {
		// 1~100까지 난수를 생성해서
		// 무한반복해서 번호를 맞출때 break문으로 빠져나오세요.
		// 정답숫자를 출력하시오.
	Scanner scan = new Scanner(System.in);
	int score = (int)(Math.random()*100)+1; // 
	//무한반복
	int num=0;
	int count=1;// 횟수
	while(count<=5) {
		System.out.println(count+"번째 도전! 숫자를 입력하세요.>>");
		num = scan.nextInt();
		if(num==score) {
			System.out.println("정답입니다.!");
			break;
		}else if(num>score) {
			System.out.println("틀렸습니다.!");
			System.out.println(num+"입력한 숫자보다 작은수를 입력하세요");
			}else {
				System.out.println(num+"입력한 숫자보다 큰수를 입력하세요");
			}
		count++;
	}// while
		
	System.out.println("정답 :" + score);
	}

}

