package pack03;

import java.util.ArrayList;
import java.util.Scanner;

public class StuManager {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		StuProcess p = new StuProcess();
		while(true) {
			
			p.main();
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				p.input(list);
				break;
			case 2:
				p.output(list);
				break;
			case 3:
				p.update(list);
				break;
			case 4:
				p.search(list);
				break;
			case 5:
				p.rank(list);
				break;
			}
		}
	}

}
