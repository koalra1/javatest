import java.util.Scanner;

public class Ex0511_01 {

	public static void main(String[] args) {
		//����2 ���� 2.031457 ���� 5�ڸ� �ݿø� �Ͻÿ�.
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		double num = scan.nextDouble();
		double result = Math.round(num*10000) / 10000d;
		System.out.println("����� : "+result);
		
		
		
		// ���� 1
		// ���ڸ� �Է��� �޾� ¦������,Ȧ������ ��� (if)
//		Scanner scan = new Scanner(System.in);
//		System.out.println("���ڸ� �Է��ϼ���");
//		// scan.nextInt(); // ������
//		// scan.nextLine(); // ���ڿ�
//		// scan.nextDouble(); // �Ǽ���
//		int num = scan.nextInt(); // ������
////		System.out.println("���ڸ� �Է��ϼ���");
////		String str = scan.next(); // ���ڿ�
////		System.out.println("��� : " + num);
////		System.out.println("������� : " + str);
//		if(num%2==0){
//			System.out.println("¦��");
//		}
//		else {
//			System.out.println("Ȧ��");
//		}
	}

}
