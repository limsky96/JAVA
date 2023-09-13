package edu.global.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.global.ex.service.BoardService1;
import lombok.extern.slf4j.Slf4j;

/*
1.interface IBDao를  XML namespac에 매핑 <mapper namespace="edu......IBDao"> 
2.sqlSession.getMapper(IBDao.class)를 이용.
* 
* 
* */


@Slf4j
@Controller
public class BoardController1 {
	
	@Autowired
	private BoardService1 boardService;
	
	@GetMapping("/list10")
	public String list10(Model model) throws Exception {
		log.info("list() ..");
		
		model.addAttribute("boardList", boardService.selectBoardList());
		
		return "board/list";
	}


}