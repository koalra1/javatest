//메소드 정의 , 메소드 호출 확인
public class Ex0518_01 {

	public static void main(String[] args) {

		Time[]t = new Time[3];
		
		for(int i=0;i<t.length;i++) {
			t[i] = new Time(); // 객체선언
			t[i].hour = i+1;
			t[i].minute = i+1;
			t[i].second = i+1;
					
		}
		
		for(int i=0; i<t.length; i++) {
			System.out.printf("%d시%d분%d초 \t",t[i].hour,t[i].minute,t[i].second);
		}
		
		
		
		
		
		
//		Time t = new Time();
//		
//		
//		
//		t.hour = 1;
//		t.minute = 1;
//		t.second = 1;
//
//	System.out.println(t.hour+"시"+t.minute+"분"+t.second+"초");
//	}

}
}