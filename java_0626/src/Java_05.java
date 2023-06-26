import java.util.Scanner;
import java.util.Random;

public class Java_05 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rows;
        int columns;

        // 행 크기 입력 받기
        while (true) {
            System.out.print("행 크기: ");
            rows = scanner.nextInt();
            
            if (rows >= 1 && rows <= 10) {
                break; }
             else {
                System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다."); }
        }

        // 열 크기 입력 받기
        while (true) {
            System.out.print("열 크기: ");
            columns = scanner.nextInt();
            if (columns >= 1 && columns <= 10) {
                break; }
             else {
                System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다."); }
        }

        // 이차원 배열 생성 및 랜덤 값 할당
        char[][] arr = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = (char) (random.nextInt(26) + 65); // 65부터 90까지의 랜덤 값으로 대문자 할당
            }
        }

        // 배열 출력
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


