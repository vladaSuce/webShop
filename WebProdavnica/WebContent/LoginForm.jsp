<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
 <script src="<c:url value="/script.js" />"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<h1>Login Page</h1>
	<center>
		<h2>Signup Details</h2>
		<form action="LoginUserServlet" method="post">
			<br />Username:<input type="text" name="username"> <br />Password:<input
				type="password" name="password"> <br />
			<input type="submit" name="submit" value="Submit" onclick="return submitForm(this, event);"> 
		</form>
	</center>
</body>
</html>

