<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Flight</title>
<style type="text/css">
table, td, tr, th {
	padding: 10px;
	border-collapse: collapse;
	border: 1px solid #444;
	letter-spacing: 1px;
}

table {
	width: 100%;
}

</style>
</head>
<body>
<%-- 	${deploc}
	
	Result ${result}
	
	<c:forEach var="f" items="${result}">
	
	${f.getArrLoc()}  ${f.getDepLoc()}  ${f.getValidTill()}
	<br>
	
	</c:forEach> --%>
	
	
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
	
	
</body>
</html>