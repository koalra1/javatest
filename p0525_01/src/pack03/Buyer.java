package pack03;

public class Buyer {
	String member_id = "";
	String member_pw = "";
	String name;
	int money = 2000;
	int bonuspoint = 0;
	int i=0;
	
	Product[] cart = new Product[10];
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonuspoint += p.bonuspoint;
		cart[i++] = p;
		System.out.println(p.pro_name+"(이)가 구매되었습니다.");
	}
}
