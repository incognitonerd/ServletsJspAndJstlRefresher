package com.refresher.servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.text.WordUtils;
import com.refresher.doms.Activity;
import com.refresher.services.ActivitiesService;
import com.refresher.utils.Constants;

@WebServlet(urlPatterns = "/add-activity.do")
public class AddActivityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ActivitiesService activities = new ActivitiesService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		String newActivity = req.getParameter("activity");
		String season = req.getParameter("season");
		boolean isValid = false;
		if(newActivity != null && !newActivity.isEmpty()){
			if(newActivity.charAt(0) != ' ' && newActivity.charAt(newActivity.length() - 1) != ' '){
				isValid = true;
			}
		}
		if(isValid){
			activities.addActivity(new Activity(WordUtils.capitalize(newActivity), season));
			resp.sendRedirect(Constants.LIST_ACTIVITIES_PAGE.getStr());
		} else{
			req.getRequestDispatcher(Constants.ADD_ACTIVITY_JSP_PATH.getStr()).forward(req, resp);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		req.getRequestDispatcher(Constants.ADD_ACTIVITY_JSP_PATH.getStr()).forward(req, resp);
	}
}
