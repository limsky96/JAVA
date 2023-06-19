
public class Java_11_break_continue { // break는 기본적으로 반복, 스위치문에서만 구

	public static void main(String[] args) {
		// break
		
//		int num = 1;
//		boolean search = false; 
//		//처음 만나는 5의 배수이자 7의 배수인 수를 찾는 반복
////		while(num < 100) {
////			if(((num % 5) == 0) && ((num % 7) == 0)) {
////				search = true;
////				break; // for , witch
////			}
////			num++;
////		}
//		for(int i = 1; i < 100; i++) {
//			if(((num % 5) == 0) && ((num % 7) == 0)) {
//				search = true;
//				break;}
//			num++;
//		}
//		if(search)
//			System.out.println("찾는 정수 : " + num);
//		else
//			System.out.println("5의 배수이자 7의 배수인 수를 찾지 못했습니다.");
		
		//continue
		int num = 0;
		int count = 0;
		
		while((num++) < 100) {
			if(((num % 5) != 0) || ((num % 7) != 0))
				continue; // 5와 7의 배수 아니라면 나머지 건너뛰고 위로 이동 
			count++; // 5와 7의 배수인 경우만
			System.out.println(num);}
		System.out.println("count : " + count);
				
		}

	}


