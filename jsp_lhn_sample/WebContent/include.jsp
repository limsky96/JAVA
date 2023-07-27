<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>인클루드를 합니다.</h1>
<jsp:include page="include01.jsp"/>


  <%
  //내장객체
  //new / out / reqest / response
  out.print("서버이름" + request.getServerName());
  out.print("포트번호" + request.getServerPort());
  out.print("겟방식 포스트 방식" + request.getMethod());
  
  out.print("겟방식 포스트 방식" + request.getContextPath());
  out.print("URL 패스" + request.getRequestURL());
  out.print("URI 패스" + request.getRequestURI());
  %>
  
</body>
</html>   