package pack01;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Process {

   static Scanner scan = new Scanner(System.in);
   
   
   //학생성적추가 메소드
   void student_insert(ArrayList list) {
      
      // 1. 이름,국어,영어,수학
      String stu_name = "";
      int kor = 0, eng = 0, math = 0;

      while(true) {
         
         System.out.println("학생 이름을 입력하세요 (0:상위 메뉴): ");
         stu_name = scan.next();
         if(stu_name.equals("0")) {
            System.out.println("상위메뉴로 이동합니다.");
            break;
         }
         System.out.println("국어점수를 입력하세요 : ");
         kor = scan.nextInt();
         System.out.println("수학점수를 입력하세요 : ");
         eng = scan.nextInt();
         System.out.println("영어점수를 입력하세요 : ");
         math = scan.nextInt();
         
         //list 저장
         list.add(new Student(stu_name,kor,eng,math));
         
         
      }//1.성적추가부분 while
      
      //2.학생성적출력 메소드
      }
   void student_print(ArrayList list) {
	   System.out.print("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
	   System.out.println("=======================================");
	   
	   for(int i=0; i<list.size();i++) {
		   
		   Student s = (Student)list.get(i);//타입은 Object 안에 내용물이 없기때문에 형변환 해줘야한다
		   System.out.print(s.stu_num+"\t");
		   System.out.print(s.stu_name+"\t");
		   System.out.print(s.kor+"\t");
		   System.out.print(s.eng+"\t");
		   System.out.print(s.math+"\t");
		   System.out.print(s.total+"\t");
		   System.out.printf("%.2f \t",s.avg);
		   System.out.print(s.rank+"\n");
		   
	   }
      
   }// 2.학생성적 출력
   
   //3.수정
   void student_update(ArrayList list) {
	// 1.수정할 학생검색-비교 2.과목선택 3.점수입력 4.점수수정
	 System.out.println("수정할 학생이름을 입력하세요>>");
  	 String update_name = scan.next();
  	 
  	 // list
  	 int check_flag = 1;
  	 for(int i=0; i<list.size();i++) {
  	 Student s = (Student)list.get(i);//list에서 1개씩 가져옴
  	 if(s.stu_name.equals(update_name)) {
  		 System.out.println("수정할 학생을 찾았습니다.");
  		 System.out.println(i+"."+s.stu_name);
  		 System.out.println("[ 수정과목선택 ]");
  		 System.out.println("1.국어 2.영어 3.수학");
  		 System.out.println("원하는 번호를 선택하세요.>>");
  		 int temp_num = scan.nextInt();
  		 switch(temp_num) {
  		 case 1:
  			System.out.println("현재점수 :"+s.kor);
  			System.out.println("수정할 점수입력 :");
  			s.kor = scan.nextInt();
  			System.out.println("수정완료");
  			 break;
  		 case 2:
  			 System.out.println("현재점수 :"+s.eng);
  			 System.out.println("수정할 점수입력 :");
  			 s.eng = scan.nextInt();
  			 System.out.println("수정완료");
  			 break;
  		 case 3:
  			 System.out.println("현재점수 :"+s.math);
  			 System.out.println("수정할 점수입력 :");
  			 s.math = scan.nextInt();
  			 System.out.println("수정완료");
  			 break;
  		 }
  		 s.total = s.kor+s.eng+s.math; //합계수정
  		 s.avg = s.total/3.0; //평균수정
  		
  	 }
  		 
  	 
  	 }//for
  	 if(check_flag==0) {
  		System.out.println("수정할 학생을 찾지 못했습니다.");
  	 }
   }//3.수정
   
   
   //4.학생성적검색
  void student_search(ArrayList list) {
	// 1.검색할 이름입력 2.for문반복,3.if문비교,4.검색출력
	  System.out.println("검색할 학생이름을 입력하세요.>>");
		String search_name = scan.next();

		System.out.print("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("=======================================");

		int check_flag = 0; //검색할 대상이 없다.
		for (int i = 0; i < list.size(); i++) {
			Student s = (Student) list.get(i);
			if (s.stu_name.contains(search_name)) {

				System.out.print(s.stu_num + "\t"); 
				System.out.print(s.stu_name + "\t");
				System.out.print(s.kor + "\t");
				System.out.print(s.eng + "\t");
				System.out.print(s.math + "\t");
				System.out.print(s.total + "\t");
				System.out.printf("%.2f \t", s.avg);
				System.out.print(s.rank + "\n");
			
				check_flag = 1; //검색할 대상이 있다.
			}
		}//for
		if(check_flag==0) {
			System.out.println("찾는 데이터가 없습니다. 다시 검색하세요.");
		}
  }//4.학생성적검색
  
  //5.등수처리
  void student_rank(ArrayList list) {
	  //1.for문으로 합계객체 가져오고 비교 2.등수처리
	  for(int i=0; i<list.size();i++) {
			Student s1 = (Student)list.get(i);
			int rankcount = 1;
			for(int j=0; j<list.size(); j++) {
				Student s2 = (Student)list.get(j);
				if(s1.total<s2.total) {
					rankcount++;
					
				}
			}
			s1.rank = rankcount; // 등수를 rank에저장
		}
  }//5.등수처리
}