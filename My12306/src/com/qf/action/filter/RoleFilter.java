package com.qf.action.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import com.qf.dao.pojo.TUser;

@WebFilter("/userjsp/admin/*")
public class RoleFilter implements Filter {
 
	@Override
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		TUser user = (TUser) req.getSession().getAttribute("TUser");
		if (user != null && user.getUrole().equals("admin")) {
			chain.doFilter(req, response);
		} else {
			req.setAttribute("error_msg", "权限不够");
			req.getRequestDispatcher("/userjsp/homepage.jsp").forward(req, response);
		}
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		
	}

}
