<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <style>
     .container{
       margin-top: 40px;
     }
     
     .msg {
     color: green;
     }
     
     .error{
     	color: red;
     }
    </style>
</head>
<body >

  <div class="container">
    <h3>Admin Home</h3>
    <br>
    <c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>
    <form action="upload" method="post">
      <div class="form-group">
        <label for="exampleFormControlFile1">Select CSV File</label>
        <input type="file" name="file" class="form-control-file" id="exampleFormControlFile1">
        <br>
        <input type="submit" value="Upload">
      </div>
    </form>
  </div>
  
</body>
</html>