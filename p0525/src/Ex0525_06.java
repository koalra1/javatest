import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex0525_06 {

	public static void main(String[] args) {
		//Calendar 객체 사용
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		//Calendar cal2 = new Calendar();
		Calendar cal = Calendar.getInstance();
		String today3 = sdf3.format(cal.getTime());
		System.out.println("Calendar객체 시간 :"+today3); //객체가 1개있다 시간을 바꾸면 다 바뀜
		
		
		
		//Date객체 사용 - 날짜와 시간을 구함.
		Date time = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String today = sdf1.format(time);
		System.out.println("Date객체 시간 :"+today); //각각 객체가 있다 시간을 바꿔도 다 바뀌지않음
				
		Date time2 = new Date();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String today2 = sdf2.format(time2);
		System.out.println("Date객체 시간 :"+today);
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
//		Singleton s = new Singleton();
//		s.setName("홍길동");
//		
//		System.out.println("학번 : "+s.getStu_num());
//		System.out.println("이름 : "+s.getName());

	}

}