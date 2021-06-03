package pack01;

import java.util.ArrayList;
import java.util.Scanner;

public class Buyer {
	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();
	Product p = new Product();
	private String mem_id = "";
	private String mem_pw = "";
	private String name = "";
	private int money = 1000;
	private int point = 0;

	void buy(Product p) {
		if (money < p.getPro_price()) {
			System.out.println("잔액이 부족합니다.");
		}

		money = money - p.getPro_price();
		point = point + p.getPro_bonus();
		list.add(p);

		System.out.println(p.getPro_name()+"구매완료");
	}
	void print() {
	System.out.println("현재잔액 :" + money);
	System.out.println("보유포인트 :"+point);
	}
	void summary() {
		String pro_list = "";
		int sum = 0;
		if(list.isEmpty()) {
			System.out.println("구매 물품이 없음");
			return;
		}
		for(int i=0; i<list.size();i++) {
			Product p = (Product)list.get(i);
			pro_list = pro_list+p.getPro_name()+" ";
			sum = sum+p.getPro_price();
		}
		System.out.println("총 구매목록 개수 : "+list.size());
		System.out.println("총 구매목록 : "+pro_list);
		System.out.println("총 구매금액 : "+sum);
	}
	
//	void cash() {
//		
//			System.out.println("충전할 금액 입력");
//			int check = scan.nextInt();
//			check = check+money;
//			
//			System.out.println(check+"이 충전 완료");
//		
//	}
	
	
	
	
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

}// class
