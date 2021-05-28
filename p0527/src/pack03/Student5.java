package pack03;

public class Student5 {
	static int count;
	String stu_num;
	String name;
	int kor,eng,math,total;
	double avg;
	int rank;
	
	{
		stu_num = "S"+String.format("%03d", ++count);
	}
	Student5(){}
	
	Student5(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
}
