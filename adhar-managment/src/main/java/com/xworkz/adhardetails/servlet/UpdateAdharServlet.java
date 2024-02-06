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

@WebServlet(urlPatterns = "/updateUser")
public class UpdateAdharServlet extends HttpServlet {


    UserService service=new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int userId = Integer.parseInt(req.getParameter("id"));

        AdharaDetailsDto dto = new AdharaDetailsDto();
        dto.setName(req.getParameter("name"));
        dto.setAdharaNumber(Long.parseLong(req.getParameter("adharnumber")));
        dto.setPhNo(Long.parseLong(req.getParameter("contact")));
        dto.setAge(Integer.parseInt(req.getParameter("age")));
        dto.setAddress(req.getParameter("address"));
        dto.setDob(req.getParameter("dateOfBirth"));

        if (service.validateAndUpdateAdharById(userId,dto)){
            req.setAttribute("updateMessage","updated successfully");
            resp.sendRedirect("getAllUsers");
        }
        else {
            req.setAttribute("updateMessage","updated unsuccessfully");
            resp.sendRedirect("getAllUsers");
        }
    }
}
