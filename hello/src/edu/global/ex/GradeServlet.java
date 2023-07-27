package edu.global.ex;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.grade.Grade;


@WebServlet("/Grade")
public class GradeServlet extends HttpServlet {

   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      // TODO Auto-generated method stub
      super.doGet(req, resp);
   }

   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      resp.setContentType("text/html; charset=UTF-8");
      double kor  = Double.valueOf(req.getParameter("kor"));
      double eng  = Double.valueOf(req.getParameter("eng"));
      double math  = Double.valueOf(req.getParameter("math"));
      
      Grade grade = new Grade(kor, eng, math);
      
      resp.getWriter().append("<html>")
               .append("<head>")
               .append("</head>")
               .append("<body>")
               .append("<h1>성적표</h1>")
               .append("<h2>총점: " + grade.getTotal()+"</h2>" )
               .append("<h2>평균: " + grade.getAvg() + "</h2>")
               .append("<h2>성적: " + grade.getGrade() + "</h2>")
               .append("</body>")
               .append("</html>");
      
   }

}