package com.lumr.server;

import javax.servlet.ServletException;
import javax.servlet.SessionTrackingMode;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by fsweb on 17-3-21.
 */
public class Login extends HttpServlet {
    String name;
    String password;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("getPost");
        name = req.getParameter("name");
        password = req.getParameter("password");
        if (name.equals("我的天")&&password.equals("abc")) {
            req.getSession().setAttribute("user","yes");
            resp.sendRedirect("mess.jsp");
        }
        else {
            System.out.println(name);
            System.out.println(password);
            req.setAttribute("password", password);
            req.setAttribute("name", name);
            req.getRequestDispatcher("false.jsp").forward(req, resp);
        }
    }

}
