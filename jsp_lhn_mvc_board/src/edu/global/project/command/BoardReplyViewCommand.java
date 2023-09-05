package edu.global.project.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.project.dao.BoardDao;
import edu.global.project.dto.BoardDto;

public class BoardReplyViewCommand implements BoardCommand {

   // 자손이 구현하므로 interface의 메소드를 override한다.
   @Override
   public void execute(HttpServletRequest request, HttpServletResponse response) {
      // TODO Auto-generated method stub
      
      System.out.println("BoardReplyViewCommand entry.."); // 디버깅을 위한 코드
      
      String bid = request.getParameter("bid");
      
      BoardDao boardDao = new BoardDao();
      
      BoardDto dto = boardDao.reply_view(bid);

      // request에 담긴 데이터를 BController에서 forwarding으로 넘김으로써
      // dto객체를 content_view.jsp에서 사용할 수 있도록 한다.
      
      request.setAttribute("reply_view", dto);
   }
   
   
}