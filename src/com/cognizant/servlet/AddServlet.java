package com.cognizant.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.dao.HotelAddDaoSql;
import com.cognizant.model.HotelList;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int i=1001;
    /**
     * Default constructor. 
     */
    public AddServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HotelAddDaoSql sql_obj = new HotelAddDaoSql();
		String hotelId="";
		String hotelName = request.getParameter("hotel-name");
		String country = request.getParameter("hotel-country");
	    String city = request.getParameter("hotel-city");
		int number_of_ac_rooms = Integer.parseInt(request.getParameter("no_AC_Rooms"));
		int number_of_non_ac_rooms = Integer.parseInt(request.getParameter("no_Non_AC_Rooms"));
		int rate_child_in_ac_rooms = Integer.parseInt(request.getParameter("rate_AC_child"));
		int rate_child_in_non_ac_rooms = Integer.parseInt(request.getParameter("rate_Non_AC_child"));
		int rate_adult_in_ac_rooms = Integer.parseInt(request.getParameter("rate_adult"));
		int rate_adult_in_non_ac_rooms = Integer.parseInt(request.getParameter("rate_Non_AC_adult"));
		String description = request.getParameter("description");
		hotelId=hotelName.substring(0,3);
		String num=Integer.toString(i);
		hotelId=hotelId.concat(num);
		HotelList add_data = new HotelList(hotelId,country,city,hotelName,description, number_of_ac_rooms,number_of_non_ac_rooms,
				rate_adult_in_ac_rooms,rate_child_in_ac_rooms,rate_adult_in_non_ac_rooms,rate_child_in_non_ac_rooms);
		boolean status=false;
	  status=sql_obj.getHotelData(add_data);
	  i++;
	  request.setAttribute("status",status);
	  RequestDispatcher rd=request.getRequestDispatcher("AddHotel.jsp");
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
