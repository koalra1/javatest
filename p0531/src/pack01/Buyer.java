package pack01;


import java.util.ArrayList;
import java.util.Scanner;

public class Buyer {
	private String mem_id;
	private String mem_pw;
	private String name;
	private int money=2000;
	private int bonuspoint;
	
	
	ArrayList list = new ArrayList();
	static Scanner scan = new Scanner(System.in);
	
	void buy(Product p) {
		if(money<p.getPro_price()) {
			System.out.println("잔액이 부족합니다. 충전해주세요");
			return;
		}
		money = money-p.getPro_price();
		bonuspoint = bonuspoint+p.getPro_bonus();
		list.add(p);
		System.out.println(p.getPro_name()+" 를(을)구매하였습니다.");
	}
	
	void info() {
		System.out.println("보유금액 :"+money);
		System.out.println("보유포인트 :"+bonuspoint);
	}
	void summary() {
		String product_list = ""; // 구매목록
		int sum = 0; // 총구매금액
		if(list.isEmpty()) { //ArrayList사용시 list에 값이 존재하지 않을때를 뜻한다 list.isempty()메소드 를 사용한다
			System.out.println("구매한 물품이 없습니다.");
			return;
		}
		for(int i=0; i<list.size();i++) {
			Product p = (Product)list.get(i);
			product_list = product_list + p.getPro_name()+" ";//구매 목록:맥북
			sum = sum+p.getPro_price();//총구매 금액 :150만원
		}
		System.out.println("총 구매목록 개수 : "+list.size());
		System.out.println("총 구매목록 : "+product_list);
		System.out.println("총 구매금액 : "+sum);
	}
	
	void cash() {
		System.out.println("충전금액 입력(만원)(0번상위메뉴)");
		int cash = scan.nextInt();
		if(cash==0) {
			System.out.println("상위메뉴이동");
			return;
		}
		cash = cash+getMoney();
		setMoney(cash);
		System.out.println(cash+": 현재잔액");
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

	public int getBonuspoint() {
		return bonuspoint;
	}

	public void setBonuspoint(int bonuspoint) {
		this.bonuspoint = bonuspoint;
	}

}
	
	
	
	
	
	
	
//	private String mem_id; //구매자 아이디
//	private String mem_pw; //구매자 비번
//	private String name; //구매자 이름
//	private int money=2000; //구매자 가지고있는 돈
//	private int bonuspoint; //구매자 보유하고있는 포인트
//
//	ArrayList list = new ArrayList();
//	Product p = new Product();
//	//1.buy
//	void buy(Product p) {//1.이 p는 어디인가
//		if(money<p.getPro_price()) {
//			System.out.println("잔액이 부족합니다. 잔액보충을 해주세요.");
//			return;
//		}
//		money = money-p.getPro_price();
//		bonuspoint = bonuspoint+p.getPro_bonus();
//		System.out.println(p.getPro_name()+"구매하였습니다.");
//		list.add(p);
//	}//1.구매 
//	
//	void myInfo() {
//		System.out.println("보유금액 :"+money+"만원");
//		System.out.println("보너스포인트 :"+bonuspoint+"포인트");
//	}
//	
//	void summary() { //구매목록
//		String product_list = ""; //구매목록 변수만들기
//		if(list.isEmpty()) { //isEmpty()
//			System.out.println("구매한 물품이 없습니다.");
//			return;
//		}
//		int sum = 0; //총 구매금액  
//		for(int i=0; i<list.size();i++) {
//			Product p = (Product)list.get(i);
//			product_list = product_list+p.getPro_name()+" ";
//			sum = sum+p.getPro_price();
//		}
//		System.out.println("총구매 목록 개수 :"+list.size()+"개");
//		System.out.println("총구매 금액 :"+sum+"만원");
//		System.out.println("구매 목록:"+product_list);
//	
//	
//	}//2.합계
//
//	public String getMem_id() {
//		return mem_id;
//	}
//
//	public void setMem_id(String mem_id) {
//		this.mem_id = mem_id;
//	}
//
//	public String getMem_pw() {
//		return mem_pw;
//	}
//
//	public void setMem_pw(String mem_pw) {
//		this.mem_pw = mem_pw;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getMoney() {
//		return money;
//	}
//
//	public void setMoney(int money) {
//		this.money = money;
//	}
//
//	public int getBonuspoint() {
//		return bonuspoint;
//	}
//
//	public void setBonuspoint(int bonuspoint) {
//		this.bonuspoint = bonuspoint;
//	}
//
//	
//	
//}//class
