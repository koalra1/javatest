package pack02;

import java.util.ArrayList;

public class Buyer2 {
	String mem_id;
	String mem_pw;
	String name;
	int money = 1000;
	int point;
	
	ArrayList list = new ArrayList();
	
	void buy(Product2 p) {
		if(money<p.getPro_price()) {
			System.out.println("잔액이 부족합니다.");
		}
		money = money-p.getPro_price();
		point = point+p.getPro_bonus();
		list.add(p);
		System.out.println(p.getPro_name()+"구매 완료");
		
	}
	void info(){
		System.out.println("현재잔액 :"+money);
	}
	void summary() {
		String pro_list = "";
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			Product2 p = (Product2)list.get(i);
			pro_list = pro_list + p.getPro_name()+" ";
			sum = sum+p.getPro_price();
		}
		System.out.println("총구매목록 :"+list.size());
		System.out.println("총 구매금액 :"+sum);
		System.out.println("구매 목록 :"+pro_list);
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
