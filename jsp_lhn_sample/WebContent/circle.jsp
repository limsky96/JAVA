<%@ page import="edu.global.ex.Circle" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>student.jsp입니다</h1>

<jsp:useBean id="circle" class="edu.global.ex.Circle" />

<jsp:setProperty name="circle" property="radius" value="5" />

<%-- 원의 넓이를 계산하여 변수 area에 저장 --%>
<% double area = circle.getArea(); %>

원넓이: <%= area %>

</body>
</html>