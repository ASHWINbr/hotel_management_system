package com.cognizant.servlet;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.dao.InsertPayment;
import com.cognizant.model.Payment;
/**
 * Servlet implementation class PaymentServlet
 */
@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String bank_name=request.getParameter("bank-name");
		String exp_date=request.getParameter("exp-date");
		long card_number=Long.parseLong(request.getParameter("card-no"));
		int ccv=Integer.parseInt(request.getParameter("ccv"));
		long acc_no=Long.parseLong(request.getParameter("acc-no"));
		String card_type=null;
		String card_name=request.getParameter("card-name");
		if(request.getParameter("card-type")!=null)
		{
			card_type=request.getParameter("card-type");
		}
		long pin_no=Long.parseLong(request.getParameter("pin-no"));
		Payment pay=new Payment(bank_name,exp_date,card_number,ccv,card_type,acc_no,card_name,pin_no);
		InsertPayment ip=new InsertPayment();
		ip.InsertData(pay);
		request.setAttribute("pay",pay);
		RequestDispatcher rd=request.getRequestDispatcher("PaymentDetails.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
