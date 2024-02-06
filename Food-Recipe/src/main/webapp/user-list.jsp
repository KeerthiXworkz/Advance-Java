<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Details</title>
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
                   background-color: #31363a;
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

        table, th, td {
            border: 2px solid black;
            border-collapse: collapse;
            margin-left: auto;
            margin-right: auto;
            margin-top: 4%;
        }

        th {
            background-color: rgb(122, 237, 237);
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

<h2>${updateMessage}</h2>
<h2>${deleteMessage}</h2>

<body>

    <header>
        <div>
             <img src="https://raw.githubusercontent.com/X-workzDev01/xworkzwebsite/master/src/main/webapp/assets/images/Logo.png" width="120px" height="60px">
              <a href="user-profile.jsp" style="color: #007bff;">Home</a>
        </div>
        <div class="dropdown">
            <button>
                <svg xmlns="http://www.w3.org/2000/svg" width="18" height="18" fill="currentColor" class="bi bi-person-circle" viewBox="0 0 16 16">
                    <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0"/>
                    <path fill-rule="evenodd" d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8m8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1"/>
                </svg>
               <span style="color: #fff;">${ userProfile.getFirstName() }</span>
            </button>
            <div class="dropdown-content">

                <a href="getUser?userId=${ userProfile.getUserId() }" style="color: #007bff;">Edit</a>
                 <a href="delete?userId=${ userProfile.getUserId() }" style="color: #dc3545;">Delete</a>
                 <a href="index.jsp" style="color: #28a745;">Logout</a>
            </div>
        </div>
    </header>

    <table>
        <tr>
            <th>Sl no</th>
            <th>FirstName</th>
            <th>LastName</th>
            <th>Email</th>
            <th>ContactNumber</th>
            <th>AlternativeNumber</th>
            <th>FoodType</th>
            <th>Address</th>
            <th>Password</th>

        </tr>
        <tr>
            <td>${ userProfile.getUserId() }</td>
            <td>${ userProfile.getFirstName() }</td>
            <td>${ userProfile.getLastName() }</td>
            <td>${ userProfile.getEmail() }</td>
            <td>${ userProfile.getContactNumber() }</td>
            <td>${ userProfile.getAlternativeNumber() }</td>
            <td>${userProfile.getFoodType()}</td>
            <td>${ userProfile.getAddress() }</td>
            <td>${ userProfile.getPassword() }</td>
        </tr>
    </table>

    <footer>
        &copy; 2024 Xworkz. All rights reserved.
    </footer>

</body>
</html>
