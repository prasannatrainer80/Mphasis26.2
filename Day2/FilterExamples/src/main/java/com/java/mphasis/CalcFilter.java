package com.java.mphasis;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CalcFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		int firstNo = Integer.parseInt(request.getParameter("firstNo"));
		int secondNo = Integer.parseInt(request.getParameter("secondNo"));
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		RequestDispatcher disp = request.getRequestDispatcher("calc.html");
		if (firstNo < 0 || secondNo < 0) {
			out.println("Negative Numbers Not Allowed...");
			disp.include(request, response);
		} else if (firstNo == 0 || secondNo == 0) {
			out.println("Zero is Invalid Value...");
			disp.include(request, response);
		} else {
			chain.doFilter(request, response);
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
