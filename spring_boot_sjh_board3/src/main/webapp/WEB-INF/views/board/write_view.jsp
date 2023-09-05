<%@ page language="java" contentType="text/html;charset=utf-8"
   pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<title>write_view</title>

<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script type="text/javascript">
   $(document).ready(function() {

      //아래에 있는 form id 객체를 끌고옴#클래스로
      $("#updateForm").submit(function(event) { //submit클릭을 하면 이벤트 객체를 던져주겠다
         //prevendDefault()는href로 연결해주지 않고
         //단순히 click에 대한 처리를 하도록 해준다 
         event.preventDefault();

         //인풋아이디 불러와서 js의 변수로 
         var bname = $("#input_bname").val();
         var btitle = $("#input_btitle").val();
         var bcontent = $("#input_bcontent").val();

         //위 변수 세개를 form 객체내부변수로 묶겠다
         let form = {
            bname : bname,
            btitle : btitle,
            bcontent : bcontent
         }

         //자바객체를 json으로 만드는 함수
         console.log(JSON.stringify(form));
      
         $.ajax({
            type : "POST",
            url : "/boards/",
            cashe : false,
            contentType : 'application/json; charset=utf-8',
            data : JSON.stringify(form),
            success : function(result) {
               console.log(result);
               //성공하면 어디로 갈지 정해줌location객체 두가지 방법
               //(1) location.href = "/list"; 
               //(2) $(location).attr('href', '/rest_board.html');
               $(location).attr('href', '/board/list2');
            },
            error : function(e) {
               console.log(e);
            }
         });

      });//$("#updateForm").submit(function(event)이걸 닫는태그

   });//$(document).ready(function()
</script>

</head>
<body>
   <table width="500" cellpadding="0" cellspacing="0" border="1">
      <form id="updateForm" action="write" method="post">
         <tr>
            <td>이름</td>
            <td><input id="input_bname" type="text" name="bname" size="50">
            </td>
         </tr>
         <tr>
            <td>제목</td>
            <td><input id="input_btitle" type="text" name="btitle"
               size="50"></td>
         </tr>
         <tr>
            <td>내용</td>
            <td><textarea id="input_bcontent" name="bcontent" rows="10"></textarea>
            </td>
         </tr>
         <tr>
            <td colspan="2"><input type="submit" value="입력">
               &nbsp;&nbsp; <a href="list">목록보기</a></td>
         </tr>
      </form>
   </table>
</body>
</html>