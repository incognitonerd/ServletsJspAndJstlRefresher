package com.refresher.servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.text.WordUtils;
import com.refresher.models.Activity;
import com.refresher.services.ActivitiesService;
import com.refresher.utils.Constants;

@WebServlet(urlPatterns = "/add-activity.do")
public class AddActivityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ActivitiesService activities = new ActivitiesService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		String newActivity = req.getParameter("activity");
		if(newActivity != null && !newActivity.isEmpty()){
			char fLetter = newActivity.charAt(0);
			char lLetter = newActivity.charAt(newActivity.length() - 1);
			if(fLetter != ' ' && lLetter != ' ')
				activities.addActivity(new Activity(WordUtils.capitalize(newActivity)));
		}
		resp.sendRedirect(Constants.LIST_ACTIVITIES_PAGE.getStr());
	}
}
