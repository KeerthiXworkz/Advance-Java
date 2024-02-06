<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign In Page</title>

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
            background-color: #f8f9fa;
            padding: 15px;
            border-radius: 8px;
        }

        form label {
            font-weight: bold;
        }

        form input {
            width: 100%;
            margin-bottom: 10px;
            padding: 8px;
            box-sizing: border-box;
        }

        form button {
            background-color: #3498db;
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

<h3> ${userLogin} </h3>

 <div class="container">

   <h2>Login</h2>
     <form id="loginForm" action="/login" method="post">
         <label for="username">Username:</label>
         <input type="text" id="username" name="username" required>
         <label for="password">Password:</label>
         <input type="password" id="password" name="password" required>
         <button type="submit">Login</button>
         <a href="/recover">Forgot Password?</a>
     </form>

     <!-- Include your JavaScript logic for handling unsuccessful login attempts -->
     <script>
         // Sample JavaScript for handling unsuccessful login attempts
         document.getElementById('loginForm').addEventListener('submit', function (event) {
             event.preventDefault();
             // Include your logic to check login credentials
             // If unsuccessful attempt, show the option to recover the account
             // Example: window.location.href = '/recover';
         });

         <!-- Add this script to your login page -->

     // Assume 'attempts' is the variable holding the number of unsuccessful attempts
     if (attempts >= 2) {
         document.getElementById('recoveryLink').style.display = 'block';
     }

     //  <!-- Add this link/button to redirect to the recovery page -->
       <a id="recoveryLink" href="/recover">Forgot Password? Recover your account.</a>

     </script>

</div>
    <footer>
        &copy; 2024 Xworkz. All rights reserved.
    </footer>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
