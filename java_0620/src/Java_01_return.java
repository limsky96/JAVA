
public class Java_01_return {

	public static void main(String[] args) {
		// 나눗셈 
		divide(4, 2);
		divide(6, 2);
		divide(9, 0);

		// 각 				//double area = getCirclearea(10);
		getCircleArea(10); //System.out.println(area);
		
		// RectangleArea 사각 (10,20);
		System.out.println(getRectangleArea(10, 20));
		
		// 삼각형
		System.out.println(getTriangleArea(40,20));
		
		// ASCII
		System.out.println(getAscCode('A'));
	}

	public static void divide(int num1, int num2) { // 나눗셈 
		if (num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return; // 값의 반환 없이 메소드만 종료 
		}
		System.out.println("나눗셈의 결과: " + (num1/num2));
	}
	
	public static void getCircleArea(double n) { // 원 넓이(3.14*r^2)
	//public static double getCircleArea(int r)
		double area = (n*n) * 3.14; // final double PI = 3.14;
		System.out.println(area);  // return r * r * PI;
	}
	
	public static double getRectangleArea(double a, double b) { // 사각형
		return a * b;
	}
	
	public static double getTriangleArea(double a, double b) { //삼각형	
		return (a*b)/2;
	}
	
	public static int getAscCode(char ch) { // ASCII 
		return (int)ch; // 문자가 아니로 숫자라고 형변환 시킴 
	}
	
	

}
