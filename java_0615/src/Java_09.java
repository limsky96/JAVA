
public class Java_09 { // 복합 대입 연산자 예제 

	public static void main(String[] args) {
		short num = 10;
		num = (short)(num + 77L); // 형 변환 안하면 컴파일 오류 
		int rate = 3;
		rate = (int)(rate * 3.5); // 형 변환 안하면 컴파일 오류 
		System.out.println(num); // 87
		System.out.println(rate); // 10

		num = 10;
		num += 77L; // 형 변환 필요하지 않다.
		rate = 3;
		rate *= 3.5; // 형 변환 필요하지 않다.
		System.out.println(num); // 87
		System.out.println(rate); // 10
	}

}
