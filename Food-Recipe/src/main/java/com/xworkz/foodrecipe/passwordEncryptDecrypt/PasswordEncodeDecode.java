package com.xworkz.foodrecipe.passwordEncryptDecrypt;

import org.springframework.stereotype.Component;

import java.util.Base64;


@Component
public class PasswordEncodeDecode {


    public static  String encodePassword(String password){

        byte[] encodeBytes = Base64.getEncoder().encode(password.getBytes());
        return  new String(encodeBytes);
    }

    public static  String decodePassword(String password){

        byte[] decodeBytes= Base64.getDecoder().decode(password.getBytes());
        return new String(decodeBytes);
    }


//    public static void main(String[] args) {
//
//  String userEnteredPassword = "user123" ;
//
//        String  encodedPassword =encodePassword(userEnteredPassword);
//        System.out.println(" Encoded Password : " + encodedPassword);
//
//        String decodedPassword =decodePassword(encodedPassword);
//        System.out.println("Decoded password : " + decodedPassword );
//    }
}
