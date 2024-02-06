// dashboard.js
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

    function updateRecipeDashboard(recipes) {
        const recipeDashboard = $('#recipeDashboard');

        // Iterate through the recipes and dynamically create recipe cards
        recipes.forEach(function (recipe) {
            const recipeCard = createRecipeCard(recipe);
            recipeDashboard.append(recipeCard);
        });
    }

    function createRecipeCard(recipe) {
        const recipeCard = $('<div class="recipe-card"></div>');
        recipeCard.append('<h4>' + recipe.recipeName + '</h4>');
        recipeCard.append('<p>Recipe Type: ' + recipe.recipeType + '</p>');
        recipeCard.append('<p>Quantity: ' + recipe.quantity + '</p>');
        recipeCard.append('<p>Main Ingredients: ' + recipe.mainIngredients.join(', ') + '</p>');
        recipeCard.append('<p>Ingredients Quantity: ' + recipe.ingredientsQuantity.join(', ') + '</p>');

        return recipeCard;
    }
});


