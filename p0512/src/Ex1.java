import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		//5명의 학생 이름,국어,영어,수학점수 입력받아
		//이름,국어,영어,수학,합계,평균을 출력하시오.
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[2];
		int[] kor = new int[2];
		int[] eng = new int[2];
		int[] math = new int[2];
		int[] total = new int[2];
		double[] avg = new double[2];
		
		for(int i=0; i<name.length;i++) {
			System.out.println("이름:");
			name[i]=scan.next();
			System.out.println("국어");
			kor[i]=scan.nextInt();
			System.out.println("영어");
			eng[i]=scan.nextInt();
			System.out.println("수학");
			math[i]=scan.nextInt();
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		System.out.printf("이름\t 국어\t 영어\t 수학\t 합계\t 평균\t \n");
		System.out.println("-------------------------------------------------");
	
		for(int i=0; i<name.length;i++) {
			System.out.print(name[i]+"\t");
			System.out.print(kor[i]+"\t");
			System.out.print(eng[i]+"\t");
			System.out.print(math[i]+"\t");
			System.out.print(total[i]+"\t");
			System.out.printf("%.2f",avg[i]);
			System.out.println();
		}
	}//main

}//class
