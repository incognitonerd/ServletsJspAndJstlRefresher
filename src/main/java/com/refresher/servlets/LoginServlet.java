package com.refresher.servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.text.WordUtils;
import com.refresher.services.ValidateUserService;
import com.refresher.utils.Constants;

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
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if(vus.isValidUser(username, password)){
			req.getSession().setAttribute("username", username);
			resp.sendRedirect(Constants.LIST_ACTIVITIES_PAGE.getStr());
		} else{
			req.setAttribute("errMsg", Constants.INVALID_USER.getStr());
			req.getRequestDispatcher(Constants.LOGIN_JSP_PATH.getStr()).forward(req, resp);
		}
	}
}