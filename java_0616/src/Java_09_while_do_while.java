
public class Java_09_while_do_while { // 반복문 while ~ 

	public static void main(String[] args) {
//		int num = 1;
//		
//		while(num <= 5) {
//			System.out.println("HelloWorld!");
//			num++;
//		}
		
 //문제 1~10 까지의 합
		int num = 1;
		int sum = 0;
		
		while (num <= 10) { 
			sum = sum + num;
			num++;
		}
		
		System.out.println(sum);
		
///do-while 1~ 10까지의 
		num = 1;
		sum = 0;
		
		do {
			sum = sum + num;
			num++;
		} while(num <= 10);
		System.out.println(sum);
		
		
		}
		
		
}

