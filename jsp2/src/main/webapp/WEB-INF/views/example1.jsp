<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSP 전용 태그 연습</h1>
	<% String name = "HELLO SPRING"; %> <!-- 스크립트 릿 -->
	<!-- 주석 부분 입니다. 소스보기에서 보임 -->
	<%-- 이 부분은 JSP 페이지에서만 보이고 소스보기를 해도 보이지 않음, 브라우저에 보내지 않는 문장 --%>
	<%=name /* 표현식 안에서 사용하는 주석 */ %> <span>BOOT</span>
	<!-- 스크립트 릿 안에서 쓴 변수를 쓸 수 있음 --> 
	
</body>
</html>