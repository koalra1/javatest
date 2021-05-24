import java.util.Scanner;

public class Ex0512_08 {

	public static void main(String[] args) {
		// 6개를 입력받아 출력하고
		// 로또번호 6개를 출력해보세요.
		//1. 6개 입력받아 출력
		//2. 로또번호 배열생성
		//3. 로또번호 순차적으로 값넣기
		//4. 로또번호 섞기
		//5. 로또번호 6개 출력하기
	
		Scanner scan = new Scanner(System.in);
		int[] input = new int[6]; // 입력받을 배열 
		
		//번호 입력
		for(int i=0;i<input.length;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요.>>");
			input[i] = scan.nextInt(); 
			}
		// 번호 출력
		System.out.println("[내가 입력한 번호 ]");
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
			
			}
		System.out.println();
		
		//--------------------------------------
		
		// 1.로또 배열생성 45개
		int[]ball = new int[45]; 
		// 2. 번호 넣기
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		// 3.번호 섞기
		for(int i=0;i<200;i++) {
			int temp=0; //임시 저장변수
			int rno=(int)(Math.random()*45); // 랜덤 주소변수
			
			// 0번방과 랜덤방 값 변경
			temp = ball[0];
			ball[0] = ball[rno];
			ball[rno] = temp;
			
		}
		
		//4. 로또번호 출력
		System.out.println("[ 로또번호 ]");
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+ " ");
		}
		System.out.println();
		
		//5. 같은번호 찾기
		int[] win = new int[6]; // 당첨번호 저장공간
		int count=0; // 카운터 세기
		for(int i=0;i<6;i++) { // input 입력값 
			for(int j=0;j<6;j++) { // ball 로또 생성값
				if(input[i]==ball[j]) {
					win[count]=input[i]; // 당첨번호를 당첨배열에 저장
					count++;
					
				}
			}
		}
		
		System.out.println(" 당첨 번호 개수 :" + count);
		System.out.println("[ 당첨 번호 ]");
		for(int i=0;i<count;i++) {
			System.out.print(win[i]+" ");
		}
			System.out.println();
		
		
//		Scanner scan = new Scanner(System.in);
//	
//		int[]input = new int[3];
//		for(int i=0; i<input.length;i++) {
//			System.out.println((i+1)+"번째 숫자 입력");
//			input[i] = scan.nextInt();
//		}
//		System.out.println("입력한 번호");
//		for(int i=0; i<input.length;i++) {
//			System.out.print(input[i]+" ");
//		}
//		System.out.println();
//	
//		int ball[] = new int[3];
//		for(int i=0;i<ball.length;i++) {
//			ball[i]=i+1;
//		}
//	
//		int temp = 0;
//		for(int i=0;i<300;i++) {
//			int rno = (int)(Math.random()*3);
//			temp = ball[0];
//			ball[0] = ball[rno];
//			ball[rno] = temp;
//		}
//		System.out.println("[로또 랜덤 ]");
//		for(int i=0; i<3; i++) {
//			System.out.print(ball[i]+" ");
//		}
//	
//		System.out.println();
//	
	
	
	} // main

} // class
