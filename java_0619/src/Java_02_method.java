
public class Java_02_method {

//	public static void hiEveryone(int age, int tall) { 
//		System.out.println("제 나이는 " + age + "입니다.");
//		System.out.println("제 키는" + tall + "입니다");
//	}
//	
//	public static void main(String[] args) {
//		hiEveryone(12, 170);
//		hiEveryone(18, 168);
//		
//		int height = 190;
//		hiEveryone(22, height);
//	
	
	
//	public static int add(int num1, int num2) { 
//		int result = num1 + num2;
//		return result; // result가 int값.
//	}
//	public static int sub(int num1, int num2) {
//	 return num1 - num2;
//	}	
//	public static int mul(int num1, int num2) {
//		 return num1 * num2;
//		}
//	
//	public static char gradChar(double num1) {
//		 if(num1 >=90) { return '수'; } 
//		 else if(num1 >= 80) { return '우';}
//		 else {return '가';}
//		}
	
	public static void showStar(int n) {
		for(int i = 1; i<=n; i++) {
		for(int j = 1; j<=i; j++) { System.out.print("*");}
		System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
//		System.out.println(add(3,5)); 
//		System.out.println(sub(3,5));
//		System.out.println(mul(3,5));
//		
//		System.out.println(gradChar(90.8));
//		System.out.println(gradChar(80.0));
//		System.out.println(gradChar(50.0));
		
		showStar(1);
		showStar(2);

	}
}
