
public class MyMath2 {
	long a,b; // 같은 타입은 한줄로 쓸수있다. 인스턴스변수 - 객체선언후 사용, 클래스내에서사용

	long add() { //인스턴스메소드 -> 객체선언후 사용, 클래스내에서 사용
		return a+b;
	}

	static long add(long a,long b) { //클래스메소드 -> 객체선언없이 사용
		return a+b;
	}

}
