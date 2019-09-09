package com.cognizant.servlet;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.dao.booking;



/**
 * Servlet implementation class reserve_hotel
 */
@WebServlet("/reserve_hotel")
public class reserve_hotel extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int i=1001;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public reserve_hotel() {
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
		//System.out.println("lhdfkhsdkfj");
		String hotel_id=request.getParameter("reserve_id");
		String booking_date=request.getParameter("booking-date");
		String arrival_date=request.getParameter("arrival-date");
		String departure_date=request.getParameter("departure-date");
		int no_of_adults=Integer.parseInt(request.getParameter("no_of_adults"));
		int no_of_child=Integer.parseInt(request.getParameter("no_of_child"));
		int no_of_nights=Integer.parseInt(request.getParameter("no_of_nights"));
		int total_room=Integer.parseInt(request.getParameter("total_room"));
		String room_type=request.getParameter("room_type");
		System.out.println("sdfsd"+hotel_id);
		String book_id="book"+i;
		System.out.println("boookkk"+book_id);
		try {
			booking.book_db(book_id,hotel_id,booking_date,arrival_date,departure_date,no_of_adults,no_of_child,no_of_nights,total_room,room_type);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	System.out.println("Add completed");
	RequestDispatcher rd=request.getRequestDispatcher("Payment.jsp");
    rd.forward(request,response);
		//doGet(request, response);
	}

}
