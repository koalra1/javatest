
public class Deck {
	String[] kinds = {"Spade","Diamond","Heart","Clover"};
	String[] number = {"1","2","3","4","5","6","7","8","9","10","K","Q","J"};

	Card[] c = new Card[52];
	Card[] myCard = new Card[7]; //내카드 7장
	Card[] comCard = new Card[7];
	
	Deck() { //기본생성자 13*i+j
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				c[13*i+j] = new Card(kinds[i],number[j]);
			}
		}
	}
	
	
	//1. 1장 카드출력
	void print_1card(int index) {
		System.out.printf("카드 : %s,%s \n",c[index].kind,c[index].number);
	}
	
	//2. 5장 카드출력
	void print_5card() {
		System.out.println("[5장 출력]");
		for(int j=0;j<5;j++) {
			System.out.printf("카드 : %s,%s \n",c[j].kind,c[j].number);
		}
	}
	
	//3. 52장 카드출력
	void print_52card() {
		System.out.println("[52장 출력]");
		for(int i=0; i<4; i++) {
			for(int j=0; j<13;j++) {
				System.out.printf("카드 : %s,%s \n",c[13*i+j].kind,c[13*i+j].number);
			}
		}
	}
	//4. 섞기 메소드
		void shuffle() {
			for(int i=0; i<1000; i++) {
				int random_no = (int)(Math.random()*52);
				Card temp = c[0];
				c[0] = c[random_no];
				c[random_no] = temp;
			}
		}
	//5. 7장 배분 메소드
		void handOut7card() {
			System.out.println("[7장씩 카드 배분]");
			for(int j=0; j<14; j++) {
				if(j<=6) {
					myCard[j] = new Card(c[j].kind,c[j].number);
					System.out.printf("My카드 : %s,%s \n",myCard[j].kind,myCard[j].number);
				}else {
						comCard[j-7] = new Card(c[j].kind,c[j].number);
						System.out.printf("comCard카드 : %s,%s \n",myCard[j-7].kind,myCard[j-7].number);
					}
				}
			}
		//메뉴 출력
		void menu_print() {
			System.out.println("1.1장출력");
			System.out.println("2.5장출력");
			System.out.println("3.52장출력");
			System.out.println("4.카드섞기");
			System.out.println("5.7장카드배분");
			System.out.println("0.종료");
		}
	
}//class
