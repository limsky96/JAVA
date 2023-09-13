package edu.global.ex.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardService1Test {

   @Autowired
   private BoardService1 service;
   
   @Test
   void testSelectBoardList() throws Exception {
      assertNotNull(service);
      
      System.out.println(service.selectBoardList().size());
      
   }

}