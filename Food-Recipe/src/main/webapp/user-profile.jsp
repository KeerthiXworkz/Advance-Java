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

        /* Added styles for dropdown */
                       .dropdown {
                           position: relative;
                           display: inline-block;
                       }

                       .dropdown-content {
                           display: none;
                           position: absolute;
                           background-color: #d3d4d6; /* Light gray background */
                           min-width: 160px;
                           box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
                           z-index: 1;
                           border-radius: 4px; /* Rounded corners */
                           padding: 8px 0; /* Add some padding */
                       }

                       .dropdown-content a {
                           color:#d3d4d6; /* white text color */
                           padding: 12px 16px;
                           text-decoration: none;
                           display: block;
                           transition: background-color 0.3s; /* Smooth background color transition */
                       }

                       .dropdown-content a:hover {
                           background-color: #dee2e6; /* Light gray background on hover */
                       }

                       .dropdown:hover .dropdown-content {
                           display: block;
                       }

                       .dropdown button {
                           background-color: transparent;
                           border: none;
                           cursor: pointer;
                           display: flex;
                           align-items: center; /* Align icon and text vertically */
                           fill: #fff; /* Set the icon color to white */
                       }

                       .dropdown button svg {
                           margin-right: 5px; /* Add some margin between icon and text */
                           fill: #fff; /* white  icon color */
                       }
    </style>
</head>

<body>

<c:forEach items="${listOfError}" var="error">
        <h3> ${error.getDefaultMessage()} </h3>
    </c:forEach>

    <div class="background-container">
        <header>

            <div>
                <img src="https://raw.githubusercontent.com/X-workzDev01/xworkzwebsite/master/src/main/webapp/assets/images/Logo.png" width="120px" height="60px">

                    <a href="index.jsp" style="color: #007bff;">Home</a>
                   <a href="getUserDetails?userId=${ userId.getUserId() }" style="color: #007bff;">MyProfile</a>
                    <a href="add-recipe.jsp" style="color: #007bff;">AddRecipe</a>
                    <a href="myRecipe"  style="color: #007bff;">MyRecipes</a>
                </div>

             <div class="dropdown">
                        <button>
                            <svg xmlns="http://www.w3.org/2000/svg" width="18" height="18" fill="currentColor" class="bi bi-person-circle" viewBox="0 0 16 16">
                                <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0"/>
                                <path fill-rule="evenodd" d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8m8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1"/>
                            </svg>
                           <span style="color: #fff;">${ userId.getFirstName() }</span>
                        </button>
                        <div class="dropdown-content">

                             <a href="index.jsp" style="color: #28a745;">Logout</a>
                        </div>
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
