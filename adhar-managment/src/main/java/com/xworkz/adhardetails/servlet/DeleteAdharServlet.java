package com.xworkz.adhardetails.servlet;
import com.xworkz.adhardetails.service.UserService;
import com.xworkz.adhardetails.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete")
public class DeleteAdharServlet extends HttpServlet {

    UserService service=new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("userId"));

        boolean isDeleted = service.validateAndDeleteAdharById(id);
        if (isDeleted == true){

            req.setAttribute("deleteMessage","deleted successfully");
            resp.sendRedirect("getAllUsers");
        }
        else {
            req.setAttribute("deleteMessage","deleted unsuccessfully");
            resp.sendRedirect("getAllUsers");
        }

    }
}
