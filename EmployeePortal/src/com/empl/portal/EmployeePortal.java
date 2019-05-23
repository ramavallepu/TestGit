package com.empl.portal;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeePortal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmployeePortal() {
		super();
	}




	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		
		String fname= request.getParameter("fname");
		String lname= request.getParameter("lname");
		
		//response.getWriter().println("Welcom "+":"+fname+" "+lname);
		
		// DB stuff
		HttpSession session = request.getSession();
		ArrayList list = new ArrayList();
		list.add("INDIA");
		list.add("CHINA");
		list.add("SINGAPORE");
		list.add("INDONASIA");
		list.add("THAILAND");
		
		session.setAttribute("list", list);
		ServletContext application=getServletConfig().getServletContext(); 
		System.out.println("application"+application.getContextPath());
		
		ServletContext application1=getServletContext(); 
		System.out.println("application1 "+application1.getInitParameter("driver"));
		session.setAttribute("fname", fname);
		session.setAttribute("lname", lname);
		
		response.getWriter().println("Welcom "+":"+fname+" "+lname);
		/*RequestDispatcher rd = request.getRequestDispatcher("DisplayEmployee");
		rd.forward(request, response);*/
		
	}


}
