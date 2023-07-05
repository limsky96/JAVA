
public class Java_03_threadtest {

	public static void main(String[] args) {
		//싱글 스레드 
		for(int i=0; i<3;i++) {
			System.out.println("-");
		}
		for(int i=0; i<3;i++) {
			System.out.println("|");
		}
	}//main
}
