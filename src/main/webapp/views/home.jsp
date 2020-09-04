<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <style>
     .container{
       margin-top: 40px;
     }
    </style>
</head>
<body >


<div class="container">
  <h1>Flight Search Web Application</h1>
  <br>
  <br>
  <div class="row">
    <div class="col">
      <div class="card" style="width: 18rem;">
        <div class="card-body">
          <h5 class="card-title">USER</h5>

          <p class="card-text">Login and Search Flights between two locations.</p>
          <a href="/flightsearch/login" class="card-link">User Login</a>
          
        </div>
      </div>
    </div>
    <div class="col">
      <div class="card" style="width: 18rem;">
        <div class="card-body">
          <h5 class="card-title">ADMIN</h5>
          <p class="card-text">Admin is responsible to add Flight details through CSV files</p>
          <a href="/flightsearch/admin-login" class="card-link">Admin Login</a>
          
        </div>
      </div>
    </div>
  </div>
</div>
  
</body>
</html>
