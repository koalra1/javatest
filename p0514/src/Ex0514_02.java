import java.util.Scanner;

public class Ex0514_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[]name = new String[10];
		int[][]score = new int[10][4];
		double[]avg = new double[10];
		String[]sub = {"국어","영어","수학"};
		int count=0; //학생성적을 몇명 입력했는지 확인하는 변수
		String check = ""; //0 또는 학생이름 확인변수
		int searchNum=0; // 학생 성적수정or검색에 사용하는 변수
		
		loop1: while(true) {
			System.out.println("----------------------------");
			System.out.println("[학생성적 처리 프로그램]");
			System.out.println("----------------------------");
			System.out.println("1.학생성적 추가");
			System.out.println("2.학생성적 수정");
			System.out.println("3.학생성적 출력");
			System.out.println("4.학생성적 검색");
			System.out.println("0.프로그램 종료");
			System.out.println("----------------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1: // 1.학생성적 추가
				System.out.println("[학생성적 추가메뉴]");
				//학생 이름,국어,영어,수학 점수를 입력받아,합계,평균까지 출력
				
				//입력
				for(int i=count; i<score.length; i++) {
					System.out.println("학생이름 입력(상위메뉴이동:0번)>>");
					check = scan.next();
					//0이 입력되었는지 확인
					if(check.equals("0")) {
						System.out.println("상위메뉴로 이동합니다.");
						break;
					}
					
					name[i] = check; //이름 저장
					
					for(int j=0; j<(score[i].length-1); j++) {
						System.out.println(sub[j]+"성적입력");
						score[i][j]=scan.nextInt();
					}
					score[i][3]=score[i][0]+score[i][1]+score[i][2];
					avg[i] = score[i][3]/3.0; //평균
					count++;//학생1명추가
					System.out.println((i+1)+"명의 학생 성적이 입력되었습니다.");
				
				}
				
			
				break;
			case 2: // 학생성적 수정
				System.out.println("[학생성적 수정메뉴]");
				System.out.println("수정할 학생이름을 입력하세요.(0.상위메뉴이동)>>");
				check = scan.next(); // 수정할 학생이름 검색
				
				//입력한 내용이 0번을 입력하면 빠져나간다
				if(check.equals("0")) {
					System.out.println("상위메뉴로 이동합니다.!");
					break;
				}
				
				//해당학생 검색
				searchNum= -1; //해당학생이 있는지 없는지 확인
				for(int i=0;i<count;i++) {
					if(check.equals(name[i])) {
						searchNum = i;
					}
				}
				//해당학생이 없을시
				if(searchNum==-1) {
					System.out.println("해당학생이 없습니다.!");
					break;
				}
				
				//해당학생이 있을때
				System.out.println(check+" 해당학생을 찾았습니다.!");
				//무슨과목을 수정할지
				System.out.println("[ 수정할 과목을 선택 ]");
				System.out.println("0.국어  1.영어  2.수학");
				System.out.println("수정할 과목 번호를 입력하세요.");
				int sNum = scan.nextInt(); //수정할 과목
				System.out.println("수정할 점수 입력 : ");
				score[searchNum][sNum] = scan.nextInt();
				
				//합계 수정
				score[searchNum][3] = score[searchNum][0]+score[searchNum][1]+score[searchNum][2];
				//평균 수정
				avg[searchNum] = score[searchNum][3]/3.0; 
				
				System.out.println("수정이 완료되었습니다.!");
				break;
			
			case 3:// 학생성적 수정
				System.out.println("[학생성적 출력메뉴]");
				System.out.print("이름\t국어\t영어\t수학\t합계\t평균\n");
				System.out.println("------------------------------------------");
				for(int i=0; i<count; i++) {
					System.out.print(name[i]+"\t");
					for(int j=0; j<score[i].length; j++) {
						System.out.print(score[i][j]+"\t");
					}
				
					System.out.print(avg[i]+"\n");
				}
				
				
				
				
				
				break;
				
			case 4:
				System.out.println("-->> 학생성적 검색");
				break;
		
			case 0:
				System.out.println("-->> 프로그램 종료");
				break loop1;
			
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
				break;
			}// switch

		}//while
	
	}//main

}//class
