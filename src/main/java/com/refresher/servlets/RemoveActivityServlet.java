package com.refresher.servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.refresher.models.Activity;
import com.refresher.services.ActivitiesService;
import com.refresher.utils.Constants;

@WebServlet(urlPatterns = "/remove-activity.do")
public class RemoveActivityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ActivitiesService activities = new ActivitiesService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		String activity = req.getParameter("activity");
		activities.removeActivity(new Activity(activity));
		resp.sendRedirect(Constants.LIST_ACTIVITIES_PAGE.getStr());
	}
}
