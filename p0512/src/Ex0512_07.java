import java.util.Scanner;

public class Ex0512_07 {

	public static void main(String[] args) {
		// 번호 1~45번까지 6개를 입력받아
		// 랜덤 로또번호6개와 입력한 6개를 출력하시오.
		// 1. 6개입력받기
		// 2. 6개 출력하기
		Scanner scan = new Scanner(System.in);
		int[] input = new int[6];
		for(int i=0;i<input.length;i++) {
			System.out.println((i+1)+""+"번째 숫자를 입력하세요");
			input[i] = scan.nextInt();
			
		}
		System.out.println(" [입력한 번호] ");
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		
		}
		System.out.println();
	
	
		int[] ball = new int[45];
		// 번호 넣기
		for(int i=0;i<45;i++) {
			ball[i]=i+1;
		}
		// 번호 섞기
		int temp=0; // 저장할 변수 초기화
		for(int i=0;i<500;i++) {
			int rno = (int)(Math.random()*45); // 0-44
			temp = ball[0]; // 0번배열값을 먼저 임시저장변수에 저장
			ball[0] = ball[rno]; // 0번 배열장소에 랜덤숫자를 넣음.
			ball[rno] = temp;
		}
		
		//출력
		System.out.println(" [로또 랜덤 번호] ");
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
