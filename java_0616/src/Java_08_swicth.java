
public class Java_08_swicth { // switch문 (직관적)

	public static void main(String[] args) {
		int n = 3;
		
		switch(n) {
		case 1:
			System.out.println("Simple Java");
			break;
		case 2:
			System.out.println("Funnt Java");
			break;
		case 3:
			System.out.println("Fantastic Java");
			break;
		default:
			System.out.println("The best programming language");
		}
		System.out.println("Do you like Java?");

		
//# 문제 04 int month = 3 ; (12 1 2 3 = 겨울, 4 5 6 = 봄, 7 8 = 여름, 9 10 11 = 가을 )
		int month = 3;
		switch(month) {
		case 1:
			System.out.print("겨울");
			break;
		case 2:
			System.out.print("겨울");
			break;
		case 3:
			System.out.print("겨울");
			break;
		case 4:
			System.out.print("봄");
			break;
		case 5:
			System.out.print("봄");
			break;
		case 6:
			System.out.print("봄");
			break;
		case 7:
			System.out.print("여름");
			break;
		case 8:
			System.out.print("여름");
			break;
		case 9:
			System.out.print("가을");
			break;
		case 10:
			System.out.print("가을");
			break;
		case 11:
			System.out.print("가을");
			break;
		case 12:
			System.out.print("겨울");
			break;
		//default:
		//	System.out.println("잘못된 입력입니다.");
		}
		System.out.println("입니다.");
		// case 12:
		// case 1:
		// case 2:
		// case 3:
		//	 System.out.println("겨울 입니다.")
		// break; 이런 식으로 해도 됨.
		
// # 04 한 달이며칠인지 알려주는 프로그램 구현
	      int month1=1;
	      int d1 = 31;
	      int d2 = 30;
	      int d3 = 28;
	      
	      switch(month1){
	      case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
	         System.out.println(month1 + "월은" + d1 + "일입니다.");
	         break;
	      case 4 : case 6 : case 9 : case 11 :
	         System.out.println(month1 + "월은" + d2 + "일입니다.");
	         break;
	      case 2 :
	         System.out.println(month1 + "월은" + d3 + "일입니다.");
	         }
		
		
		
		
	}

	
	
	
}
