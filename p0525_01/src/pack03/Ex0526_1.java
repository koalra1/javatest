package pack03;

public class Ex0526_1 {

	public static void main(String[] args) {
		Buyer b1 = new Buyer();
		
		b1.member_id = "아이디";
		b1.name = "홍길동"; 
		
		b1.buy(new Refrigerator());
		b1.buy(new Refrigerator());
		b1.buy(new Washer());
		b1.buy(new Washer());
		b1.buy(new Washer());
		b1.buy(new Conditioner());
		b1.buy(new Styler());
		b1.buy(new Styler());
		
		System.out.println("보유금액 :"+b1.money);
		System.out.println("보너스포인트 :"+b1.bonuspoint);
		
		int sum=0, bonus=0;
		String guname = "";
		
		for(int i=0; i<b1.i;i++) {
			sum = sum+b1.cart[i].price;
			bonus = bonus+b1.cart[i].bonuspoint;
			guname = guname+" "+b1.cart[i].pro_name;
		}
		System.out.println("구매목록 :"+guname);
		System.out.println("총구매금액 :"+sum);
		System.out.println("총보너스포인트 :"+bonus);
	}

}
