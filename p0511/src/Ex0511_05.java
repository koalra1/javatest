
public class Ex0511_05 {

	public static void main(String[] args) {
		
		
		int i=1;
		int sum=0;
		while(true) {
			if(sum>10) {
				break;
			}
			sum += i;// i 1일때 sum은1, 4, 9, 16
			i = i+2; //3
		}
		System.out.println("순차번호 : " + (i-2));
		System.out.println("합계 :" + sum);
		
		
		
		
		
		
		
		
		
		//1~200까지 합계가 200이 넘어가는 시점의 숫자와 합계를 구하시오.
//		int i = 1;
//		int sum = 0;
//		while(true) {
//			if(sum>200) {
//				break;
//			}
//			sum += i; // 1,4,9,16,25 .......
//			i = i+2; // 3,5,7,9,11 .......
//		}
//		System.out.println("순차번호 : " + (i-2));
//		System.out.println("합계 :" + sum);
//		int sum=0; // 합계초기화
//		
//		while(true) {                 // == for(){}과 같다
//			if(sum>100) {
//				break;
//			}
//			i++;
//			sum = sum+i;
//			
//		}
//		System.out.println("순차번호 : " + i);
//		System.out.println("합계 : "+sum);
		
	
//		int i=0; // 순차증가 번호
//		int sum=0; // 합계초기화
//		
//		while(true) {                 // == for(){}과 같다
//			if(sum>100) {
//				break;
//			}
//			i++;
//			sum = sum+i;
//			
//		}
//		System.out.println("순차번호 : " + i);
//		System.out.println("합계 : "+sum);
		
		// 000
		// 001
		// 002
		//...
		// 999
//	for(int i=0;i<=9;i++) {
//		for(int j=0;j<=9;j++) {
//			for(int k=0; k<=9; k++) {
//				System.out.print(""+i+j+k+"\t");
//			}
//			System.out.println();
//		}
//		
//		
//}
	
	
	
	
	}

}
