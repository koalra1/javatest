package pack02;

public class Student3 {
	static int count; 
	String stu_number; 
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	{ //초기화블럭 : 생성자 공통적으로 계속 사용하는거니깐 분리시켜서 따로 하나 더 만든다
		stu_number="S"+ String.format("%03d", ++count); //학생번호
	}
	Student3(){} 
	Student3(String name){
		this.name = name;
	}
	Student3(String name,int kor){
		this.name = name;
		this.kor = kor;
	}
	
	Student3(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
}


