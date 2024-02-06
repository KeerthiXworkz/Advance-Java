package com.xworkz.foodrecipe.mail;

import com.xworkz.foodrecipe.configuration.MailConfiguration;
import com.xworkz.foodrecipe.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
public class Mail {

//Emailable
//Ajax call  -without refreshing the page it will check
// ways to call ajax -create instance of xml http request,fetch,
    @Autowired
   private  MailConfiguration mailConfiguration;
    public void sendMail(UserDto dto) {

        SimpleMailMessage message =new SimpleMailMessage();
        message.setTo(dto.getEmail());
        message.setSubject("Welcome to Food Recipe");
        message.setText("User Name" + dto.getFirstName() +"Thank you for joining Food Recipe");
        mailConfiguration.mailSender().send(message);

    }
}
