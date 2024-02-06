<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>
    <link rel="icon" type="image/jpg" href="https://raw.githubusercontent.com/X-workzDev01/xworkzwebsite/master/src/main/webapp/assets/images/Logo.png">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        .background-container {
            background-image: url("https://images.squarespace-cdn.com/content/v1/5e6d506ac2dd7d466859bd3c/1584928815938-KJBDEFUZGOEO81G2IXRU/Recipes-Banner.jpg?format=1000w"); /* Set the path to your food recipe background image */
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            height: 100vh; /* 100% of the viewport height */
            display: flex;
            flex-direction: column;
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
        .content-container {
            flex: 1;
            /* Add any additional styles for your content container */
        }
    </style>
</head>

<body>

    <c:forEach items="${listError}" var="error">
        <h3> ${error.getDefaultMessage()} </h3>
    </c:forEach>

    <div class="background-container">
        <header>
            <div>
                <img src="https://raw.githubusercontent.com/X-workzDev01/xworkzwebsite/master/src/main/webapp/assets/images/Logo.png" width="120px" height="60px">
            </div>
            <div>
                <a href="sign-up.jsp">Sign Up</a>
                <a href="sign-in.jsp">Sign In</a>
            </div>
        </header>

        <div class="content-container">
            <!-- Your page content goes here -->
        </div>

        <footer>
            &copy; 2024 Xworkz. All rights reserved.
        </footer>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>
