
public class Java_01_SCE { // 논리연산자 주의점 : SCE

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0); //(AND 연산자)num1이 F면 num2생략 
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2 + '\n'); // 개행 
		
		result = ((num1 += 10) > 0) || ((num2 += 10) > 0); //(OR 연산자)num1이 T면 num2생략 
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		System.out.print("**********"); // ln  개행이 들어가있음 
		System.out.print("++++++++++");

	}

}
