package com.example.resortshib;

import com.DBResortControl;
import com.ResTableEntity;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ReadServlet", value = "/ReadServlet")
public class ReadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        DBResortControl dbResortControl = new DBResortControl();
//
//        String s1 = request.getParameter("req");
//        String s2 = request.getParameter("search");
//        String searchField = request.getParameter("search_field");
//
//        if(s1.equals("all")){
//            List<ResTableEntity> resList = dbResortControl.getAllResorts();
//            request.getSession().setAttribute("resorts",resList);
//            response.sendRedirect( request.getContextPath()+ "/readPage.jsp");
//        } else if(s1.equals("search")){
//            ResTableEntity resList = dbResortControl.getResByParam(s2,searchField);
//            request.getSession().setAttribute("resorts",resList);
//            response.sendRedirect( request.getContextPath()+ "/readPage.jsp");
//        }
    }
}
