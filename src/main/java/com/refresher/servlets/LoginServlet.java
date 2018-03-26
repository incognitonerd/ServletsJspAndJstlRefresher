package com.refresher.servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.text.WordUtils;
import com.refresher.services.ValidateUserService;
/*
 * Browser sends Http Request to Web Server Code in Web Server => Input:HttpRequest, Output: HttpResponse.
 */
// Servlet is a Java class used to extend the capabilities of servers that host applications accessed by means of a request-response programming model.
import com.refresher.utils.Constants;

// 1. extends javax.servlet.http.HttpServlet
// 2. @WebServlet(urlPatterns = "/login.do")
// 3. doGet(HttpServletRequest request, HttpServletResponse response)
// 4. How is the response created?
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ValidateUserService vus = new ValidateUserService();
	
	// http://localhost:8080/login.do?island=aruba&city=oranjestad&food=fish
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		String island = req.getParameter("island");
		String city = req.getParameter("city");
		String food = req.getParameter("food");
		req.setAttribute("island", WordUtils.capitalize(island));
		req.setAttribute("city", WordUtils.capitalize(city));
		req.setAttribute("food", food);
		req.getRequestDispatcher(Constants.LOGIN_JSP_PATH.getStr()).forward(req, resp);
	}
	
	// http://localhost:8080/login.do?island=aruba&city=oranjestad&food=fish
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		String sport = req.getParameter("sport");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if(vus.isValidUser(username, password)){
			req.setAttribute("username", username);
			req.setAttribute("password", password);
			req.setAttribute("sport", WordUtils.capitalize(sport));
			req.getRequestDispatcher(Constants.HOME_JSP_PATH.getStr()).forward(req, resp);
		} else{
			req.setAttribute("errMsg", Constants.INVALID_USER.getStr());
			req.getRequestDispatcher(Constants.LOGIN_JSP_PATH.getStr()).forward(req, resp);
		}
	}
}