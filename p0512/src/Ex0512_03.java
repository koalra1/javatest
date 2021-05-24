
public class Ex0512_03 {

	public static void main(String[] args) {
		// 구구단 출력 2*1=2, 2*3=6, 2*5=10 ....
		// 뒷자리 5까지만 출력
		loop1:for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++){
				if(j>5) {
					//continue;
					break loop1;
				}
				System.out.printf("%d * %d = %d %n",i,j,(i*j));
						
			}
			System.out.println();
		}
		
		
		
		
		
		
//		//구구단 출력 2*1=2, 2*3=6, 2*5=10 ....
//		//뒷자리는 홀수만 출력하게 
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++){
//				if(j%2==0) {
//					continue;
//					//break;
//				}
//				System.out.printf("%d * %d = %d %n",i,j,(i*j));
//						
//			}
//			System.out.println();
//		}
		
			
		
		
		
		
//		double a = 14255.2345678;
//		int b = 100;
//		String str = "school";
//		System.out.println("println출력 :"+a+","+b);
//		
//		System.out.printf("printf출력 : %9.2f,%d %n",a,b); 
//		// %d 정수값 출력 , %f 실수값 출력 , %s 문자값 출력
//		System.out.printf("printf출력 : %d %n",b);
//		System.out.printf("printf출력 :%s %n",str);
//	
//		for(int i=2;i<=9;i++) {
//			for(int j=2;j<=9;j++) {
//				System.out.printf("%d *%d = %d %n",i,j,(i*j))
//			}
//		}
		
		
		
	
	
	}

}
