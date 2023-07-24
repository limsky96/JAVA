package edu.global.ex;

import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")  //경로 
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		System.out.println("Hellow World!!!");
		
		response.setContentType("text/html; charset=UTF-8");
		
	    PrintWriter writer = response.getWriter();
	      
	    writer.println("<html>");
	    writer.println("<head>");
	    writer.println("</head>");
	    writer.println("<body>");
	    writer.println("<h1>HelloWorld~~~</h1>");
	    writer.println("<h1>안녕하세요.</h1>"); 
	    writer.println("<h1>홍길동</h1>"); 	    
	    writer.println("</body>");
	    writer.println("</html>");
	      
	    writer.close();
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
