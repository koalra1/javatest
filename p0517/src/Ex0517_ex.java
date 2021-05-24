import java.util.Scanner;

public class Ex0517_ex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[5];
		int[][] score = new int[5][4];
		double[] avg = new double[5];
		String[] sub = {"이름","국어","영어","수학","합계","평균"};
		int count = 0;
		int[]rank = new int[5];
		
		loop1:while(true) {
			System.out.println("[학생 성적 프로그램]");
			System.out.println("1. 학생 성적 입력");
			System.out.println("2. 학생 성적 출력");
			System.out.println("3. 학생 성적 수정");
			System.out.println("4. 학생 성적 검색");
			System.out.println("5. 등수");
			System.out.println("6. 프로그램 종료");
			int choice = scan.nextInt();
			
			
			switch(choice) {
			
			case 1:
				System.out.println("학생 성적추가");
				for(int i=count; i<name[i].length(); i++) {
					System.out.println("이름을 입력하세요 : 0번 상위메뉴");
					name[i] = scan.next();
					if(name[i].equals("0")) {
						System.out.println("상위메뉴 이동");
						break;
					}
						for(int j=0; j<score[i].length-1;j++) {
							System.out.println(sub[j+1]+"점수를 입력하세요");
							score[i][j] = scan.nextInt();
						}
						score[i][3] = score[i][0]+score[i][1]+score[i][2];
						avg[i] = score[i][3]/3.0;
						count++;
				}
				
				
				break;
				
			case 2:
				for(int i=0; i<sub.length; i++) {
					System.out.print(sub[i]+"\t");
				}
					System.out.println();
					System.out.println("---------------------------------------");
					
					for(int i=0; i<count; i++) {
						System.out.print(name[i]+"\t");
						for(int j=0; j<score[i].length;j++) {
							System.out.print(score[i][j]+"\t");
						}
						System.out.printf("%.2f",avg[i]);
						System.out.print(rank[i]+"\n");
							
					
					}
				
				break;
			
			
			default:
					break loop1;
			}
			
			
		}

	}

}
