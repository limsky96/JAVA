import java.net.InetAddress;
import java.util.Scanner;

public class Java_02_inet {
   
   Scanner scanner;
   
   public Java_02_inet() {
      System.out.println("Host 이름을 입력 하세요.");
      
      scanner = new Scanner(System.in);
      try {
         InetAddress inetAddress = InetAddress.getByName(scanner.next());
         
         System.out.println("Computer NAME : " + inetAddress.getHostName());
         System.out.println("Computer IP : " + inetAddress.getHostAddress());
         
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
   
   public static void main(String[] args) {
	      new Java_02_inet();
   }
}