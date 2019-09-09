package com.cognizant.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.dao.register;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewServlet1
 */
@WebServlet("/SignUp")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int i=1001;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean status=false;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String custName=request.getParameter("cname");
		String password=request.getParameter("pass");
		String con_password=request.getParameter("cpass");
		String dob=request.getParameter("dob");
		
		String contact_no=request.getParameter("phno");
		String email=request.getParameter("mail");
		String country=request.getParameter("country");
		String city=request.getParameter("city");
		int pincode=Integer.parseInt(request.getParameter("pin"));
		String cust_id=custName.substring(0,1).concat("@");
		String num=Integer.toString(i);
		cust_id=cust_id.concat(num);
		int age=(Calendar.getInstance().get(Calendar.YEAR)-Integer.parseInt(dob.substring(0,4)))+1;
		
	out.println(age);
	try {
			status=register.insertdb(cust_id,custName,password,con_password,dob,contact_no,email,country,city,pincode,age);
			request.setAttribute("status",status);
			request.setAttribute("id",cust_id);
			 RequestDispatcher rd=request.getRequestDispatcher("signup.jsp");
			 rd.forward(request,response);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
		/*
		 * RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		 * rd.forward(request,response);
		 */
	}
	

}
