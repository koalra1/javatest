package pack02;

public class Buyer {
	String mem_id;
	String mem_pw;
	String name;
	int money = 1000; //1000만원
	double bonusPoint = 0;
	int i=0;
	
	Product[] cart = new Product[10]; //구매목록확인
	
	
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족합니다.물품을 구매할수없습니다. 충전하세요.");
			return; //메소드 return
		}
		money = money-p.price; //내 돈에서 가격이 나가는거니깐 빼준다
		bonusPoint = bonusPoint + p.bonusPoint; //보너스포인트 받는거니깐 더한다
		//bonusPoint += t.bonusPoint; 위에꺼와 같은식 
		cart[i++] = p;
		System.out.println(p.pro_name+"가 구매되었습니다.");

	}
//	void buy(Computer c) {
//		//money = money-c.price; //내 돈에서 가격이 나가는거니깐 빼준다
//		money -= c.price;
//		//bonusPoint = bonusPoint + c.bonusPoint; //보너스포인트 받는거니깐 더한다
//		bonusPoint += c.bonusPoint; 
//
//		System.out.println(c.pro_name+"가 구매되었습니다.");
//	}
//	void buy(Audio a) {
//		//money = money-c.price; //내 돈에서 가격이 나가는거니깐 빼준다
//		money -= a.price;
//		//bonusPoint = bonusPoint + c.bonusPoint; //보너스포인트 받는거니깐 더한다
//		bonusPoint += a.bonusPoint; 
//
//		System.out.println(a.pro_name+"가 구매되었습니다.");
//	}
	
}
