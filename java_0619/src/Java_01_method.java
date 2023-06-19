
public class Java_01_method {

	public static void main(String[] args) {
		
		// 5x5 별 
		for(int i = 1; i<=5; i++) {
		
		System.out.println("*****");

		}
		
		System.out.println();
		
		// 별 증가 
		for (int i = 1; i<=5; i++) { // y
			for (int j = 1; j<=i; j++) { // x
				System.out.print("*"); // print: 화면 출력 함수, 
			}
			System.out.println();
	
		}
		
		System.out.println();
	
		// 별 감소 
		for (int i = 1; i<=5; i++) { // y
			for (int j = i; j <= 5 ; j++) { // x
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();

		// 직각삼각형 
		for (int i = 1; i<=5; i++) {
			for (int j =i; j<5; j++) {System.out.print(" ");}
			for (int j = 1; j<=i; j++) {System.out.print("*");}
			System.out.println();
			
		}
		
		System.out.println();
		
		// 직각삼각형 아래방향 
		for (int i =1; i<=5; i++) {
			for(int j=1; j<i; j++) {System.out.print(" ");}
			for(int j=i; j<=5; j++) {System.out.print("*");}
			System.out.println();
		}
	}
}