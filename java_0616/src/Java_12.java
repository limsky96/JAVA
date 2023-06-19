
public class Java_12 { // 반복문의 중첩 (2중 for문)

	public static void main(String[] args) {
		
	for(int i = 2; i <10; i++) { //2단부터 9단까지 진행 위한 바깥쪽 for문 
		for(int j = 1; j < 10; j++) // 1부터 9까지의 곱을 위한 안쪽 for문 
		if((i*j) % 2 == 1) // 결과 값이 홀수인 것만 출력 
			System.out.println(i + " * " + j + " = " + ( i * j));
		}

	
	}

}
