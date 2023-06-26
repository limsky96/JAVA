import java.util.Scanner;

public class Java_03 { //배열 

	public static void main(String[] args) {
		int num = 5;
		
		// 선언 방법 = 메모리 할당 
		int[] arrNum = new int [6]; // [] 배열 + 변수명 
		double[] arrDou = new double[5];
		long[] arrLong = new long[5]; // 4까지 넣을 수 잇움 ~ 
		
		String[] arrStr = new String[5];
		Circle2[] arrCircle = new Circle2[5];
		
		arrNum[0] = 1;
		arrNum[1] = 2;
		arrNum[2] = 3;
		arrNum[3] = 4;
		arrNum[4] = 5;
		
//		System.out.println(arrNum[2]);
//		System.out.println(arrNum[1]);
		
		for(int i=0; i<arrNum.length;i++) { // 공식  : i<arrNum.length
			System.out.println(arrNum[i]);
			
			
			
			// 로또....
			System.out.println((int)(Math.random() * 10 +1)); // 인트로 형 변환 시켜줘야함 
			System.out.println((int)(Math.random() * 45 + 1));
			boolean isDuplicate = false; // 중복여부 
			isDuplicate = true;
			
			
			
		
		}
	
		
	}

}
