<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Food Recipe</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            background-color: #12b770a6; /* green gray background */
        }
        header {
                          background-color: #2e363c;
                          color: #fff;
                          padding: 15px;
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

        .form-container {
                   max-width: 800px;
                   margin: auto;
                   background-color: #ffffff; /* White background for the form */
                   padding: 50px;
                   border-radius: 20px;
                   box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                   margin-top: 30px;
               }

               .form-group label {
                   font-weight: bold;
               }

               .ingredient-container {
                   display: flex;
                   gap: 5px;
                   align-items: baseline;
               }

               .ingredient-quantity-container {
                    display: flex;
                    gap: 10px;
                    align-items: baseline;
                }

        .remove-ingredient {
            cursor: pointer;
            color: #dc3545; /* Red color for remove link */
        }

        .remove-ingredient:hover {
            text-decoration: underline;
        }

        button[type="submit"] {
            background-color: #007bff; /* Blue color for the submit button */
            color: #fff;
            border: none;
        }

        button[type="submit"]:hover {
            background-color: #0056b3; /* Darker blue color on hover */
        }

        button[type="button"] {
            background-color: #6c757d; /* Gray color for the "Add Ingredient" button */
        s    color: #fff;
            border: none;
        }
        button[type="button"] {
                    background-color: #6c757d; /* Gray color for the "Add Ingredient Quantity" button */
                    color: #fff;
                    border: none;
                }

        button[type="button"]:hover {
            background-color: #495057; /* Darker gray color on hover */
        }
    </style>
</head>

         <div class="background-container">
                <header>

                    <div>
                        <img src="https://raw.githubusercontent.com/X-workzDev01/xworkzwebsite/master/src/main/webapp/assets/images/Logo.png" width="120px" height="60px">

                            <a href="user-profile.jsp" style="color: #007bff;">Home</a>
                           <a href="user-list.jsp" style="color: #007bff;">MyProfile</a>
                            <a href="add-recipe.jsp" style="color: #007bff;">AddRecipe</a>
                            <a href="myRecipe"  style="color: #007bff;">MyRecipes</a>
                        </div>

                     <div class="dropdown">
                                <button>
                                    <svg xmlns="http://www.w3.org/2000/svg" width="18" height="18" fill="currentColor" class="bi bi-person-circle" viewBox="0 0 16 16">
                                     <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0"/>
                                    <path fill-rule="evenodd" d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8m8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1"/>
                                    </svg>
                                   <span style="color: #fff;">${ addRecipe.getFirstName() }</span>
                                </button>
                                <div class="dropdown-content">

                                     <a href="index.jsp" style="color: #28a745;">Logout</a>
                                </div>
                            </div>

                </header>
                </div>

<body>
    <div class="form-container">
        <h2 class="mb-4">Add Food Recipe</h2>
        <form action="recipeForm" method="post">

            <div class="form-group">
                <label for="recipeName">Recipe Name:</label>
                <input type="text" class="form-control" id="recipeName" name="recipeName" required>
            </div>
            <div class="form-group">
                <label for="recipeType">Recipe Type:</label>
                <select class="form-control" id="recipeType" name="recipeType" required>
                    <option value="main">Main Dish</option>
                    <option value="side">Side Dish</option>
                    <option value="dessert">Dessert</option>
                    <option value="drink">Drink</option>
                </select>
            </div>
            <div class="form-group">
                <label for="quantity">Quantity:</label>
                <input type="text" class="form-control" id="quantity" name="quantity" required>
            </div>
           <div class="form-group">
               <label>Main Ingredients:</label>
                  <div id="ingredientList">
                     <div class="ingredient-container">

                       <div class="input-pair">
                        <input type="text" class="form-control" name="mainIngredient1" placeholder="ingredient" required>
                          <input type="text" class="form-control" name="ingredientQuantity1" placeholder="Quantity" required>
                           <span class="remove-ingredient" onclick="removeIngredient(this)">Remove</span>
                            </div>
                            <div class="input-pair">
                            <input type="text" class="form-control" name="mainIngredient2"  placeholder="ingredient" required>
                             <input type="text" class="form-control" name="ingredientQuantity2" placeholder="Quantity" required>
                            <span class="remove-ingredient" onclick="removeIngredient(this)">Remove</span>
                             </div>
                           <div class="input-pair">
                           <input type="text" class="form-control" name="mainIngredient3" placeholder="ingredient" required>
                         <input type="text" class="form-control" name="ingredientQuantity3" placeholder="Quantity" required>
                         <span class="remove-ingredient" onclick="removeIngredient(this)">Remove</span>
                         </div>
                        <div class="input-pair">
                          <input type="text" class="form-control" name="mainIngredient4" placeholder="ingredient" required>
                            <input type="text" class="form-control" name="ingredientQuantity4" placeholder="Quantity" required>
                           <span class="remove-ingredient" onclick="removeIngredient(this)">Remove</span>
                            </div>
                            <div class="input-pair">
                             <input type="text" class="form-control" name="mainIngredient5" placeholder="ingredient" required>
                              <input type="text" class="form-control" name="ingredientQuantity5" placeholder="Quantity" required>
                               <span class="remove-ingredient" onclick="removeIngredient(this)">Remove</span>
                               </div>
                               </div>
                           </div>
                           <button type="button" class="btn btn-sm btn-secondary mt-2" onclick="addIngredient()">Add Ingredient</button>
                       </div>
                       <div class="form-group">
                                       <label for="publishRecipe">Publish Recipe:</label>
                                       <div class="form-check">
                                           <input type="radio" class="form-check-input" id="publishRecipeYes" name="publishRecipe" value="true" >
                                           <label class="form-check-label" for="publishRecipeYes">Yes</label>
                                       &nbsp &nbsp &nbsp

                                           <input type="radio" class="form-check-input" id="publishRecipeNo" name="publishRecipe" value="false">
                                           <label
                                            class="form-check-label" for="publishRecipeNo">No</label>
                                       </div>
                                   </div>

                       <button type="submit" class="btn btn-primary">Submit</button>

                    </form>
                    </div>

                       <script>
                           function addIngredient() {
                               const ingredientList = document.getElementById('ingredientList');
                               const ingredientContainer = document.createElement('div');
                               ingredientContainer.classList.add('ingredient-container');
                               ingredientContainer.innerHTML = `
                                   <input type="text" class="form-control" name="mainIngredients[]" required>
                                   <input type="text" class="form-control" name="ingredientsQuantity[]" placeholder="Quantity" required>
                                   <span class="remove-ingredient" onclick="removeIngredient(this)">Remove</span>
                               `;
                               ingredientList.appendChild(ingredientContainer);
                           }

                           function removeIngredient(element) {
                               const ingredientContainer = element.parentElement;
                               ingredientContainer.remove();
                           }
                       </script>

        <footer>
            &copy; 2024 Xworkz. All rights reserved.
        </footer>
 </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>

</html>
