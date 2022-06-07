<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<header>
			<h1>JSP 전용 태그 알아보기</h1>
		</header>
	<main>
		<!--  JSP 전용태그 : 선언문 -->
		<%! String a = "여기는 선언문 영역입니다."; %>
		<!--  JSP 전용태그 : 스크립트 릿 -->
		<% String b = "여기는 스크립트 릿 영역입니다."; %>
		
		<div class="blue">
			<span>표현식을 사용했습니다</span>
			<span><%=a%></span>
		</div>
		
		
		<div class="blue">
			<span>표현식을 사용했습니다</span>
			<span><%=b%></span>
		</div>
		
	</main>
</body>
</html>