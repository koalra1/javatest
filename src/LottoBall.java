
public class LottoBall {
	
	
	static int[] ball = new int[45];
	
	static {
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		int temp=0; // 임시데이터저장변수
		int randomNum=0; //배열 랜덤번호 사용	
		
		for(int i=0; i<200;i++) {			
			randomNum = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[randomNum];
			ball[randomNum] = temp;
		}
	}
}
