<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Bengaluru Metro Ticket Booking</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      font-family: 'Arial', sans-serif;
    }

    .container {
      margin-top: 20px;
    }
  </style>
      <!-- Bootstrap CSS -->
                        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
                        <!-- Your custom CSS -->
                        <link rel="stylesheet" href="styles.css">
</head>

<body class="d-flex flex-column min-vh-100">

  <header class="bg-primary text-light p-2">
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

                 <input type="text" name="query" placeholder="Enter your search">
                                <input type="submit" value="Search">

          </ul>
        </div>
      </nav>
    </div>
  </header>
<br>

  <div class="container">
    <h2>Bengaluru Metro Ticket Booking</h2>
    <br>
    <form action="metroBookingForm" method ="post">

      <div class="mb-3">
        <label for="fromStation" class="form-label">From Station</label>
        <select class="form-select" id="fromStation" name="fromStation" required>
          <option value="" disabled selected>Select a station</option>
          <option value="Kengeri Bus terminal">Kengeri Bus terminal</option>
          <option value="Vijaynagar">Vijaynagar</option>
           <option value="Attiguppe">Attiguppe</option>
            <option value="MagadiRoad">MagadiRoad</option>
             <option value="Hosahalli">Hosahalli</option>
          <!-- Add more stations as needed -->
        </select>

      </div>
      <div class="mb-3">
        <label for="toStation" class="form-label">To Station</label>
        <select class="form-select" id="toStation" name="toStation" required>
          <option value="" disabled selected>Select a station</option>
          <option value="Kengeri Bus terminal">Kengeri Bus terminal</option>
          <option value="Vijaynagar">Vijaynagar</option>
          <option value="Attiguppe">Attiguppe</option>
           <option value="MagadiRoad">MagadiRoad</option>
            <option value="Hosahalli">Hosahalli</option>
          <!-- Add more stations as needed -->
        </select>
      </div>
      <div class="mb-3">
        <label for="noOfTickets" class="form-label">Number of Tickets</label>
        <input type="number" class="form-control" id="noOfTickets" name="noOfTickets" min="1" required>
      </div>
      <div class="mb-3">
        <label for="paymentOption" class="form-label">Payment Option</label>
        <select class="form-select" id="paymentOption" name="paymentOption" required>
          <option value="select" >select option</option>
          <option value="creditCard">Credit Card</option>
          <option value="debitCard">Debit Card</option>
          <option value="upi">UPI</option>
          <!-- Add more payment options as needed -->
        </select>
      </div>
      <button type="submit" class="btn btn-primary" onclick="submitForm()">Book Ticket</button>
    </form>
  </div>

  <br>

    <footer class="bg-dark text-light p-1 mt-auto">
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

 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
 <script src="booking-script.js"></script>

</body>
</html>