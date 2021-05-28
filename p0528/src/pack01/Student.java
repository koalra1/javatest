package pack01;

public class Student {

   static int count;// 클래스 변수 : 객체x 클래스명.변수명 - 공통적으로 사용가능
   int stu_num;
   String stu_name;
   int kor;
   int eng;
   int math;
   int total;
   double avg;
   int rank;
   
   {
      stu_num = ++count;
   }

   Student() {
   }

   Student(String stu_name, int kor, int eng, int math) {
      this.stu_name = stu_name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.total = kor + eng + math;
      this.avg = this.total/3.0;
   }

}