
public class Ex0521_04 {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.Product_name = "OLED TV";
		p1.price = 700;
		p1.bonusPoint = p1.price/100;
		Product p2 = new Product("냉장고",500); //냉장고 500 5;
		Product p3 = new Product("세탁기",200,2);//세탁기 200 2;
		
		
		
		System.out.println("p1 : "+p1.serialNo);
		System.out.println("p1 : "+p1.Product_name);
		System.out.println("p1 : "+p1.price);
		System.out.println(p2.Product_name);
		System.out.println(p2.price);
		System.out.println(p2.bonusPoint);
		System.out.println(p3);
		
		
		
		System.out.println("전체count : "+Product.count+" 개");
	}

}
