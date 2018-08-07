package lti.hola.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lti.hola.bean.RegisterBean;


public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String referer = request.getHeader("referer");
		if (referer.contains("home.jsp")) {
			// Request from home for login auth
			RegisterBean user =LoginController.authenticate(request);
			if(user!=null) {
				//login successful
				response.sendRedirect("profile.jsp");
			}
			else {
				//login failed
				response.sendRedirect("home.jsp");
			}
		} else if (referer.contains("register.jsp")) {
			// Req for user registration
			if(RegisterController.registration(request))
				response.sendRedirect("home.jsp");
			else
				response.sendRedirect("register.jsp");
			
		} else if (referer.contains("forget.jsp")) {
			// validating user for pass change
			if(LoginController.forgetPassword(request))
				response.sendRedirect("changepassword.jsp");
			else
				response.sendRedirect("forget.jsp");
			
		} else {
			// req for updating password
			if(LoginController.changePassword(request))
				response.sendRedirect("home.jsp");
			else
				response.sendRedirect("changepassword.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Delegating call to doGet method to perform common logic
		doGet(request, response); // method chaining
	}

}
