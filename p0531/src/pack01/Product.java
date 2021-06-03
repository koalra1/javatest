package pack01;

public class Product {

	String pro_name;
	int pro_price;
	int pro_bonus;
	
	Product(){}
	Product(String pro_name, int pro_price, int pro_bonus){
		this.pro_name = pro_name;
		this.pro_price = pro_price;
		this.pro_bonus = pro_bonus;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public int getPro_price() {
		return pro_price;
	}
	public void setPro_price(int pro_price) {
		this.pro_price = pro_price;
	}
	public int getPro_bonus() {
		return pro_bonus;
	}
	public void setPro_bonus(int pro_bonus) {
		this.pro_bonus = pro_bonus;
	}
	
	
}//class
