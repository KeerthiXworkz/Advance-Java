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
       <a href="index.jsp" >Home</a>
<body>

<form action="search" >
 <input type="text" name="mvcTechnologyName" placeholder="search by technologyName" >
 <input type="text" name="technologyVersion" placeholder="search by version" >
 <button type="search" value="submit" >Search</button>

</form>
<table>
<tr>
<th>sl no</th>
<th>mvcTechnologyName</th>
<th>technologyVersion</th>
<th>releasedYear</th>
<th>ownerName</th>
<th>Action</th>
</tr>

< c:forEach items="${ techs }" var="user" >

<tr>

<td>${ user.getId() }</td>
<td>${ user.getMvcTechnologyName() }</td>
<td>${ user.getTechnologyVersion() }</td>
<td>${ user.getReleasedYear() }</td>
<td>${ user.getOwnerName() }</td>

    <td><button ><a href="getTechnology/${ user.getId() }">Update</a></button>
    <button ><a href="delete?techId=${ user.getId() }">Delete</a></button></td>
  </td>
</tr>

</c:forEach>
</table>

</body>
</html>