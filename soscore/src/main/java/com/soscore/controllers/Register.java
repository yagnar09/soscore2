package com.soscore.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soscore.models.user;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view 	=request.getRequestDispatcher("WEB-INF/views/register.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*request.setAttribute("errors", false);
		user u = new user(null, null, null, null, null);
		String firstName =  request.getParameter("first-name");
		if (firstName.length() == 0) {
			System.out.println("empty first name error");

			request.setAttribute("errors", true);
			request.setAttribute("firstname_error", true);
			request.setAttribute("first_name", "");

		} else {
			u.setFirstName(firstName);
			request.setAttribute("first_name", firstName);
		}
		String lastName =  request.getParameter("last-name");
		if (lastName.length() == 0) {
			System.out.println("empty last name error");

			request.setAttribute("errors", true);
			request.setAttribute("lastname_error", true);
			request.setAttribute("last_name", "");

		} else {
			u.setLastName(lastName);
			request.setAttribute("last_name", lastName);
		}
		String dob_raw = request.getParameter("dob");
		String dobArray[] = dob_raw.split("\\/");
		String pattern = "^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$";
		Pattern r = Pattern.compile(pattern);

		Matcher m = r.matcher(dob_raw);

		if (m.find()) {

			String month = dobArray[0];
			String day = dobArray[1];
			String year = dobArray[2];

			Calendar cal = Calendar.getInstance();

			cal.set(Calendar.YEAR, Integer.parseInt(year));
			cal.set(Calendar.MONTH, Integer.parseInt(month));
			cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));

			Date dob = cal.getTime();

			System.out.println(dob);

			u.setDate(dob);
			request.setAttribute("dob", dob_raw);

		} else {
			System.out.println("Invalid date of birth");
			request.setAttribute("errors", true);
			request.setAttribute("date_format_error", true);
			request.setAttribute("dob", dob_raw);
			if(dob_raw.length() == 0) {
				request.setAttribute("dob", "");
			}
		}

		String mail = request.getParameter("mail");
		String password = request.getParameter("password");
		if ((Boolean) request.getAttribute("errors")) {

			RequestDispatcher view = request
					.getRequestDispatcher("WEB-INF/views/register");

			view.forward(request, response);

		} else {

			ServletContext sc = this.getServletContext();

			synchronized (this) {
				ArrayList<user> uList = (ArrayList<user>) sc.getAttribute("users");

				uList.add(u);

				sc.setAttribute("users", uList);
			}

			response.sendRedirect("");

		}		
	
		
*/
	}

}
