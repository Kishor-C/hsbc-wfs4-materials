<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- This is HTML and XML comments -->
	<h1>This is index page</h1>
	<%! 
		int x = 10;
		int y = 20;
	%>
	<%!
		int z = 30;
	%>
	<%-- This is JSP comments --%>
	<%-- Below is Scriptlet, you can have one or more scriptlets --%>
	<%
		int a = 1;
		a++;
		x++;
		y++;
		z++;
	%>
	<%-- Below is JSP Expression tag --%>
	<h2>
		a = <%=a %> <br />
		x = <%=x %> <br />
		y = <%=y %> <br />
		z = <%=z %> <br />
	</h2>
</body>
</html>