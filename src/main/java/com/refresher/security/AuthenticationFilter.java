package com.refresher.security;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import com.refresher.utils.Constants;

@WebServlet(urlPatterns = "*.do")
public class AuthenticationFilter implements Filter {
	@Override
	public void destroy(){
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filter) throws IOException, ServletException{
		HttpServletRequest httpReq = (HttpServletRequest) req;
		System.out.println(httpReq.getRequestURI());
		if(httpReq.getSession().getAttribute("username") != null){
		//	System.out.println(httpReq.getSession().getAttribute("username"));
			System.out.println(httpReq.getRequestURI());
			filter.doFilter(req, resp);
		} else{
			httpReq.getRequestDispatcher(Constants.LOGIN_PAGE.getStr()).forward(req, resp);
		}
	}
	
	@Override
	public void init(FilterConfig filter) throws ServletException{
	}
}
