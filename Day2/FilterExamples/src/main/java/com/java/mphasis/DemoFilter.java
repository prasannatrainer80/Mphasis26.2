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

public class DemoFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String sname = request.getParameter("sname");
		if (sname.length() >= 6) {
			chain.doFilter(request, response);
		} else {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
	out.println("<p style='color:red'> Name Contains Min. 6 Characters  </p>");
			RequestDispatcher disp = request.getRequestDispatcher("demo.html");
			disp.include(request, response);
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
