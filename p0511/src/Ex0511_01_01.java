import java.util.Scanner;

public class Ex0511_01_01 {

	public static void main(String[] args) {
		// ���� 2.031457���� 5�ڸ� �ݿø� �Ͻÿ�.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�����Է�");
		double num = scan.nextDouble();
		double result = Math.round(num*10000)/10000d;
		System.out.println("����� :"+result);
	}

}
