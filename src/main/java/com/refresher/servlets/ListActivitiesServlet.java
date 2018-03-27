package com.refresher.servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.refresher.services.ActivitiesService;
/*
 * Browser sends Http Request to Web Server Code in Web Server => Input:HttpRequest, Output: HttpResponse.
 */
// Servlet is a Java class used to extend the capabilities of servers that host applications accessed by means of a request-response programming model.
import com.refresher.utils.Constants;

@WebServlet(urlPatterns = "/list-activities.do")
public class ListActivitiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ActivitiesService activities = new ActivitiesService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		req.setAttribute("activities", activities.getActivities());
		req.getRequestDispatcher(Constants.ACTIVITIES_JSP_PATH.getStr()).forward(req, resp);
	}
}