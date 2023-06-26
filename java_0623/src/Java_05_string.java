

public class Java_05_string{

	public static void main(String[] args) {
		Circle2[] arrCircle = new Circle2[5];
		
		arrCircle[0] = new Circle2(10.0); // new 를 쓰는 이유 
		arrCircle[1] = new Circle2(5); 
		
		double area = 0;
		for(int i=0; i < arrCircle.length; i++) {
			area = area + arrCircle[i].getArea();
		}
		System.out.println(area);
		
		//////////////////////////////
		String[] arrStr = new String[2];
		arrStr[0] = "String 1";
		arrStr[1] = "String 2";
		
		System.out.println(arrStr[0].length()); //length는 변수라서 ()를 붙여 함수로 만들어줘야함 
		System.out.println(arrStr[1].length());
		
		int sum=0;
		for(int i = 0; i<arrStr.length; i++) {
			sum = sum + arrStr[i].length();
			System.out.println(arrStr[i]);
		}
		System.out.println(sum);
	}

}
