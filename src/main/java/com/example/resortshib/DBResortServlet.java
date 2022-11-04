package com.example.resortshib;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "DBResortServlet", value = "/DBResortServlet")
public class DBResortServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String s = request.getParameter("req");
        if (s.equals("create")) {
            response.sendRedirect(request.getContextPath() + "/createPage.jsp");
        } else if (s.equals("read")) {
            response.sendRedirect(request.getContextPath() + "/readPage.jsp");
        } else if (s.equals("update")) {
            response.sendRedirect(request.getContextPath() + "/updatePage.jsp");
        } else {
            response.sendRedirect(request.getContextPath() + "/deletePage.jsp");
        }
    }
}

