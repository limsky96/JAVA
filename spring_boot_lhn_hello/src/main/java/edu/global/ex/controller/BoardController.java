package edu.global.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board/*") // /board 로 검색하고 들어오는 모든 것들은 여기서 컨트롤 하라는 의미
public class BoardController {
   
   @GetMapping("/insert")
   public String insert() { 
      return "board/insert";
   }
   
   @GetMapping("/form")
   public String form() { 
      return "board/form";
   }   
   
   // 유저에서 보내는 정보 받아내기
   //1. HttpServletRequest request 를 통하여 받아오기 
   @GetMapping("confirm")
   public String confirm(HttpServletRequest request, Model model) {
	   String id = request.getParameter("id");
	   model.addAttribute("id", id);
	   
	   return "board/insert";
   }
   
   @PostMapping("confirm")
   public String confirmPost(HttpServletRequest request, Model model) {
	   String id = request.getParameter("id");
	   model.addAttribute("id", id);
	   
	   return "board/insert";
   }
   
   @GetMapping("/delete") // GetMapping 은 XmlApplication 을 위한 문법이다
   public String delete() { 
      return "board/delete";
   }
   
   @GetMapping("/content")
   public String content(Model model) { // <-- (Model model) : 호출해 주는 주최가 XmlApplication [스프링]이다.
      model.addAttribute("id", "1234"); // 변수명 "id"로 주고, 변수 스트링으로 "1234"
      model.addAttribute("pw", "abcd");
      
      model.addAttribute("name", "홍길동");
      model.addAttribute("age", 1234); // 데이터 타입이 객체도 가능
      
      return "board/content";
   }
   
   @GetMapping("/reply")
   public ModelAndView reply() { // <-- (Model model) : 호출해 주는 주최가 XmlApplication [스프링]이다.
      
      ModelAndView mv = new ModelAndView();
      mv.addObject("id", 30);
      mv.setViewName("board/reply");
      
      return mv;
   }
   
   @RequestMapping(value="/update", method=RequestMethod.POST) // <-- RequestMapping 은 이렇게 메소드를 지정해줄 수 있다. [기본값 : 메소드_GET]
   // 405 에러 : 메소드 오류 GET방식
   // @RequestMapping("/update")
   public String update() {
      return "board/update";
   }
}