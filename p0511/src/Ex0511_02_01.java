import java.util.Scanner;

public class Ex0511_02_01 {

	public static void main(String[] args) {
		//�б��� ����� �Է��� ���� Ȯ���Ͻÿ�.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�б��� �����");
//		String input = scan.nextLine();
//		if(input.equals("school")) {
//			System.out.println("����");
//		}else {
//			System.out.println("����");
		
//====================================================================	
		
		//���� 1���� �Է¹޾� ���ĺ����� �ƴ����� ����Ͻÿ�.
		//���ĺ��Դϴ�. ���ĺ��� �ƴմϴ�.
		//��ҹ��� ��� ����.
		Scanner scan = new Scanner(System.in);
			System.out.println("�Է��ϼ���");
		char ch = scan.next().charAt(0);
		if(ch>='a'&&ch<='z' || ch>='A'&& ch<='Z') {
			System.out.println("���ĺ�");
		}else {
			System.out.println("���ĺ� �ƴ�");
		}
	
	
	
	
	
		}
	}


