package pack01;

public class Lotto_Process {
	
	
	//로또번호 생성 메소드
	void lotto_insert(int[]ball) { //인스턴스 메소드
		for(int i=0; i<ball.length; i++) { 
			ball[i]=i+1; //1부터 시작해야 하니깐 +1을 붙인다
			}
			System.out.println("45개 번호가 생성되었습니다.");
	}
	
	void lotto_random(int[]ball) {
		int temp = 0;
		for(int i=0; i<500; i++) {
			int random = (int)(Math.random()*45)+1;
			temp = ball[0];
			ball[0] = ball[random];
			ball[random] = temp;
		}
			System.out.println("로또번호 섞기가 완료 되었습니다.");
	}
}
