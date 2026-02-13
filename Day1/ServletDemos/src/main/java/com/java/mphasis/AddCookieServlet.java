package com.java.mphasis;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookieServlet
 */
public class AddCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie ckVignesh, ckPrashanth,ckSelvi,ckManoj;
		
		ckVignesh = new Cookie("Vignesh", "88");
		ckVignesh.setMaxAge(60 * 60 * 24 * 1000);
		response.addCookie(ckVignesh);
		
		ckPrashanth = new Cookie("Prashanth", "92");
		ckPrashanth.setMaxAge(60 * 60 * 24 * 1000);
		response.addCookie(ckPrashanth);
		
		ckSelvi = new Cookie("Selvi", "93");
		ckSelvi.setMaxAge(60 * 60 * 24 * 1000);
		response.addCookie(ckSelvi);
		
		ckManoj = new Cookie("Manoj", "99");
		ckManoj.setMaxAge(60 * 60 * 24 * 1000);
		response.addCookie(ckManoj);
		
		PrintWriter out = response.getWriter();
		out.println("Cookies are Create Successfully...");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
