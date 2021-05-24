import java.util.Scanner;

public class Ex0517_04 {

	public static void main(String[] args) {
		// 번호, 시(0-23),분(0-59),초(0-59.999)를 입력받아 출력하시오.
		// 3개를 입력받아 출력을 해보세요.
		// 시간은 수정이 가능하게 해보세요.
		// 1. 시간입력
		// 2. 시간출력
		// 3. 시간수정
		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		int[] hour = new int[3];
		int[] minute = new int[3];
		double[] second = new double[3];
		int choice = 0;
		int search_hour = 0;
		
		while(true) {
			System.out.println("[시간 프로그램]");
			System.out.println("1. 시간 입력");
			System.out.println("2. 시간 출력");
			System.out.println("3. 시간 수정");
			System.out.println("원하는 번호를 입력하세요.>>");
			choice = scan.nextInt();
			
			switch(choice) {
			
			
			case 1:
				
				for(int i=0; i<hour.length; i++) {
					num[i] = i+1;
					System.out.println("시를 입력하세요.>>");
					hour[i] = scan.nextInt();
					System.out.println("분을 입력하세요.>>");
					minute[i] = scan.nextInt();
					System.out.println("초를 입력하세요.>>");
					second[i] = scan.nextDouble();
					
				 }
			
				break;
				
			case 2:
				for(int i=0; i<hour.length; i++) {
					System.out.print(num[i]+" : ");
					System.out.print(hour[i]+" : ");
					System.out.print(minute[i]+" : ");
					System.out.print(second[i]+"\n");
			
				}
					break;
			
			case 3:
				
		           System.out.println("[시간 수정]");
		            System.out.println("수정할 시를 입력해 주세요: ");
		            int sell = scan.nextInt();
		            
		          
		       
		            for(int i=0;i<hour.length;i++) {    
		
		               
		            }
		            

		            System.out.println("수정할 분을 선택해 주세요:");
		         
		            int im = scan.nextInt();
		            im = im-1;     
		            
		  
		            System.out.println("수정할 초를 입력해 주세요 :");
		            int second2 = scan.nextInt(); // 찾은 위치에 내가 입력한 점수를 덮어 쓴다.
		            
		         
		            
		            System.out.println("수정 완료 되었습니다.");
		            
		            break;
		
			
			default:
					break;
			}
		}
		
	}

}
