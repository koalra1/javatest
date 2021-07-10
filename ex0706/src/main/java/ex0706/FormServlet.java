package ex0706;

import java.awt.Desktop.Action;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/fs")
public class FormServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		System.out.println("doGet호출");
		doaction(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("dopost호출");
		doaction(request, response);
	}
	
	public void doaction(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		
		request.setCharacterEncoding("utf-8");
		String id="",pw="",news="",age="",gender="",
				wedding="",baby="",job="",checks3="";
		
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		news = request.getParameter("news");
		age = request.getParameter("age");
		gender = request.getParameter("gender");
		wedding = request.getParameter("wedding");
		baby = request.getParameter("baby");
		job = request.getParameter("job");
		
		String[] check3;
		check3 = request.getParameterValues("check3");
		
		for(int i=0; i<check3.length;i++){
			checks3 = checks3+check3[i];
		}	
	
		
		
		
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw1 = response.getWriter();
		pw1.println("<html><head>");
		pw1.println("<title></title>");
		pw1.println("</head>");
		pw1.println("<body>");
		pw1.println("<h3>아이디 : "+id+"</h3>");
		pw1.println("<h3>비밀번호 : "+pw+"</h3>");
		pw1.println("<h3>소식지 수신여부 : "+news+"</h3>");
		pw1.println("<h3>관심연령 : "+age+"</h3>");
		pw1.println("<h3>성별 : "+gender+"</h3>");
		pw1.println("<h3>결혼여부 : "+wedding+"</h3>");
		pw1.println("<h3>자녀유무 : "+baby+"</h3>");
		pw1.println("<h3>직업 : "+job+"</h3>");
		pw1.println("<h3>관심사 : "+checks3+"</h3>");
		
		
		pw1.close();
	}

}
