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
import java.util.List;

@WebServlet(urlPatterns ="/getAllUsers")
public class AllUsersServlet extends HttpServlet {

    UserService service = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       List<AdharaDetailsDto>  list =service.validateAndGetAllUsers();
        System.out.println(list);

        req.setAttribute("users",list);

        RequestDispatcher dispatcher = req.getRequestDispatcher("adharlist.jsp");
        dispatcher.forward(req,resp);
    }
}
