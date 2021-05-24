import java.util.Scanner;

public class Ex0517_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[5];
		int[][] score = new int[5][4];
		double[] avg = new double[5];
		String[] sub = {"이름","국어","영어","수학","합계","평균","등수"};
		int count = 0;
		int push = 0;
		int[] rank = new int[5];
		String search_name = "";
		int[] search_num1 = new int[5]; // 찾는 이름번호 배열
		int search_num2 = 0;
		
		
		loop1:while(true) {
		System.out.println("---------------------------");
		System.out.println("[학생성적 처리프로그램");
		System.out.println("---------------------------");
		System.out.println("1. 학생 성적추가");
		System.out.println("2. 학생 성적출력");
		System.out.println("3. 학생 성적수정");
		System.out.println("4. 학생 성적검색"); // 중복가능하게 변경
		System.out.println("5. 등수처리");
		System.out.println("6. 학생성적 프로그램 종료");
		System.out.println("---------------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
		push = scan.nextInt();
		
		switch(push) {
		
		case 1:
			System.out.println("학생 성적 추가메뉴");
			
			for(int i=count; i<name.length;i++) {
				System.out.println((i+1)+"번째 입력 : 상위메뉴는 0번");
				name[i] = scan.next();
				if(name[i].equals("0")) {
					break;
				}
				
				for(int j=0; j<score[i].length-1;j++){
					System.out.println(sub[j+1]+"점수를 입력하세요");
					score[i][j] = scan.nextInt();
				}
				score[i][3] = score[i][0]+score[i][1]+score[i][2];
				avg[i] = score[i][3]/3.0;
				count++;
			}
			break;
			
		case 2:
			for(int i=0; i<sub.length;i++) {
				System.out.print(sub[i]+"\t");
			}
			
			System.out.println("------------------------");
			for(int i=0; i<count; i++) {
				System.out.print(name[i]+"\t");
				for(int j=0; j<score[i].length;j++) {
					System.out.print(score[i][j]+"\t");
			}
			
				System.out.printf("%.2f/t",avg[i]);
				System.out.print(rank[i]+"\n");
			}
			
			System.out.println();
			break;
		
		
		
		
		
		
		
		
		case 3:
			System.out.println("수정할 학생의 이름입력");
			search_name = scan.next();
			
			search_num1 = -1;
			for(int i=0; i<name.length; i++) {
				if(search_name.equals(name[i])) {
					search_num1 = i;
					break;
				}
			}
			
			if(search_num1==-1) {
				System.out.println("찾는 이름이 없습니다.");
				break;
			}
			
			System.out.println("[수정할 과목 선택]");
			System.out.println("0.국어 1.영어 2.수학");
			System.out.println("원하는 번호 입력하세요>>");
			search_num2 = scan.nextInt();
			
			System.out.println("현재점수 :"+score[search_num1][search_num2]);
			System.out.println("수정점수 입력: ");
			
			score[search_num1][search_num2] = scan.nextInt();
			score[search_num1][3] = score[search_num1][0]+score[search_num1][1]+score[search_num1][2];
			avg[search_num1] = score[search_num1][3]/3.0;
			System.out.println("수정이 완료되었습니다.");
			break;
		
		
		
		case 4: // 검색
			System.out.println("검색할 글자를 입력하세요.>>");
			search_name = scan.next();
			
			String[] board = {"이","김","박","유"};
			
			search_num1 = -1;
			for(int i=0; i<name.length;i++) {
				if(board[i].contains(search_name)) {
					search_num1 = i;
					break;
				}
			}
			
			if(search_num1==-1) {
				System.out.println("찾고자 하는 학생이 없습니다.!");
				break;
			}
			for(int i=0; i<sub.length;i++) {
				System.out.print(sub[i]+"\t");
			}
			System.out.println();
			System.out.println("---------------------------");
			
			for(int i=search_num1;i<search_num1+1;i++) {
				System.out.println(name[i]+"\t");
				
				for(int j=0; j<score[i].length; j++) {
					System.out.print(score[i][j]+"\t");
				}
				System.out.printf("%.2f",avg[i]);
				System.out.print(rank[i]+"\n");
			}
			System.out.println();
			
			break;
		case 5: //등수처리
			for(int i=0; i<count; i++) {
				int rankNum = 1;
				for(int j=0;j<count;j++) {
					if(score[i][3]<score[j][3]) {
						rankNum++;
					}
				}
				rank[i]=rankNum;
			}
			System.out.println("등수처리가 완료되었습니다.!");
			
			
			break;
		case 6:
			System.out.println("<프로그램 종료 메뉴>");
			break loop1;
			
		
		default:
			System.out.println("번호가 잘못 입력되었습니다. 다시 입력하세요");
				break;
		}
		
		
		
		
	}

}
}