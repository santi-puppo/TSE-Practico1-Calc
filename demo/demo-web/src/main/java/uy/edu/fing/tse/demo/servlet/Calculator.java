package uy.edu.fing.tse.demo.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
//	@EJB(lookup="java:global/demo/demo-ejb/Calc2021!uy.edu.fing.tse.demo.Calc2022Remote") 
	@EJB
	uy.edu.fing.tse.demo.Calc2022Remote calculadora;	
	
	/**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Integer x = Integer.parseInt(request.getParameter("x"));
		Integer y = Integer.parseInt(request.getParameter("y"));
		
		Integer a = calculadora.SumarEnteros(x, y);
					
		response.getWriter().append("Resultado: ").append(a.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}