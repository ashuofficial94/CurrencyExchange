package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class exchangeServlet
 */
@WebServlet("/ExchangeServlet")
public class ExchangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExchangeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**P
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		double amount = Double.parseDouble(request.getParameter("amount"));
		double exchangeRate = 0.014;
		
		ExchangeService service = new ExchangeService();
		int i=0;
		
		try {
			i = service.exchangeCurrency(amount, exchangeRate);
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(i>=1) {
			session.setAttribute("amount", amount);
			session.setAttribute("exchangedAmount", amount*exchangeRate);
			response.sendRedirect("result.jsp");
		}
		
		else {
			out.print("Value not inserted in table");
		}
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
