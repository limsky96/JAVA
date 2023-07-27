<%@page import="edu.global.ex.Student"%>
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
	<h1>student.jsp 입니다.</h1>
	<!-- Student student2 = new Student() -->
    <jsp:useBean id="student2" class="edu.global.ex.Student" />
	
	<!-- student2.setName("홍길순") -->
	<jsp:setProperty name="student2" property="name" value="홍길순"/>
   	<jsp:setProperty name="student2" property="age" value="9"/>
   	<jsp:setProperty name="student2" property="grade" value="5"/>
	<!-- student2.getName() -->
	이름:<jsp:getProperty name="student2" property="name">
	
	
	
	<%
		Student student = new Student("홍길동", 10, 6);
	%>
	이름<%=student.getName() %><br>
	나이<%=student.getAge() %><br>
	학년<%=student.getGrade() %><br>



</body>
</html>
