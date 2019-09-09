package com.cognizant.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.dao.HotelDeleteDaoSql;
import com.cognizant.dao.HotelEditDaoSql;
import com.cognizant.model.HotelList;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
	    String dId=request.getParameter("dId");
	    
		HotelEditDaoSql editHotel= new HotelEditDaoSql();
		HotelList hList= editHotel.editHotelData(id);
		
		

		request.setAttribute("list", hList);
		int total= hList.getNumberOfAcRooms()+hList.getNumberOfNonAcRooms();
		request.setAttribute("total",total);
		
			RequestDispatcher rd=request.getRequestDispatcher("DeleteHotel.jsp");
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
