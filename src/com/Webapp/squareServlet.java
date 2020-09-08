package com.Webapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class squareServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		//int k=(int) req.getAttribute("k");
		int k=Integer.parseInt(req.getParameter("k"));
		res.getWriter().println("the sq is: "+ k*k);
	}
}
