package com.example.resortshib;

import com.DBResortControl;
import com.ResTableEntity;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "CreateServlet", value = "/CreateServlet")
public class CreateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name_field");
        String country = request.getParameter("country_field");
        String season = request.getParameter("season_field");
        Long price = Long.parseLong(request.getParameter("price_field"));

        ResTableEntity res = new ResTableEntity(name, country, season, price);
        DBResortControl dbResortControl = new DBResortControl();
        dbResortControl.createRes(res);
    }
}
