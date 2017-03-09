package com.lql.spring.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter implements Filter {

    public LoginFilter() {
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request2 = (HttpServletRequest) request;
		HttpServletResponse response2 = (HttpServletResponse) response;
			HttpSession session = request2.getSession();
			String servletPath = request2.getServletPath();
			String contextPath = request2.getContextPath();
			if(servletPath.startsWith("/")&&
					!servletPath.equals("/views/login.jsp")&&
					!servletPath.equals("/views/loginValidate.action")){
				String userName = (String) session.getAttribute("userName");
				if("".equals(userName)|| userName==null){
					response2.sendRedirect(contextPath+"/views/login.jsp");
					return ;
				}
				
			}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
