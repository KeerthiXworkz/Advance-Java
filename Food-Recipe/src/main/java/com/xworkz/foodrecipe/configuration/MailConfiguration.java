package com.xworkz.foodrecipe.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class MailConfiguration {

    //swcq bzky sivj hnxi

    public JavaMailSenderImpl mailSender(){

        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        javaMailSender.setHost("smtp.gmail.com");
        javaMailSender.setPort(587);
        javaMailSender.setUsername("keerthikumar2108@gmail.com");
        javaMailSender.setPassword("swcq bzky sivj hnxi");

        Properties properties=javaMailSender.getJavaMailProperties();

        properties.put("mail.transport.protocol","smtp");
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        //properties.put("mail.debug","true");

        return javaMailSender;


    }

}

