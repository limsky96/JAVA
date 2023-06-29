import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//class Board{}
//class PBoard extends Board{}


public class Java_02_castexception {

	public static void main(String[] args) throws Exception { // throws Exception오류가 나게 되면 얘가 아닌 호출한 곳에 던진다 .
//		Board pbd1 = new PBoard();
//		PBoard pbd2 = (PBoard)pbd1; // OK
//		
//		System.out.println("..intermediate location..");
//		Board ebd1 = new Board();
//		PBoard ebd2 = (PBoard)ebd1; // exception!
		
		Path file = Paths.get("C:\\javastudy\\Simple.txt");
		   BufferedWriter writer = null;
		   
		  writer = Files.newBufferedWriter(file);
		  
		  try {
		      writer = Files.newBufferedWriter(file);   // IOException 발생 가능
//		      writer.write('A’);   // IOException 발생 가능
//		      writer.write('Z’);   // IOException 발생 가능
//
//		      if(writer != null)
//		          writer.close();   // IOException 발생 가능
		  } catch(IOException e) {
		      e.printStackTrace();
		  }

	}
}

