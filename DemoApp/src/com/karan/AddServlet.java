package com.karan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
	 int i=Integer.parseInt(req.getParameter("number1"));	
	 int j=Integer.parseInt(req.getParameter("number2"));
	 
	 int k=i+j;
	 
	PrintWriter out=res.getWriter();	
	out.print(k);
	}
}