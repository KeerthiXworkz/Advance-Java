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
            background-color: #34495e;
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

    </header>

<div class="container">

<h1> Edit User Details  </h1>

    <form action="updateUser" method="post">

 <h2><style="display:none" ><input type="number" name="userId" value="${editUser.getUserId()}" style="display:none"></h2>

    <label for="firstName">FirstName:</label>
    <input type="text" name="firstName" value="${editUser.getFirstName() }" required>

    <label for="lastName">LastName:</label>
    <input type="text" name="lastName" value="${editUser.getLastName() }" required>

    <label for="email" >Email:</label>
    <input type="text" name="email" value="${editUser.getEmail() }" required>

    <label for="contactNumber">ContactNumber</label>
    <input type="number" name="contactNumber" value="${editUser.getContactNumber() }" required>

    <label for="alteredNumber">AlteredNumber</label>
    <input type="number" name="alternativeNumber" value="${editUser.getAlternativeNumber() }" required>

    <label for="foodType">FoodType</label>
     <select id="foodType" name="foodType" value="${editUser.getFoodType() }" required >
        <option value=="select food type">Select FoodType</option>
        <option value="vegetarian">Vegetarian</option>
        <option value="non-vegetarian">Non-Vegetarian</option>
        <option value="both">Both</option>

        </select>

    <label for="address" >Address</label>
    <input type="text" name="address" value="${editUser.getAddress() }" required>

    <label for="password">Password </label>
    <input type="text" name="password" value="${editUser.getPassword() }" required>

    <button type="submit" >Update</button>

        </form>
        </div>

        <footer>
            &copy; 2024 Xworkz. All rights reserved.
        </footer>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
    </html>

