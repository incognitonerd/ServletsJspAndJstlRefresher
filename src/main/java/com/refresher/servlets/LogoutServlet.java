package com.refresher.servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.refresher.utils.Constants;

@WebServlet(urlPatterns = "/logout.do")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		req.getSession().invalidate();
		req.getRequestDispatcher(Constants.LOGIN_JSP_PATH.getStr()).forward(req, resp);
	}
}