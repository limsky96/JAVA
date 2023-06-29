import java.util.InputMismatchException;
import java.util.Scanner;

// ~~ try catch 쓰는 이유 ~~ 
// 1. 안 죽게 하려고
// 2. 예외 처리 
public class Java_01 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		try {
		System.out.print("a/b....a? ");
		int n1 = kb.nextInt(); //int 형 정수 입력
		
		System.out.print("a/b....b?");
		int n2 = kb.nextInt();
		//System.out.printf("%d/%d = %d\n", n1, n2, n1/n2);
		System.out.println(n1/n2);
		}
		
		catch(ArithmeticException | InputMismatchException e) {
			e.printStackTrace();
		//System.out.println(e.getMessage());
		}
		System.out.println("good bye~~");
	}

}
