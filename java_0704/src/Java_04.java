import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Java_04 {

	public static void main(String[] args) throws IOException  {
		OutputStream out = new FileOutputStream("data.dat");   // 출력 스트림 생성
	      out.write(7);   // 7을 저장 ( 4byte로 )
	      out.close();   // 스트림 종료
	      
	      
	      
	      InputStream in = new FileInputStream("data.dat");   // 입력 스트림 생성
	      int dat = in.read();   // 데이터 읽음
	      in.close();   // 입력 스트림 종료      
	      System.out.println(dat);

	}

}
