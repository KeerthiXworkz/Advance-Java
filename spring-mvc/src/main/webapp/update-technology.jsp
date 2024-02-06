<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link rel="stylesheet" href="register.css">
</head>
 <!--<h2>${ update }</h2>-->
<body>

    <form action="<%=application.getContextPath()%>/updateTechnology" method="post">

        <h3 style="display : none"><input type="text" name="id" id="id" value="${updateInfo.getId()}" style="display : none"></h3>
        <br>
        TechnologyName : <input type="text" name="mvcTechnologyName"  value=" ${updateInfo.getMvcTechnologyName() }">
        <br>
      TechnologyVersion: <input type="text" name="technologyVersion"  value="${updateInfo.getTechnologyVersion() }">
        <br>
        ReleaseYear:<input type="text" name="releasedYear"  value="${updateInfo.getReleasedYear()}">
        <br>
        OwnerName:<input type="text" name="ownerName"  value="${updateInfo.getOwnerName()}">
        <br>

        <div>
         <h3><button type="submit">UPDATE</button></h3>
        </div>

        <a href="index.jsp" id="new">Home</a>

         <a href="getAllUsers" id="getAll"> Get details</a>
    </form>

</body>
</html>