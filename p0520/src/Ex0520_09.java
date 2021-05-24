
public class Ex0520_09 {

	public static void main(String[] args) {
		int[] aa = new int[5];
		System.out.println(aa); // 배열이 만들어져있는 주소값
		
		MyMath2 mm = new MyMath2();
		mm.a = 200;
		mm.b = 100;
		
		long c = mm.add();
		System.out.println(mm);//주소값
		System.out.println(c); // 300
		
		long d = MyMath2.add(mm.a, mm.b);
		System.out.println(d); // 300
	}

}//class
