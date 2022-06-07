<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	<%-- p{
		color:<%=color %>
	} --%>

</style>
</head>
<body>
	<header>
		<h1>IF Examlple</h1>
	</header>
	<main>
		<%!
		String msg = "red";
		String color;
		%>

		<%
		if (msg.equals("blue")) {
			color = "blue";
		} else if (msg.equals("red")) {
			color = "red";
		} else {
			color = "black";
		}
		%>

		<p>
			당신이 좋아하는 색깔은
			<%=color%></p>



	</main>
</body>
<style>
p{
		color:<%=color %>
	}
</style>

</html>