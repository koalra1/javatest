import java.util.Scanner;

public class Ex0511_06 {
d
	public static void main(String[] args) {
		// 1~100���� ������ �����ؼ�
		// ���ѹݺ��ؼ� ��ȣ�� ���⶧ break������ ������������.
		// ������ڸ� ����Ͻÿ�.
	Scanner scan = new Scanner(System.in);
	int score = (int)(Math.random()*100)+1; // 
	//���ѹݺ�
	int num=0;
	int count=1;// Ƚ��
	while(count<=5) {
		System.out.println(count+"��° ����! ���ڸ� �Է��ϼ���.>>");
		num = scan.nextInt();
		if(num==score) {
			System.out.println("�����Դϴ�.!");
			break;
		}else if(num>score) {
			System.out.println("Ʋ�Ƚ��ϴ�.!");
			System.out.println(num+"�Է��� ���ں��� �������� �Է��ϼ���");
			}else {
				System.out.println(num+"�Է��� ���ں��� ū���� �Է��ϼ���");
			}
		count++;
	}// while
		
	System.out.println("���� :" + score);
	}

}

