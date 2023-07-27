<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	//세션에저장한거 꺼내는 법
	String id=(String)session.getAttribute("id");//리턴타입이 오브젝트니까 스트링으로 형변환해야함
	int num = (Integer)session.getAttribute("tel");
	
%>
	<%=id %></br>
	<%=num %></br>


</body>
</html>
