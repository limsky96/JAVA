
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
   <%
      Cookie[] cookies = request.getCookies();
      
      if(cookies != null) {
         for(int i=0; i<cookies.length; i++) {
            if(cookies[i].getValue().equals("abcde")){
               cookies[i].setMaxAge(0);
               response.addCookie(cookies[i]);
            }
         }
      }
      
      response.sendRedirect("login.html"); // 쿠키삭제 
      //response.sendRedirect("cookietest.jsp");
   %>

</body>
</html>
