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

   <form action="register" method="post">

   Name:<input type="text" name="name" id="name" placeholder="Enter Name">
   <br>
   AdharNumber:<input type="number" name="adharnumber" id="adharnumber" placeholder="Enter AdharaNumber" >
   <br>
   Age:<input type="number" name="age" id="age" placeholder="Enter Age" >
   <br>
   PhNo:<input type="number" name="contact" id="contact" placeholder="enter phno">
   <br>
   Address:<input type="text" name="address" id="address" placeholder="Enter Address" >
   <br>
   Date of Birth(DD/MM/YYYY)<span class="required">*</span>
      <input type="date" name="dateOfBirth"   id="dob">
   <br>
   <button type="submit" value="submit">Submit</button>
   <button type="reset" value="reset">Reset</button>

   </form>
   </body>
   </html>
