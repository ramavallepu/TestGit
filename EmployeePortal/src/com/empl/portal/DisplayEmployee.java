package com.empl.portal;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class DisplayEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DisplayEmployee() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("in get");
	
	
	HttpSession sess = request.getSession();
	
	String fname = (String)sess.getAttribute("fname");
	String lname = (String)sess.getAttribute("lname");
	
	ArrayList lst = (ArrayList) sess.getAttribute("list");
	
	System.out.println("list size is : "+lst.size());
	response.getWriter().println("Welcom "+":"+fname+":"+lname);
	}

}
