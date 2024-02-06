<%@ page language="java" contentType="text/html"  pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link rel="stylesheet" href="register.css">

    </head>

    <h2><${ register }</h2>

    <body>
    <nav class=="nav">
    <div class="nav1">

      <li><a href ="adhar.jsp">Home Page</a></li>
      </div>
    </nav>
    <br>

   <form action="updateUser" method="post">

 <h3 style="display : none"><input type="text" name="id" id="id" value="${ adharInfo.getId()}" style="display : none"></h3>
    <br>
   Name:<input type="text" name="name" id="name" placeholder="Enter Name" value="${ adharInfo.getName()}" >
   <br>
   AdharNumber:<input type="number" name="adharnumber" id="adharnumber" placeholder="Enter AdharaNumber" value="${ adharInfo.getAdharaNumber()}" >
   <br>
   Age:<input type="number" name="age" id="age" placeholder="Enter Age" value="${ adharInfo.getAge()}">
   <br>
   PhNo:<input type="number" name="contact" id="contact" placeholder="enter phno" value="${ adharInfo.getPhNo()}">
   <br>
   Address:<input type="text" name="address" id="address" placeholder="Enter Address" value="${ adharInfo.getAddress()}">
   <br>
   Date of Birth(DD/MM/YYYY)<span class="required"></span> <input type="date" name="dateOfBirth"   id="dob" value="${ adharInfo.getDob()}">
   <br>
   <button type="submit" value="submit">Update</button>
   <button type="reset" value="reset">Reset</button>

   </form>
   </body>
   </html>