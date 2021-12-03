package com.training.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.bean.User;
import com.training.bo.UserBo;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();
		UserBo userBo=new UserBo();
		user.setFirstName(request.getParameter("firstName"));
		String lastName=request.getParameter("lastName");
		user.setLastName(lastName);
		user.setEmail(request.getParameter("email"));
		user.setGender(request.getParameter("gender"));
		user.setCountry(request.getParameter("country"));
		boolean result=userBo.registerUser(user);
		RequestDispatcher dispatcher=null;
		if(result)
		{
			dispatcher=request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			request.setAttribute("errrorMsg" ,"Registration faile....Try again");
			dispatcher=request.getRequestDispatcher("Register.jsp");
			dispatcher.forward(request, response);
		}
	}

}








