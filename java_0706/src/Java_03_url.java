import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Java_03_url {

   public Java_03_url() {

      String code = null;
      System.out.println("웹 주소를 입력하세요.");
      Scanner scanner = new Scanner(System.in);
      String address = scanner.next();
//웹 브라우저 원리 
      try {
         URL url = new URL(address);
         URLConnection con = url.openConnection();
         BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream()));
         FileWriter fw = new FileWriter("file.html", false); // 해당 파일 

         while ((code = webData.readLine()) != null) {
            System.out.println(code);
            fw.write(code); // 해당 파일에 저장 ~
         }
         System.out.println("The End");

         fw.close();
         webData.close();

      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public static void main(String[] args) {
      new Java_03_url();
   }
}