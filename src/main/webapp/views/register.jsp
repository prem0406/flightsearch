<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <style>
      .container{
        margin-top:  40px;
      }

      h3{
        text-align: center;
      }
      
      input[type=submit]{
        display: inline;
        width: 80px;
      }
    </style>
</head>
<body >

  

    <div class="container">
      <h3> Register New User</h3>
      <form action="register-user" method="post">
        <div class="row">
          <div class="col">
            <input type="text" class="form-control" name="name" placeholder="Your Full Name">
          </div>
          
        </div>
       <br>
        <div class="row">
          <div class="col">
            <input type="text" name="username" class="form-control" placeholder="Username">
          </div>
          <div class="col">
            <input type="password" name="password" class="form-control" placeholder="Password">
          </div>
        </div>
        <br>
        <div class="row">
          <div class="col">
           <input type="submit" class="form-control" value="SUBMIT">
            <div class="btn btn-secondary"><a href="/flightsearch/login">Cancel</a></div>
          </div>
        </div>
        
      </form>
    </div>
	
</body>
</html>
