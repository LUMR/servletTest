package com.lumr.server;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by fsweb on 17-3-23.
 */
@WebFilter(filterName = "LoginFilter")
public class LoginFilter implements Filter {
    @Override
    public void destroy() {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("登录检查");
        if (req instanceof HttpServletRequest){
            HttpServletRequest hreq = (HttpServletRequest)req;
            if (hreq.getSession().getAttribute("user")==null){
                HttpServletResponse hresp = (HttpServletResponse)resp;
                hresp.sendRedirect("/index.jsp");
            }else{
                //调用下一个过滤器,若没过滤器就调用web资源
                chain.doFilter(req,resp);
            }
        }

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
}
