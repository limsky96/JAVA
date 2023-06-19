
public class Java_06_if_elseif {

	public static void main(String[] args) {
//		int num = 120;
//		
//		if(num < 0)
//			System.out.println("0 미만");
//		else if(num < 100)
//			System.out.println("0 이상 100 미만");
//		else
//			System.out.println("100 이상");
		
// # 문제 1
//		int num1 = 90; // int kor, eng, math;
//		int num2 = 70; // int total;
//		int num3 = 45; // double avg; 
//		double result = ((num1+num2+num3)/3); //char grade = '가';
//		
//		System.out.println("국어 : " + num1); // kor = 90;
//		System.out.println("영어 : " + num2); // eng = 70;
//		System.out.println("수학 : " + num3 + '\n'); // math = 45;
//		
//		System.out.println("총점 : " + (num1+num2+num3)); // total = kor + eng + math;
//		System.out.println("평균 : " + result); // avg = total/3.0;
//		
//		if (result >= 90)
//			System.out.println("수");
//		else if (result >= 80)
//			System.out.println("우");
//		else if (result >= 70)
//			System.out.println("미");
//		else if (result >= 60)
//			System.out.println("양");
//		else
//			System.out.println("가");

// # 문제 2
		int num1 = -6;
		int num2 = 10;
		int num3 = 1;
		
		int max = num1;
		
		if(max < num2) {
			max = num2;
		}
		
		if(max < num3) {
			max = num3;
		}
		System.out.println("최대값 : " + max);
		
		
	
	}

}
