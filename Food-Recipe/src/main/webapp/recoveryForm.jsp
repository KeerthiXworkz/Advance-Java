<!-- recovery.html -->
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Account Recovery</title>
</head>

<body>
    <h2>Account Recovery</h2>
    <form id="recoveryForm" action="/recover" method="post">
        <label for="emailOrPhone">Enter Email or Phone:</label>
        <input type="text" id="emailOrPhone" name="emailOrPhone" required>
        <button type="submit">Send OTP</button>
    </form>

    <!-- Include your JavaScript logic for handling OTP and redirecting to set a new password -->
    <script>
        // Sample JavaScript for handling OTP and redirection
        document.getElementById('recoveryForm').addEventListener('submit', function (event) {
            event.preventDefault();
            // Include your logic to send OTP and handle the redirection
            // Example: window.location.href = '/setNewPassword';
        });
    </script>

</body>

</html>
