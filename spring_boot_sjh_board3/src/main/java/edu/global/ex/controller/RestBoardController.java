package edu.global.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.global.ex.service.BoardService;
import edu.global.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

//REST : Representational State Transfer
//하나의 URI가 하나의 고유한 리소스를 대표하도록 설계된 개념

//http://localhost/spring02/list?bno=1 ==> url+파라미터
//http://localhost/spring02/list/1 ==> url
//RestController은 스프링 4.0부터 지원
//@Controller, @RestController 차이점은 메서드가 종료되면 화면전환의 유무

//spring v4.0 에서 부터 @RestController라는 어노테이션을 추가해서
//해당 Controller의 모든 메서드의 리턴타입을 기존과 다르게 처리한다는것을 명시

@Slf4j
@RestController
@RequestMapping("/boards")
public class RestBoardController {

   @Autowired
   private BoardService boardService;
   
   @GetMapping("/list/{}")
   public List<BoardVO> list(){
      log.info("list().." + boardService.getList());
      return boardService.getList();
   }
   
   @GetMapping("/list_view")
   public ModelAndView list_view() {
      
      log.info("ModelAndView board() ..");
      
      ModelAndView mv = new ModelAndView();
      mv.setViewName("/board/rest_list");
      
      return mv;
   }
   
   //http://localhost:8282/boards/{905}
   //http://localhost:8282/boards/100   
   @DeleteMapping("/{bid}")
   public int boards_delete(BoardVO boardVO) {
      
      log.info("boards_delete ..");
      
      int rn = boardService.remove(boardVO);
      
      return rn;
   }
   
   //글쓰기
   //post+"/boards"+"/"+
   //@RequestBody = json을 자바객체로 넣어주는 애너테이션(write_view확인)
   @PostMapping("/")
   public String boards_write(@RequestBody BoardVO boardVO) {
      
      boardService.register(boardVO);
      
      return "SUCCESS" ;
   }
   
}