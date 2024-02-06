// app.js

app.post('/set-new-password', (req, res) => {
    const { emailOrPhone, otp, newPassword } = req.body;

    // Check if OTP is valid (compare with the stored OTP in cache)
    const storedOtp = otpCache.get(emailOrPhone);

    if (storedOtp && storedOtp === otp) {
        // Update user's password (you may need to modify this based on your user management system)
        // Here, we'll log it to the console for simplicity
        console.log(`New password set for ${emailOrPhone}: ${newPassword}`);

        // Clear OTP from cache after use
        otpCache.delete(emailOrPhone);

        // Redirect to the login page or display a success message
        res.send('Password successfully updated. You can now login with your new password.');
    } else {
        // Invalid OTP
        res.send('Invalid OTP. Please try again.');
    }
});
