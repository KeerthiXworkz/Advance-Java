<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Recipe Details</title>
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

     .search-bar {
                 display: flex;
                 align-items: center;
             }

             #searchInput {
                 margin-right: 10px;
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
            margin: 10px auto;
            max-width: 1500px; /* Adjust the max-width based on your preference */
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px auto; /* Center the table horizontally */
        }

        th, td {
            border: 2px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        th {

            background-color: #74a3d6;
        }
        td{
            background-color:  rgb(179, 246, 224);
        }


    </style>
</head>

<!-- <h2>${updateMessage}</h2>
<h2>${deleteMessage}</h2> -->


<body>

   <body>
       <div class="background-container">
           <header>
               <div>
                   <img src="https://raw.githubusercontent.com/X-workzDev01/xworkzwebsite/master/src/main/webapp/assets/images/Logo.png" width="120px" height="60px">

                   <a href="index.jsp" style="color: #007bff;">Home</a>
           </div>
           <div class="search-bar">
               <input type="text" class="form-control" id="searchInput" placeholder="Search Recipe">
               <button class="btn btn-primary" onclick="searchRecipe()">Search</button>
           </div>
           <div>
               <a href="getUserById?userId=${ userName.getUserId() }" style="color: #007bff;">Profile</a>
               <span style="color: #fff;">${ userName.getFirstName() }</span>
           </div>
       </header>


    <div class="container">

        <div class="table-responsive">
            <table>
                <thead>
                    <tr>
                        <th>Recipe ID</th>
                        <th>Recipe Name</th>
                        <th>Recipe Type</th>
                        <th>Quantity</th>
                        <th>Main Ingredient1</th>
                        <th>Ingredient Quantity1</th>
                        <th>Main Ingredient2</th>
                        <th>Ingredient Quantity2</th>
                        <th>Main Ingredient3</th>
                        <th>Ingredient Quantity3</th>
                        <th>Main Ingredient4</th>
                        <th>Ingredient Quantity4</th>
                        <th>Main Ingredient5</th>
                        <th>Ingredient Quantity5</th>
                        <th>Publish Recipe</th>


                        <!-- Add similar headers for other ingredients -->
                    </tr>
                </thead>
                <tbody>
                    <!-- Assuming you have a list of RecipeDto objects called 'recipeList' -->

                    <c:forEach var="recipe" items="${recipeList}">
                        <tr>
                            <td>${recipe.recipeId}</td>
                            <td>${recipe.recipeName}</td>
                            <td>${recipe.recipeType}</td>
                            <td>${recipe.quantity}</td>
                            <td>${recipe.mainIngredient1}</td>
                            <td>${recipe.ingredientQuantity1}</td>
                            <td>${recipe.mainIngredient2}</td>
                             <td>${recipe.ingredientQuantity2}</td>
                            <td>${recipe.mainIngredient3}</td>
                             <td>${recipe.ingredientQuantity3}</td>
                            <td>${recipe.mainIngredient4}</td>
                             <td>${recipe.ingredientQuantity4}</td>
                            <td>${recipe.mainIngredient5}</td>
                             <td>${recipe.ingredientQuantity5}</td>
                             <td>${recipe.publishRecipe}</td>



                            <!-- Add similar cells for other ingredients -->
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

<script>

 $(document).ready(function () {
        // Fetch recipe details from the backend when the page loads
        $.ajax({
            type: 'GET',
            url: '/api/recipes/all', // Endpoint to get all recipes
            success: function (recipes) {
                // Handle the success response, update the UI with the recipe details
                updateRecipeDashboard(recipes);
            },
            error: function (error) {
                // Handle the error
                console.error('Error:', error);
            }
        });

</script>
    <footer>
        &copy; 2024 Xworkz. All rights reserved.
    </footer>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
