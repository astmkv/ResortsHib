package com.example.resortshib;

import com.DBResortControl;
import com.ResTableEntity;
import com.service.Service;
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
        DBResortControl dbResortControl = new DBResortControl();

        String s1 = request.getParameter("req");


        if (s1.equals("all")) {
            List<ResTableEntity> resList = dbResortControl.getAllResorts();

            List<String> results = Service.convertToString(resList);
            request.getSession().setAttribute("resorts", results);
            response.sendRedirect(request.getContextPath() + "/readPage.jsp");

        } else if (s1.equals("search")) {
            int id = Integer.parseInt(request.getParameter("search_field"));
            ResTableEntity res = dbResortControl.getResById(id);
            String results = Service.getResort(res);

            request.getSession().setAttribute("resorts",results);
            response.sendRedirect(request.getContextPath() + "/readPage.jsp");
        }
    }
}