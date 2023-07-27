
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>메인 페이지 압니다</h1>
   <%
      request.setAttribute("id", "1234");
   
   %>
   <jsp:forward page="sub.jsp"> <!-- "sub.jsp"/ 라고 하지 않게 주의 ! -->
   

</body>
</html>
