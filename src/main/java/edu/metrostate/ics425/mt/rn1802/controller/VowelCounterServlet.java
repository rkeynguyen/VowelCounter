package edu.metrostate.ics425.mt.rn1802.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.metrostate.ics425.mt.rn1802.model.VowelCounter;
/**
 * @author Ricky N Implementation of the VowelCounterServlet
 */
@WebServlet("/countVowels")
public class VowelCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public VowelCounterServlet() {
		super();
	}

	/**
	 * The doGet method of the servlet. 
	 * 
	 * @param request  the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException      if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		processRequest(request, response);
	}

	/**
	 * The doPost method of the servlet. 
	 * 
	 * @param request  the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException      if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// get the text
		String text = request.getParameter("text");
		
		//make a vowelCounter object and pass string
		VowelCounter vc = new VowelCounter();
		vc.setText(text);
		
		// store vowel count
		if(!(text == null || text.isBlank())) {
			request.setAttribute("count", vc.getVowelCounts());
		}
		
		// forward
		request.getRequestDispatcher("/vowelCounts.jsp").forward(request, response);
	}

}
