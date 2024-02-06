<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Your Website</title>
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <!-- Your custom CSS -->
  <link rel="stylesheet" href="styles.css">
</head>

 <!-- <h2>${ success } </h2>-->

<body class="d-flex flex-column min-vh-100">

  <!-- Header -->
  <header class="bg-primary text-light p-3">
    <div class="container">
      <nav class="navbar navbar-expand-lg navbar-dark">
        <img src="images\nammametrologo.jpeg" class="logo">
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
              </ul>

              <input type="text" name="query" placeholder="Enter your search">
               <input type="submit" value="Search">
        </div>
      </nav>
    </div>
  </header>

  <!-- Footer with Social Media Links -->
  <footer class="bg-dark text-light p-3 mt-auto">
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

  <!-- Bootstrap JS (optional) -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
  <!-- Your custom JS -->
  <script src="scripts.js"></script>

</body>
</html>