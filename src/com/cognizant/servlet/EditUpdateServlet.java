package com.cognizant.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.dao.HotelEditDaoSql;
import com.cognizant.model.HotelList;

/**
 * Servlet implementation class EditUpdateServlet
 */
@WebServlet("/EditUpdateServlet")
public class EditUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//HotelList hList=new HotelList();
		boolean status=false;
		String hotelName = request.getParameter("hotel-name");
		String country = request.getParameter("hotel-country");
		System.out.println(hotelName+" "+country);
		String hotelId=request.getParameter("hotel-id");
		System.out.println(hotelId);
		
		
	    String city = request.getParameter("hotel-city");
		int number_of_ac_rooms = Integer.parseInt(request.getParameter("no_AC_Rooms"));
		int number_of_non_ac_rooms = Integer.parseInt(request.getParameter("no_Non_AC_Rooms"));
		int rate_child_in_ac_rooms = Integer.parseInt(request.getParameter("rate_AC_child"));
		int rate_child_in_non_ac_rooms = Integer.parseInt(request.getParameter("rate_Non_AC_child"));
		int rate_adult_in_ac_rooms = Integer.parseInt(request.getParameter("rate_adult"));
		int rate_adult_in_non_ac_rooms = Integer.parseInt(request.getParameter("rate_Non_AC_adult"));
		String description = request.getParameter("description");
		HotelList update_data = new HotelList(hotelId,country,city,hotelName,description, number_of_ac_rooms,number_of_non_ac_rooms,
				rate_adult_in_ac_rooms,rate_child_in_ac_rooms,rate_adult_in_non_ac_rooms,rate_child_in_non_ac_rooms);
		HotelEditDaoSql updateDb=new HotelEditDaoSql();
		status=updateDb.editDb(update_data);
		request.setAttribute("status",status);
		RequestDispatcher rd=request.getRequestDispatcher("EditHotel.jsp");
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
