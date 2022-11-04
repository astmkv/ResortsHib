package com.example.resortshib;

import com.DBResortControl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "UpdateServlet", value = "/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id_field"));
        List<String> newParams = new ArrayList<>();
        newParams.add(request.getParameter("name_field"));
        newParams.add(request.getParameter("country_field"));
        newParams.add(request.getParameter("season_field"));
        newParams.add(request.getParameter("price_field"));
        DBResortControl dbResortControl = new DBResortControl();
        dbResortControl.updateRes(id,newParams);
        response.sendRedirect(request.getContextPath() + "/index.jsp");
    }
}
