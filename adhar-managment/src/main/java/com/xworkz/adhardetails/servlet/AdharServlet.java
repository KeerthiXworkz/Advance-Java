package com.xworkz.adhardetails.servlet;

import com.xworkz.adhardetails.dto.AdharaDetailsDto;
import com.xworkz.adhardetails.service.UserService;
import com.xworkz.adhardetails.service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(urlPatterns = "/register")
public class AdharServlet extends HttpServlet {

    public AdharServlet(){
        System.out.println("default constructor");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("initialization called");
    }

    UserService service = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

     String name=req.getParameter("name");
     String adharNumber=req.getParameter("adharnumber");
     String age=req.getParameter("age");
     String phNo=req.getParameter("contact");
     String address=req.getParameter("address");
     String dob=req.getParameter("dateOfBirth");

        System.out.println(name);
        System.out.println(adharNumber);
        System.out.println(age);
        System.out.println(phNo);
        System.out.println(address);
        System.out.println(dob);

        AdharaDetailsDto dto = new AdharaDetailsDto();
        dto.setName(name);
        dto.setAdharaNumber(Long.parseLong(adharNumber));
        dto.setAge(Integer.parseInt(age));
        dto.setPhNo(Long.parseLong(phNo));
        dto.setAddress(address);
        dto.setDob(dob);

        service.validateAndSave(dto);

        req.setAttribute("register","registered successfully");
        RequestDispatcher dispatcher= req.getRequestDispatcher("register.jsp");
        dispatcher.forward(req,resp);

    }
}
