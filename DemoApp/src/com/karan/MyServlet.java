package com.karan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
//	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		
//		PrintWriter pw=response.getWriter();
//		pw.print("welcome  to the servlet Default Service");
//		
//	}
		
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//		String num1=(String)request.getParameter("number1");
//		response.getWriter().append("welcome to first servlet "+num1);
		RequestDispatcher rd=request.getRequestDispatcher("MySecondServlet");
		rd.forward(request, response);
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		PrintWriter pw=response.getWriter();
		pw.print("welcome  to the servlet POST");
		
	}

    

}




