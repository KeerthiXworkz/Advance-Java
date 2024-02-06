<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up Page</title>
    <link rel="icon" type="image/jpg" href="https://raw.githubusercontent.com/X-workzDev01/xworkzwebsite/master/src/main/webapp/assets/images/Logo.png">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">


    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

       header {
                  background-color: #2e363c;
                  color: #fff;
                  padding: 20px;
                  display: flex;
                  justify-content: space-between;
                  align-items: center;

              }

        header a {
            color: #fff;
            text-decoration: none;
            margin: 0 10px;
        }

        header img {
            height: 40px;
        }

        footer {
                    background-color: #31363a;
                    color: #fff;
                     text-align: center;
                                padding: 10px;
                                position: fixed;
                                bottom: 0;
                                width: 100%;
                }

        .container {
            margin: 50px auto;
            max-width: 600px;
        }

        form {
            background-color: #f8f9fa; /* Form background color */
            padding: 15px;
            border-radius: 8px;
        }

        form label {
            font-weight: bold;
        }

        form input, form select {
            width: 100%;
            margin-bottom: 10px;
            padding: 8px;
            box-sizing: border-box;
        }

        form button {
            background-color: #3498db; /* Button color */
            color: #fff;
            padding: 10px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
    </style>
</head>
<body>

    <header>
        <div>
            <img src="https://raw.githubusercontent.com/X-workzDev01/xworkzwebsite/master/src/main/webapp/assets/images/Logo.png" width="120px" height="60px" >

        </div>
        <div>
            <a href="sign-up.jsp">Sign Up</a>
            <a href="sign-in.jsp">Sign In</a>
        </div>
    </header>
<div class="container">
<h1> Sign Up  </h1>
        <form action="register" method="post">

            <label for="firstName">First Name:</label>
            <input type="text" id="firstName" name="firstName"  onblur="validateFirstName()" required>
            <span id="firstName-error"></span>
            <br>

            <label for="lastName">Last Name:</label>
            <input type="text" id="lastName" name="lastName" onblur="validateLastName()" required>
            <span id="lastName-error"></span>
             <br>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" onblur="validateEmail()"  required>
             <span id="email-error"></span>
                         <br>

            <label for="contactNumber">Contact Number:</label>
            <input type="tel" id="contactNumber" name="contactNumber" onblur="validateContactNumber()" required>
             <span id="contact-error"></span>
                         <br>

            <label for="alternativeNumber">Alternate Number:</label>
            <input type="tel" id="alternativeNumber" name="alternativeNumber" onblur="validateAlternativeNumber()" required>
             <span id="alt-contact-error"></span>
                         <br>

            <label for="foodType">Food Type:</label>
            <select id="foodType" name="foodType"  required>
                <option value=="select food type">Select FoodType</option>
                <option value="vegetarian">Vegetarian</option>
                <option value="non-vegetarian">Non-Vegetarian</option>
                <option value="both">Both</option>

            </select>

            <label for="address">Address:</label>
            <input type="text" id="address" name="address" onblur="validateAddress()" required>
             <span id="address-error"></span>
              <br>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" onblur="validatePassword()" required>
             <span id="password-error"></span>
               <br>

            <button type="submit">Sign Up</button>
        </form>
    </div>

    <footer>
        &copy; 2024 Xworkz. All rights reserved.
    </footer>


     <script>
     function validateFirstName() {
               let nameEle = document.getElementById("firstName");
               let name = nameEle.value.trim();
               let nameErr = document.getElementById("firstName-error");
               let isNameValid = false;
               const nameRegex = /^[a-zA-Z]+( [a-zA-Z]*)*$/;
               if (name === " " || name.length < 4) {
                 nameErr.innerHTML = "Must be at least 4 characters";
                 nameEle.style.border = "2px solid red";
                 nameErr.style.display = "inline";
                 isNameValid = false;
               } else if (name === " " || name.length > 15){
                 nameErr.innerHTML = "Max 15 characters";
                 nameEle.style.border = "2px solid red";
                 nameErr.style.display = "inline";
                 isNameValid = false;
               }
               else if (!nameRegex.test(name)) {
                 nameErr.innerHTML = "Must contain only alphabets";
                 nameEle.style.border = "2px solid red";
                 nameErr.style.display = "inline";
                 isNameValid = false;
               } else {
                 nameErr.style.display = "none";
                 nameEle.style.border = "2px solid green";
                 isNameValid = true;
               }
               return isNameValid;
             }

             function validateLastName() {
               let nameEle = document.getElementById("lastName");
               let name = nameEle.value.trim();
               let nameErr = document.getElementById("lastName-error");
               let isNameValid = false;
               const nameRegex = /^[a-zA-Z]+( [a-zA-Z]*)*$/;
               if (name === " " || name.length < 1) {
                 nameErr.innerHTML = "Must be at least 1 character";
                 nameEle.style.border = "2px solid red";
                 nameErr.style.display = "inline";
                 isNameValid = false;
               } else if (name === " " || name.length > 15){
                 nameErr.innerHTML = "Max 15 characters";
                 nameEle.style.border = "2px solid red";
                 nameErr.style.display = "inline";
                 isNameValid = false;
               }
               else if (!nameRegex.test(name)) {
                 nameErr.innerHTML = "Must contain only alphabets";
                 nameEle.style.border = "2px solid red";
                 nameErr.style.display = "inline";
                 isNameValid = false;
               } else {
                 nameErr.style.display = "none";
                 nameEle.style.border = "2px solid green";
                 isNameValid = true;
               }
               return isNameValid;
             }



             function validateEmail() {
               let emailEle = document.getElementById("email");
               let email = emailEle.value.trim();
               let emailErr = document.getElementById("email-error");
               let isEmailValid = false;
               const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
               if (email === " " || email.length < 1) {
                 emailErr.innerHTML = "Email cannot be empty";
                 emailEle.style.border = "2px solid red";
                 emailErr.style.display = "inline";
                 isEmailValid = false;
               } else if (!emailRegex.test(email)) {
                 emailErr.innerHTML = "Must be abc@example.com format";
                 emailEle.style.border = "2px solid red";
                 emailErr.style.display = "inline";
                 isEmailValid = false;
               } else {
                 emailErr.style.display = "none";
                 emailEle.style.border = "2px solid green";
                 isEmailValid = true;
               }
               if(isEmailValid){
               if(checkEmail()){
                emailErr.innerHTML="email is already exist";
                 emailEle.style.border = "2px solid red";
                 emailErr.style.display = "inline";
                  isEmailValid = false;
               }
               else{
               emailErr.innerHTML="email is valid";
                emailEle.style.border = "2px solid green";
                emailErr.style.display = "inline";
                isEmailValid = true;
                 }
               }
               return isEmailValid;
             }

             function validateContactNumber() {
               let contactNumberEle = document.getElementById("contactNumber");
               let contactNumber = contactEle.value.trim();
               let contactNumberErr = document.getElementById("contact-error");
               let isContactNumberValid = false;
               const contactNumberRegex = /^\d{10}$/;
               if (contactNumber === " ") {
                 contactNumberErr.innerHTML = "Contact Number cannot be empty";
                 contactNumberEle.style.border = "2px solid red";
                 contactNumberErr.style.display = "inline";
                 isContactNumberValid = false;
               } else if (!contactNumberRegex.test(contact)) {
                 contactNumberErr.innerHTML = "Should contaion only 10 digits";
                 contactNumberEle.style.border = "2px solid red";
                 contactNumberErr.style.display = "inline";
                 isContactNumberValid = false;
               } else {
                 contactNumberErr.style.display = "none";
                 contactNumberEle.style.border = "2px solid green";
                 isContactNumberValid = true;
               }
               return isContactNumberValid;
             }

             function validateAlternativeNumber() {
               let contactEle = document.getElementById("alternativeNumber");
               let contact = contactEle.value.trim();
               let contactErr = document.getElementById("alt-contact-error");
               let isAlternativeNumberValid = false;
               const contactRegex = /^\d{10}$/;
               if (contact === " ") {
                 contactErr.innerHTML = "Contact Number cannot be empty";
                 contactEle.style.border = "2px solid red";
                 contactErr.style.display = "inline";
                 isAlternativeNumberValid = false;
               } else if (!contactRegex.test(contact)) {
                 contactErr.innerHTML = "Should contaion only 10 digits";
                 contactEle.style.border = "2px solid red";
                 contactErr.style.display = "inline";
                 isAlternativeNumberValid = false;
               } else {
                 contactErr.style.display = "none";
                 contactEle.style.border = "2px solid green";
                 isAlternativeNumberValid = true;
               }
               return isAlternativeNumberValid;
             }

             function validatePassword() {
               var password = document.getElementById('password');
               var passwordError = document.getElementById('password-error');
               if (password.value.length < 7) {
                 passwordError.innerHTML = "Please provide a valid password";
                 password.style.border = "2px solid red";
                 passwordError.style.display = 'inline';
                 return false;
               } else {
                 password.style.border = "2px solid green";
                 passwordError.style.display = 'none';
                 return true;
               }
             }

             function validateAddress() {
               var address = document.getElementById('address');
               var addressError = document.getElementById('address-error');
               if (address.value.trim() === '' || address.value.trim().length<5) {
                 addressError.innerHTML = "Address cannot be empty";
                 addressError.style.display = 'inline';
                 address.style.border = "2px solid red";
                 return false;
               } else if(address.value.trim().length<5){
                 addressError.innerHTML = "Address must contain atleast 5 characters";
                 addressError.style.display = 'inline';
                 address.style.border = "2px solid red";
                 return false;
               }else if(address.value.trim().length>100){
                 addressError.innerHTML = "Max characters allowed for address : 100";
                 addressError.style.display = 'inline';
                 address.style.border = "2px solid red";
                 return false;
               }else {
                 addressError.style.display = 'none';
                 address.style.border = "2px solid green";
                 return true;
               }
             }

             function validateForm() {
               if (validateFName() && validateLName() && validateEmail() && validateContactNo() && validateAlternativeContactNo() && validateAddress() && validatePassword()) {
                 return true;
               }
               else {
                 return false;
               }
             }
             function checkEmail() {
               let email = document.getElementById("email").value;
               let ajaxRequest = new XMLHttpRequest();

               ajaxRequest.open(
                 "GET",
                 "http://localhost:8080/Food-Recipe/rest/checkEmail?userEmail=" + email,
                 false
               );
               ajaxRequest.send();
               let ajaxResponse = ajaxRequest.responseText;
               console.log(ajaxResponse);

               if (ajaxResponse === "true") {

                 return true;
               } else {
                 return false;
             }
             }
             </script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
