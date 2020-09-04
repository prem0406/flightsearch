<%@ page import="javax.servlet.http.HttpServlet"%>
<html>
<head>
<style type="text/css">
.container {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}

input[type=submit] {
	background-color: #1E90FF;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #4169E1;
}

input[type=text], input[type=password] {
	width: 100%;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	margin-top: 3px;
	margin-bottom: 3px;
}
</style>

<title>Flight Searcher</title>

</head>
<body>
	<div align="center" class="container">

		<div>

			<form action="adminSignIn" method="post">
				<br>

				<table>

					<tr>

						<td>User Name :</td>

						<td><input type="text" name="userName"></td>

					</tr>

					<tr>

						<td>Password :</td>

						<td><input type="password" name="password"> <br></td>

					</tr>

					<tr>

						<td align="right"><input type="submit" value="Sign In"
							align="right"></td>
				</table>

			</form>
</body>

</html>





