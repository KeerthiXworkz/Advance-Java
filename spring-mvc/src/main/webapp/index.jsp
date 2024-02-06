<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

</head>
<body>

< c:forEach items="${list}" var="error" >

<h2>${error.getDefaultMessage()} <h2>

</c:forEach>

 <form action="mvc" method="post">
 <br>
TechnologyName:<input type="name" name="mvcTechnologyName">
<br>
TechnologyVersion:<input type ="name" name="technologyVersion">
<br>
ReleaseYear:<input type="number" name="releasedYear">
<br>
OwnerName:<input type="name" name="ownerName">
<br>

        <hover>
        <button type="submit" value="submit">submit</button>
            <button type="reset" value="Reset">Reset</button>
        </hover>
      <a href="listOfTechnology">Get All</a>
</body>
</html>
