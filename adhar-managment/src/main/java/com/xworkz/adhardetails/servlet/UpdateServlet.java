package com.xworkz.adhardetails.servlet;

import com.xworkz.adhardetails.dto.AdharaDetailsDto;
import com.xworkz.adhardetails.service.UserService;
import com.xworkz.adhardetails.service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/update")
public class UpdateServlet extends HttpServlet {

    UserService service = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

     int id = Integer.parseInt(req.getParameter("userId"));

        AdharaDetailsDto dto =service.validateAndGetUserById(id);

        req.setAttribute("adharInfo",dto);

        RequestDispatcher dispatcher=req.getRequestDispatcher("update.jsp");
        dispatcher.forward(req,resp);
    }
}
