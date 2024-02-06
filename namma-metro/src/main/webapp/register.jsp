<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Register Page</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

   <link rel="stylesheet" href="register-styles.css">

</head>
<body class="d-flex flex-column min-vh-100">

           <header class="bg-primary text-light p-2">
               <div class="container">
                 <nav class="navbar navbar-expand-lg navbar-dark">
                  <!-- <img src="images\nammametrologo.jpeg" class="logo">-->
                     <h3>Namma Metro</h3>

                   <div class="collapse navbar-collapse" id="navbarNav">
                     <ul class="navbar-nav ml-auto">
                       <li class="nav-item">
                         <a class="nav-link" href="register.jsp">Register</a>
                       </li>
                       <li class="nav-item">
                         <a class="nav-link" href="login.jsp">Login</a>
                       </li>
                       <li class="nav-item">
                         <a class="nav-link" href="buy-ticket.jsp">Buy Ticket</a>
                       </li>
                         <li class="nav-item">
                                 <a class="nav-link" href="getAllUser">Show</a>
                          </li>
                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <input type="text" name="query" placeholder="Enter your search">
                                              <input type="submit" value="Search">
                     </ul>
                   </div>
                 </nav>
               </div>
             </header>

  <div class="container mt-5">
    <div class="row justify-content-center">
      <div class="col-md-4">
        <h2 class="text-center mb-4">Register</h2>

        <form action="register" method="post">

          <div class="mb-3">
            <label for="username" class="form-label">Username</label>
            <input type="text" class="form-control" id="userName" name="userName" required>
          </div>
          <div class="mb-3">
            <label for="email" class="form-label">Email</label>
            <input type="email" class="form-control" id="email" name="email" required>
          </div>
          <div class="mb-3">
            <label for="phone" class="form-label">Phone Number</label>
            <input type="tel" class="form-control" id="phone" name="phone" required>
          </div>
          <div class="mb-3">
            <label for="address" class="form-label">Address</label>
            <textarea class="form-control" id="address" name="address" rows="1" required></textarea>
          </div>
           <div class="mb-3">
                      <label for="password" class="form-label">Password</label>
                      <input type="password" class="form-control" id="password" name="password" required>
                    </div>
          <button type="submit" class="btn btn-primary" onclick="validateForm()" >Register</button>

        </form>

      </div>
    </div>
  </div>
<br>

   <footer class="bg-dark text-light p-2 mt-auto">
              <div class="container">
                <div class="row">
                  <div class="col-md-6">
                    <!-- Your footer content goes here -->
                    &copy; 2024 Your Website
                  </div>
                  <div class="col-md-6 text-right">
                    <!-- Social media links -->
                    <a href="#" class="text-light mx-2">Facebook</a>
                    <a href="#" class="text-light mx-2">Twitter</a>
                    <a href="#" class="text-light mx-2">Instagram</a>
                  </div>
                </div>
              </div>
            </footer>

    <script src="register-script.js"></script>

</body>
</html>
