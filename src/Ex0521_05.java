
public class Ex0521_05 {

	public static void main(String[] args) {
		String num ="";
		int count=0;
		//S001,S002...
//		System.out.printf("%d \n",5);//5
//		System.out.printf("%,07d\n",12345);//012,345
//		System.out.printf("%07.2f\n",78.12345);//0078.12
//		System.out.printf("%10s \n","더좋은");
//		System.out.printf("%s%03d","S",1);
		
		String str_num ="S"+ String.format("%03d", ++count);
		
		System.out.println(str_num);
	}

}
