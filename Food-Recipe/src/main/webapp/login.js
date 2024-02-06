// Login route
app.post('/login', (req, res) => {
    const { username, password } = req.body;

    // Check credentials
    const user = users.find(u => u.username === username && u.password === password);

    if (user) {
        // Successful login
        // Clear unsuccessful attempts for this user
        unsuccessfulLoginAttempts.delete(username);

        // Set user session
        req.session.user = user;

        res.send('Login successful!');
    } else {
        // Unsuccessful login
        // Increment unsuccessful login attempts for this user
        const attempts = unsuccessfulLoginAttempts.get(username) || 0;
        unsuccessfulLoginAttempts.set(username, attempts + 1);

        if (attempts >= 2) {
            // If three unsuccessful attempts, redirect to account recovery
            res.redirect('/recover');
        } else {
            res.send('Login failed. Please try again.');
        }
    }
});
