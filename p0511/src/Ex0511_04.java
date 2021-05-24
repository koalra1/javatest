import java.util.Scanner;

public class Ex0511_04 {

	public static void main(String[] args) {
		
//		for(int i=1;i<=9;i++) {
//			for(int j=2;j<=9;j++) {
//				System.out.print(j+" * "+i+" = "+(i*j)+" \t");
//			}
//			System.out.println();
//		}
		
		int i = 1;
		while(i<=9) {
			
			int j=2;
			while(j<=9) {
			System.out.print(j+" * "+i+" = "+(i*j)+" \t");
				j++;
			}
			
			System.out.println();
			i++;
		}


//		int i=1;
//		int sum=0;
//		while(i<=100) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println("합계 : " + sum);
		
		
		
		//1-100까지 홀수를 더해서 값을 출력하시오.
		// i++ 1씩 증가, i+=2 2씩 증가
//		int sum=0;
//		for(int i=1; i<=100; i+=2) {
//			sum = sum+i;
//		}
//		System.out.println(sum);

//		int sum=0; //합계변수 초기화
//		for(int i=1; i<=100; i++) {
//			sum = sum+i;
//		}
//			System.out.println("합계 : "+sum);
		//		int j=1;
//		while(j<=10) {
//			System.out.println(j);
//			j++;
//		}
//		
//		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
		
		
		

		
//		// 1~5까지 숫자 맞추기 게임
//		Scanner scan = new Scanner(System.in);
//		System.out.println("[랜덤 숫자 맞추기]");
//		System.out.println("숫자를 입력하세요>>");
//		int score = (int)(Math.random()*5)+1;
//		int input = scan.nextInt();
//		if(score==input) {
//			System.out.println("숫자를 맞췄습니다.");
//		}else {
//			System.out.println("숫자를 틀렸습니다.");
//		}
//		System.out.println("정답 :" + score);
//		System.out.println("입력값" + input);

	// 숫자 맞추기 ====================================	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("[ 숫자맞추기 게임]");
//		System.out.println("1~10까지의 숫자를 입력하세요.>>");
//		int score = (int)(Math.random()*10)+1;
//		int input = scan.nextInt();
//		if(score==input) {
//			System.out.println("숫자를 맞췄습니다.!");
//		}else {
//			System.out.println("틀렸습니다.");
//		}
//		System.out.println("정답 : "+score);
//		System.out.println("입력값 : "+input);
		
		
//		int score = (int)(Math.random()*10); // 0~9까지 정수가 나옴
//		int score2 = (int)(Math.random()*10)+1; // 1~10까지 정수가 나옴
//		int score3 = (int)(Math.random()*10)+2; // 2~11까지 정수가 나옴
//		int score4 = (int)(Math.random()*1000)+5; // 5~1004까지 정수가 나옴
//	
//		System.out.println(score);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
	}

}
