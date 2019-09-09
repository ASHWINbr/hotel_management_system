package com.cognizant.servlet;

import java.util.List;
import java.io.IOException;
import java.util.HashSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.dao.HotelDao;
import com.cognizant.dao.HotelDaoIn;
import com.cognizant.dao.Hotel_details;


/**
 * Servlet implementation class city
 */
@WebServlet("/SearchHotels")
public class SearchHotels extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchHotels() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String hotelid=request.getParameter("hotelid");
		System.out.println(hotelid);
		HotelDaoIn sd=new HotelDao();
		Hotel_details hotellist = null;
		HashSet<String> idlist = null;
		idlist = sd.getHotelId();
		hotellist = sd.getDetails(hotelid);
		//System.out.println("cvbcv"+hotellist.getHotel_name());
		request.setAttribute("hotelid", hotelid);
		request.setAttribute("hotellist", hotellist);
		request.setAttribute("idlist", idlist);
		int total=hotellist.getAc_room()+hotellist.getNon_ac_room();
		request.setAttribute("total",total);
		RequestDispatcher rd=request.getRequestDispatcher("Search.jsp");
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
