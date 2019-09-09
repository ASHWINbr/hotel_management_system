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
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String id=request.getParameter("id");
	    String eId=request.getParameter("eId");
	    String dId=request.getParameter("dId");
	    System.out.println("button id "+eId);
		HotelEditDaoSql editHotel= new HotelEditDaoSql();
		HotelList hList= editHotel.editHotelData(id);
		
		String hId=hList.getHotelId() ;
		String desc=hList.getHotelDescription();

		request.setAttribute("list", hList);
		int total= hList.getNumberOfAcRooms()+hList.getNumberOfNonAcRooms();
		request.setAttribute("total",total);
		
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
