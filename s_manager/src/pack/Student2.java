package pack;

public class Student2 {
	static int count;
	 int stu_num;
	 String stu_name;
	 int kor,eng,math,total;
	 double avg;
	 int rank;
	
	{
		stu_num = ++count;
	}
	Student2(){}
	Student2(String stu_name,int kor,int eng,int math){
		this.stu_name = stu_name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
}
