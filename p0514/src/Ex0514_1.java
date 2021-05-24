
public class Ex0514_1 {

	public static void main(String[] args) {
		
		//1차원 배열 30개짜리 생성해서 랜덤으로 1~100까지 숫자를 넣어 만들어보세요.
		//1차원 40개짜리 배열을 생성해서 배열 5번째방부터 20개만 복사해보세요.
		//복사할때 for문, arraycopy메소드 2가지 모두 사용하세요.
		
		int[]number = new int[30];
		int[]newnumber = new int[40];
		
		
		for(int i=0; i<number.length; i++) {
			number[i] = (int)(Math.random()*100)+1;
		}
		
		//for문 배열 복사
//		for(int i=4; i<24;i++) { //0,1,2,3,4
//			newnumber[i]=number[i];
//		}
		
		//arraycopy메소드 배열 복사
		System.arraycopy(number, 4, newnumber, 0, 20);
		
		
		
		//출력
		for(int i=0; i<newnumber.length;i++) {
			System.out.print(newnumber[i]);
		}
		
		
		
		
		
		

		//		//배열 추가하는법(뒤에 배열을 더 넣고싶을때)
//		int[]number = {1,2,3,4,5};
//		int[]newnumber = new int[10];
//
//		//System.arraycopy() 메소드 사용해서 배열 복사
//		System.arraycopy(number, 1, newnumber, 3,2);
//		
//		
//		
//		//for문 사용한 배열복사
////		for(int i=0; i<number.length;i++) {
////			newnumber[i] = number[i];
////		}
////		
//		for(int i=0; i<newnumber.length;i++) {
//			System.out.print(newnumber[i]);
//		}
//	//=============================================
	
	
	
	
	
	
	}

}
