package com.cognizant.servlet;

import java.io.IOException;
import java.util.HashSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.dao.GetCountryClass;

/**
 * Servlet implementation class GetCity
 */
@WebServlet("/GetCity")
public class GetCity extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetCity() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("ksdfgsdgfgfyd");
		String country=request.getParameter("hotel-country");
        System.out.println(country);
        GetCountryClass getCountryFromClass=new GetCountryClass();
        HashSet<String> ctlist = null;
        HashSet<String> colist = null;
        colist = getCountryFromClass.getCountry();
        ctlist = getCountryFromClass.getCity(country);
        request.setAttribute("country", country);
        request.setAttribute("ctlist", ctlist);
        System.out.println(ctlist);
        request.setAttribute("colist", colist);
        RequestDispatcher rd=request.getRequestDispatcher("addpractice.jsp");
  rd.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


