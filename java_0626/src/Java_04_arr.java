
public class Java_04_arr {

	public static void main(String[] args) {
//		int[][] arr = new int[3][4];
//		int num = 1;
//		
//		// 배열에 값을 저장
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j <4; j++) {
//				arr[i][j] = num;
//				num++;
// 			}
//		}
//		
//		//배열에 저장된 값을 출력
//		for(int i = 0; i < 3; i++) {
//			for(int j=0; j<4; j++) {
//				System.out.println(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
		//2차원 배열 초기화
		int[][] arr = {
				{11},
				{22, 33},
				{44, 55, 66}
				
		};
		
		// 배열의 구조대로 내용 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
