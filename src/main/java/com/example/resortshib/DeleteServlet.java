package com.example.resortshib;

import com.DBResortControl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "DeleteServlet", value = "/DeleteServlet")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DBResortControl dbResortControl = new DBResortControl();
        int id = Integer.parseInt(request.getParameter("delete_field"));

        dbResortControl.deleteResById(id);

//        request.getSession().setAttribute();
//        response.sendRedirect( request.getContextPath()+ "/deletePage.jsp");
    }
}
