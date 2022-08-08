<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Jsp Session</h1>

	<h3>expression tag</h3>
	<%="Octavi from sky crew "%>

	<h3>scriplet tag</h3>
	<%
	int a = 15;
	int b = 20;
	int c = a + b;
	out.println(c);
	%>

	<h3>Declaration tag</h3>
	<%!public int sub(int a, int b) {
		return a - b;
	}%>

	<%
	out.println(sub(15, 20));
	%>

</body>
</html>
