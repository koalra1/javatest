package pack01;

import java.util.ArrayList;

public class Buyer {
	String mem_id = "";
	String mem_pw = "";
	String name = "";
	int money = 2000;
	int point = 0;
	
	ArrayList list = new ArrayList();
	
	void buy(Product p){
		
			if(money<p.getPro_price()) {
				System.out.println("잔액이 부족합니다. 충전해주세요");
				return;
			}
			money = money - p.getPro_price();
			point = point + p.getPro_bonus();
			list.add(p);
			System.out.println(p.getPro_name()+"구매가 완료되었습니다.");
		
	}
	void info() {
		System.out.println(money+": 잔액이 남았습니다.");
		System.out.println(point+": 보너스포인트 적립");
		}

	void summary() {
		String pro_list = "";
		int sum = 0;
		if(list.isEmpty()) {
			System.out.println("구매한 물품이 없습니다.");
			return;
		}
		for(int i=0; i<list.size();i++) {
			Product p = (Product)list.get(i);
			pro_list = pro_list + p.getPro_name()+" ";
			sum = sum+p.getPro_price();
		}
		System.out.println("총 구매목록개수:"+list.size());
		System.out.println("총구매 금액:"+sum);
		System.out.println("총 구매목록:"+pro_list);
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pw() {
		return mem_pw;
	}
	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}



}//class
