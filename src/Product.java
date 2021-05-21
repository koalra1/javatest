
public class Product {

	static int count; //클래스변수
	int serialNo;	//인스턴스 변수
	String Product_name; // 제품명
	int price; 
	int bonusPoint;
	
	{//인스턴스 초기화 블럭
	
		serialNo = ++count;
	
	}
	
	
	Product( ){	//생성자
		this("냉장고",500,5);
		
		
	} 

	Product(String Product_name, int price){
		this.Product_name = Product_name;
		this.price = price;
		this.bonusPoint = price/100;
	}
	Product(String Product_name, int price,int bonusPoint){
		this.Product_name = Product_name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
	

	
	
	
}
