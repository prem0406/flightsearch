<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<style type="text/css">
body {
	font-family: sans-serif;
}

table, td, tr, th {
	padding: 10px;
	border-collapse: collapse;
	border: 1px solid #444;
	letter-spacing: 1px;
}

table {
	width: 100%;
}

button {
	margin: 5px;
}
</style>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>

<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<script>
	$(function() {
		$("#datepicker").datepicker();
	});
</script>
</head>
<body>
	<div style="border: 1px solid #333; width: 70%">
		<div
			style="padding: 10px; font-size: 18px; letter-spacing: 1px; border-bottom: 1px solid #333">
			<b>Flight Search Utility</b>
		</div>
		<br>
		<div style="padding: 10px">

			<form action="getFlight">

				From <input type="text" name="deploc" required> To <input
					type="text" name="arrloc" required> 
					
					<p>Date: <input type="text" name="fdate" id="datepicker"></p>
					
				<label for="fclass">Class: </label> 
				<select name="fclass" id="fclass">
					<option selected="selected" value="E">Economy</option>
					<option value="B">Business</option>
				</select> 
				
				<label for="outputpref">Sort By:</label> 
				<select name="outputpref" id="outputpref">
					<option selected="selected" value="E">Fare</option>
					<option value="B">Fare and Durarion</option>
				</select> <input type="submit" value="Search">
			</form>

			<br> <br> <b>Search Results</b>
		</div>
		<%-- OutPut: ${flight} --%>
		<table>
			<tr>
				<th>Flight No</th>
				<th>Dep Loc</th>
				<th>Arr. Loc</th>
				<th>Valid Till</th>
				<th>Flight Time</th>
				<th>Flight Duration</th>
				<th>Fare</th>
				<th>Class</th>
			</tr>
			
			
			<c:forEach var="flight" items="${result}">
			
			<tr>
			
				<td> ${flight.getFlightNo()} </td>
				<td> ${flight.getDepLoc()} </td>
				<td> ${flight.getArrLoc()} </td>
				<td> ${flight.getValidTill()} </td>
				<td> ${flight.getFlightTime()} </td>
				<td> ${flight.getFlightDurr()} </td>
				<td> ${flight.getFare()} </td>
				<td> ${flight.getCl()} </td>
			</tr>
			
			</c:forEach>
			
			
			
		</table>
	</div>
	
	<c:url value="/logout" var="logoutUrl" />
<form id="logout" action="${logoutUrl}" method="post" >
  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>
<c:if test="${pageContext.request.userPrincipal.name != null}">
	<a href="javascript:document.getElementById('logout').submit()">Logout</a>
</c:if>
</body>
</html>