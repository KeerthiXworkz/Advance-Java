<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<!-- <h2> ${ users } </h2> -->
<head>
    <link rel="stylesheet" href="register.css">
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
          </head>
          <h3>${updateMessage}</h3>
          <h3>${deleteMessage}</h3>
          <li><a href="adhar.jsp">Click here to go HOME Page</a></li>
<body>

<table>
<tr>
<th>Sl no</th>
<th>Name</th>
<th>AdharNumber</th>
<th>Contact</th>
<th>Age</th>
<th>Address</th>
<th>Date Of Birth</th>
<th>Action</th>
</tr>

< c:forEach items="${ users }" var="user" >

<tr>

<td>${ user.getId() }</td>
<td>${ user.getName() }</td>
<td>${ user.getAdharaNumber() }</td>
<td>${ user.getPhNo() }</td>
<td>${ user.getAge() }</td>
<td>${user.getAddress()} </td>
<td>${user.getDob()}</td>

    <td><button ><a href="update?userId=${ user.getId() }">Update</a></button>
    <button ><a href="delete?userId=${ user.getId() }">Delete</a></button></td>

</tr>

</c:forEach>
</table>

</body>
</html>