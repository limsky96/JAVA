import javax.swing.JOptionPane;

class Java_06_threadtest_multi {
   public static void main(String[] args) throws Exception
   {
      String input = JOptionPane.showInputDialog("아무 값이나 입력하세요."); 
      System.out.println("입력하신 값은 " + input + "입니다.");

      for(int i=10; i > 0; i--) {
         System.out.println(i);
      
         try {
            Thread.sleep(1000); //1초 동안 지연/delay/멈춘다
         } catch(Exception e ) {}
         
      }
      
   }
}


//import javax.swing.JOptionPane;
//
//public class ThreadEx7 {
//   public static void main(String[] args) {
//      ThreadEx7_1 th1 = new ThreadEx7_1();
//      ThreadEx7_2 th2 = new ThreadEx7_2();
//      th2.start();
//      th1.start();
//      
//   }
//}
//
//class ThreadEx7_1 extends Thread{
//
//   @Override
//   public void run() {
//      for(int i =10;i>0 ; i--) {
//         System.out.println(i);
//         try {
//            sleep(1000);
//         } catch(Exception e) {
//            
//         }
//      }
//   }
//   
//}
//
//class ThreadEx7_2 extends Thread{
//
//   @Override
//   public void run() {
//      String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
//      
//      System.out.println("입력하신 값은 " + input + "입니다.");
//   }
//   
//}