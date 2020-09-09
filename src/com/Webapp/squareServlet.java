package com.Webapp;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class squareServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		//int k=(int) req.getAttribute("k");
//		HttpSession session=req.getSession();
//		session.removeAttribute("k");
//		int k= (int) session.getAttribute("k");
//		int k=Integer.parseInt(req.getParameter("k"));
		
		int k=0;
		Cookie cookies[]=req.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("k"))
				k=Integer.parseInt(c.getValue());
		}
		
		res.getWriter().println("the sq is: "+ k*k);
		
		ServletContext cts=getServletContext();
		String s=cts.getInitParameter("Name");
		res.getWriter().println(s);
		
		ServletConfig cg=getServletConfig();
		String s1=cg.getInitParameter("Name");
		res.getWriter().println(s1);
	}
}
