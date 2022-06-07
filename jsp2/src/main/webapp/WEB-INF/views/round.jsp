<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
	
		* {
			box-sizing: border-box;
			margin: 0;
		}
	
		#container {
			height: 100vh;
		}
		header {
			display: flex;
			justify-content: center;
		}
		main {
			display: flex;
			height: 500px;
			background-color: aqua;
			justify-content: center;
			align-items: center;
			font-size: 20px;
			font-weight: 600;
		}
		footer {
			display: flex;
			justify-content: center;
			align-items: center;
			height: 200px;
			background-color: buttonface;
		}
	</style>

</head>
<body>

	<div id="container">

		<header>
			<h1>Round Math Example</h1>
		</header>
		
		<main>
			<%
				float f = 33.4f;
				int i = Math.round(f);
				java.util.Date date = new java.util.Date();
			%>
			실수 f의 반올림 값은 <%=i %><br/>
			현재 날짜와 시간은? <%=date.toString() %>
			
		</main>
		
		<footer>
			선언문에 선언한 변수는 멤버 변수와 같다. <br/>
			스크립트 릿에 선언한 변수는 지역변수, 또는 로컬 변수라고한다. <br/>
		
			선언문에 선언한 변수와 스크립트 릿에 선언한 변수는 <br/>
			선언하는 위치 및 메모리에 올라가는 위치가 다르다.
		
		</footer>
	</div>

</body>
</html>