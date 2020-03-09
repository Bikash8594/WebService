<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red;text-align:center">Welcome to Product Register page!</h1>
<form action="save" method="post">
<pre>
Id:<input type="text" name="pid">
Pcode:<input type="text" name="pcode">
PCost:<input type="text" name="pcost">
<input type="submit" value="register"> 
</pre>
</form>
${message}
</body>

</html>