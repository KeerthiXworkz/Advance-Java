package com.xworkz.metroapp.controller;

import com.xworkz.metroapp.dto.TicketBookingDto;
import com.xworkz.metroapp.dto.UserDto;
import com.xworkz.metroapp.service.MetroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/")
public class MetroController  {

    @Autowired
    public MetroService service;

    @PostMapping("register")
    public String save(@ModelAttribute UserDto userDto , Model model){

        service.validateAndSaveUser(userDto);
        model.addAttribute("success","registered successfully");
        return "index";
    }

    @PostMapping("metroBookingForm")
    public String saveBooking(@ModelAttribute TicketBookingDto dto ,Model model){

        if (dto!=null){
            service.validateAndSaveBooking(dto);
            model.addAttribute("success" ,"registered successfully");
            return "index";
        }
        return "error";
    }

    @GetMapping("getAllUser")
    public String getAllUsers(Model model){

        List<UserDto> list = service.validateAndGetAllUsers();
        if (!list.isEmpty()){
            model.addAttribute("users",list);
            System.out.println(list);
            return "user-list";
        }
        return "error";
    }

    @GetMapping("search")
    public String getUser(@RequestParam("userName") String userName,@RequestParam("email") String email ,@RequestParam("phone") long phone , Model model){

        if (!userName.isEmpty() || !email.isEmpty() || phone!=0){
            List<UserDto> list=service.getUser(userName,email,phone);
            model.addAttribute("users" ,list);
            System.out.println(list);
            return "user-list";
        }
        return "error";
    }
}
