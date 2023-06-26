import java.util.Arrays; // Lotto 

public class Java_04 { // 배열

    public static void main(String[] args) {
        int[] lottoNumbers = new int[6]; // 로또 번호를 저장할 배열
        int count = 0; // 생성된 로또 번호의 개수

        while (count < 6) {
            int randomNumber = (int)(Math.random() * 45 + 1); // 1부터 45까지의 난수 생성
            boolean isDuplicate = false; // 중복 여부를 저장하는 변수

            // 배열을 검사하여 중복 여부 확인
            for (int i = 0; i < count; i++) {
                if (lottoNumbers[i] == randomNumber) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                lottoNumbers[count] = randomNumber; // 중복이 아니면 배열에 추가
                count++; // 로또 번호 개수 증가
            }
        }

        // 생성된 로또 번호 정렬 및 출력
        Arrays.sort(lottoNumbers);
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.println(lottoNumbers[i]);
        }
    }
}



//		// 강사
//			// 변수 선언 
//		int[] arrLotto = new int[6]; // 배열 안하면 입력값 6개를 해야함 ..
//			//입력 
//		for(int i=0; i < arrNum.length;i++) {
//			arrLotto[i] = (int)(Math.random() *45 + 1);
//			
//			for(int j=0; j<i; j++) { // j<=i-1 대신 j<i 사용 ~! 
//				if(arrLotto[i] == arrLotto[j]) {
//					i--; // 핵심 ! 41줄에서 한 번 더해주기 때문에  
//					break;
//				}
//			}
//		}
//		
//			// 출력
//		for(int i=0; i < arrNum.legth;i++) {
//			System.out.println(arrLotto[i]);
//		}
//		
//		
//		
//		