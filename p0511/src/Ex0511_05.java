
public class Ex0511_05 {

	public static void main(String[] args) {
		
		
		int i=1;
		int sum=0;
		while(true) {
			if(sum>10) {
				break;
			}
			sum += i;// i 1�϶� sum��1, 4, 9, 16
			i = i+2; //3
		}
		System.out.println("������ȣ : " + (i-2));
		System.out.println("�հ� :" + sum);
		
		
		
		
		
		
		
		
		
		//1~200���� �հ谡 200�� �Ѿ�� ������ ���ڿ� �հ踦 ���Ͻÿ�.
//		int i = 1;
//		int sum = 0;
//		while(true) {
//			if(sum>200) {
//				break;
//			}
//			sum += i; // 1,4,9,16,25 .......
//			i = i+2; // 3,5,7,9,11 .......
//		}
//		System.out.println("������ȣ : " + (i-2));
//		System.out.println("�հ� :" + sum);
//		int sum=0; // �հ��ʱ�ȭ
//		
//		while(true) {                 // == for(){}�� ����
//			if(sum>100) {
//				break;
//			}
//			i++;
//			sum = sum+i;
//			
//		}
//		System.out.println("������ȣ : " + i);
//		System.out.println("�հ� : "+sum);
		
	
//		int i=0; // �������� ��ȣ
//		int sum=0; // �հ��ʱ�ȭ
//		
//		while(true) {                 // == for(){}�� ����
//			if(sum>100) {
//				break;
//			}
//			i++;
//			sum = sum+i;
//			
//		}
//		System.out.println("������ȣ : " + i);
//		System.out.println("�հ� : "+sum);
		
		// 000
		// 001
		// 002
		//...
		// 999
//	for(int i=0;i<=9;i++) {
//		for(int j=0;j<=9;j++) {
//			for(int k=0; k<=9; k++) {
//				System.out.print(""+i+j+k+"\t");
//			}
//			System.out.println();
//		}
//		
//		
//}
	
	
	
	
	}

}
