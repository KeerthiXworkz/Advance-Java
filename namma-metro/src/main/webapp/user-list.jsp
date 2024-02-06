<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel="stylesheet" href="register-styles.css">
<style>
              table,th,td{
                          border: 2px solid black;
                          border-collapse: collapse;
                          margin-left: auto;
                          margin-right: auto;
                          margin-top:4%;
                      }
                      th{
                          background-color: rgb(122, 237, 237);
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
                          <a class="nav-link" href="user-list.jsp">Show</a>
                        </li>

              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                    <input type="text" name="query" placeholder="Enter your search">
                     <!--<input type="submit" value="Search">-->

          </ul>
        </div>
      </nav>
    </div>
  </header>

<form action="search" >

<input type="text" name="userName" placeholder="enter your userName" >
<input type="text" name="email" placeholder="enter your email">
<input type="text" name="phone" placeholder="enter your phone">

 <input type="submit" value="Search">

 </form>

<table>

<tr>
<th>sl no</th>
<th>UserName</th>
<th>Email</th>
<th>PhNo</th>
<th>Address</th>
<th>Password</th>
<th>Action</th>

</tr>

<c:forEach items="${ users }" var="user" >

<tr>

<td>${ user.getId() }</td>
<td>${ user.getUserName() }</td>
<td>${ user.getEmail() }</td>
<td>${ user.getPhone() }</td>
<td>${ user.getAddress() }</td>
<td>${ user.getPassword() }</td>

    <td><button ><a href="update?userId=${ user.getId() }">Update</a></button>
    <button ><a href="delete?userId=${ user.getId() }">Delete</a></button></td>

</tr>

</c:forEach>
</table>

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

</body>
</html>