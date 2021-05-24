import java.util.Scanner;

public class Min_student1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[10];
		int[][]score = new int[10][4];
		double[]avg = new double[10];
		String[] sub = {"국어","영어","수학"};
		int count = 0; // 입력되는 학생 숫자만큼 증가 몇명이 들어갔는지 확인
		String sell="";
		int me = 0;
		
		while(true) {
			
			System.out.println("[학생성적관리]");
			System.out.println("1.학생 성적 입력");
			System.out.println("2.학생 성적 수정");
			System.out.println("3.학생 성적 출력");
			System.out.println("4.검색하는 학생 정보 출력");
			System.out.println("0.프로그램 종료");
			System.out.println("진행할 프로그램 번호를 입력하세요");
			int choice = scan.nextInt();
			
			
			switch(choice) {
			case 1:
				System.out.println("[학생 성적 입력]");
				for(int i=count; i<score[i].length;i++) {//count가 0부터 배열 0자리에간다.
					System.out.println((i+1)+"번째 이름을 입력하세요:(상위메뉴는0번)");
					sell = scan.next(); // 입력한 정보가 sell에 저장
					
					if(sell.equals("0")) {
						break;
					}
					name[i]=sell;
					for(int j=0; j<score[i].length-1;j++) {
						System.out.println(sub[j]+"점수를 입력하세요");
						score[i][j] = scan.nextInt();
					}
						score[i][3] = score[i][0]+score[i][1]+score[i][2];
						avg[i] = score[i][3]/3.0;
						
						count++;
				}
				
			break;
			
			case 2:
				System.out.println("[학생 정보 수정]");
				System.out.println("수정할 학생 이름을 입력하세요(상위메뉴는 0번)");
				sell=scan.next();
				
				if(sell.equals("0")) {
					break;
				}
				
				for(int i=0; i<count;i++) { // count에 입력된 숫자만큼 돈다.
					if(sell.equals(name[i])) {//sell에 입력한 정보가 name의 배열에 하나씩 비교
						me = i; // 맞는게 나오면 해당 배열의 숫자i을 me에 넣는다.
					}			// me는 내가 찾는 줄의 시작점이 된다.
				}
				
				System.out.println(name[me]+"학생을 찾았습니다.");
				
				
				break;
			
			
			case 3:
				
				 System.out.println("이름\t국어\t영어\t수학\t합계\t평균");//기준을 나타내기 위해 표의 윗부분을 보여준다.
		         System.out.println("----------------------------------------------------");
				
		         for(int i=0;i<count;i++) { // 0부터 내가 입력한 학생수(count) 까지 실행
		        	 System.out.print(name[i]+"\t");
		        	 for(int j=0;j<score[i].length;j++) {
		        		 System.out.print(score[i][j]+"\t");
		        	 }
		        	 System.out.printf("%.2f",avg[i]);
		        	 System.out.println();
		         }
				
				break;
			
			
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}//main

}//class
