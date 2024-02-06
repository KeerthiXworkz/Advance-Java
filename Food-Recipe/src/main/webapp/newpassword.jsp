<!-- set-new-password.html -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Set New Password</title>
    <!-- Include necessary styles/scripts -->
</head>
<body>
    <h2>Set New Password</h2>
    <form id="setNewPasswordForm" action="/set-new-password" method="post">
        <input type="hidden" name="emailOrPhone" value="{{ emailOrPhone }}">
        <label for="otp">Enter OTP:</label>
        <input type="text" id="otp" name="otp" required>
        <button type="button" onclick="validateOTP()">Validate OTP</button>
        <label for="newPassword">New Password:</label>
        <input type="password" id="newPassword" name="newPassword" required>
        <button type="submit">Set New Password</button>
        <button type="button" onclick="goBack()">Back to Login</button>
    </form>
    <!-- Include necessary scripts -->

    <script>
        function validateOTP() {
            // Add logic to validate OTP using AJAX or other methods
            // Show an appropriate message to the user
        }

        function goBack() {
            window.history.back();
        }
    </script>
</body>
</html>

