// app.js

const otpCache = new Map(); // Map to store OTPs (key: emailOrPhone, value: otp)

app.post('/recover', (req, res) => {
    const { emailOrPhone } = req.body;

    // Generate OTP (for simplicity, generate a random 6-digit OTP)
    const otp = Math.floor(100000 + Math.random() * 900000);

    // Store OTP in cache
    otpCache.set(emailOrPhone, otp.toString());

    // Send OTP to the user (you may use an email or SMS service)
    // Here, we'll log it to the console for simplicity
    console.log(`OTP for ${emailOrPhone}: ${otp}`);

    // Redirect to the set new password page with email/phone as a query parameter
    res.redirect(`/set-new-password?emailOrPhone=${encodeURIComponent(emailOrPhone)}`);
});

// Add route for set new password page
app.get('/set-new-password', (req, res) => {
    const { emailOrPhone } = req.query;

    // Render the set new password page with email/phone pre-filled
    res.render('set-new-password', { emailOrPhone });
});
