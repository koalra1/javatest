package pack03;

public class Ex0526_1 {

	public static void main(String[] args) {
		// 조상 : Product 
		// 자손 : Refrigerator - "비스포크", 300,30
		// 			Washer - "트럼",180,18
		// 		Conditioner - "무풍",230,23
		// 		Styler - "스타일러",130,13
		// 초기보유금액 - 2000
		// 구매물품 - 비스포크 2대,트럼3대,무풍1대,스타일러2대
		// 총구매금액출력, 총구매개수출력, 총구매목록 출력
		

		Buyer b1 = new Buyer();
		
		b1.mem_id = "아이디";
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
		System.out.println("보너스포인트 :"+b1.bonusPoint);
		
		int sum = 0, bonus = 0;
		String buy_print = "";
		
		for(int i=0; i<b1.i;i++) {
			sum = sum+b1.cart[i].price;
			bonus = bonus+b1.cart[i].bonusPoint;
			buy_print = buy_print+" "+b1.cart[i].pro_name;
			
		}
		System.out.println("구매목록 :"+buy_print);
		System.out.println("총구매금액 :"+sum);
		System.out.println("총보너스포인트 :"+bonus);
	}

}
