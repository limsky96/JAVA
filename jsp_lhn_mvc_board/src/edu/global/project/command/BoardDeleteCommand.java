package edu.global.project.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.project.dao.BoardDao;
import edu.global.project.dto.BoardDto;

public class BoardDeleteCommand implements BoardCommand {

	// 자손이 구현하므로 interface의 메소드를 override한다 
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		
		System.out.println("BoardWriteCommand entry..."); // 디버깅을 위한 코드 
		
		String bid = request.getParameter("bid");
	
		
		
		BoardDao boardDao = new BoardDao();
		
		boardDao.delete(bid);

	}
   

}