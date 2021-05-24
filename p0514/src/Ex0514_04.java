import java.util.Scanner;

public class Ex0514_04 {

	public static void main(String[] args) {
		// 1.화면단 출력 -> while(),switch()구문 먼저 만들것
		// 2.학생성적 추가 부분을 구현 -
		//- 각각저장배열을 생성 
		//- 이름,국어,영어,수학점수 입력받음
		//- 합계,평균 입력
		//	3. 학생성적출력을 구현
		
		Scanner scan = new Scanner(System.in);
		
		String[]name = new String[10];
		int[][]score = new int[10][4];
		double[]avg = new double[10];
		int count=0;
		
		while(true) {
			System.out.println("[성적처리]");
			System.out.println("1.학생성적입력");
			System.out.println("3.학생성적출력");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();			
			String check=""; //0인지 확인하는 변수
			
			switch(choice) {
			case 1:
				System.out.println("[학생성적 추가메뉴]");
				
				for(int i=count;i<name.length;i++) {
					System.out.println("이름을 입력하세요(0.상위메뉴이동)>>");
					check = scan.next();
				
					if(check.equals("0")) {
						break;
					}
				
					name[i]=check;
					for(int j=0;j<(score[i].length-1);j++) {
						System.out.println("점수를 입력하세요");
					
						score[i][j] = scan.nextInt();
					}
					//합계
					score[i][3] = score[i][0]+score[i][1]+score[i][2];
					
					avg[i]=score[i][3]/3.0;
					count++;
				}
				
				
				break;
			
			case 3: //출력값
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균\n ");
				System.out.println("---------------------------------------------");
				for(int i=0; i<count; i++) {
					System.out.print(name[i]+"\t");
					for(int j=0; j<score[i].length;j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.printf("%.2f \n",avg[i]);
				
				
				}
					System.out.println();
				break;
		
			default:
				break;
	
			}
		}
	
	
	
	
	
	
	
	
	}//main

}//class
