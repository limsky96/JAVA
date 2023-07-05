import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        try {
            System.out.print("정수(-1이 입력될 때까지) 입력: ");
            int number = scanner.nextInt();

            while (number != -1) {
                numbers.add(number);
                number = scanner.nextInt();
            }

            if (numbers.size() > 0) {
                int maxNumber = numbers.get(0);
                for (int i = 1; i < numbers.size(); i++) {
                    if (numbers.get(i) > maxNumber) {
                        maxNumber = numbers.get(i);
                    }
                } 
                System.out.println("가장 큰 수는 " + maxNumber);
            } else {
                System.out.println("입력된 정수가 없습니다.");
            }
        } catch (Exception e) {
            System.out.println("올바른 정수를 입력해주세요.");
        } finally {
            scanner.close();
        }
    }
}






///// 강사 
//List<Integer> list = new LinkedList<>();
//Scanner sc = new Scanner(System.in);
//
//System.out.println("정수(-1이 입력될 때까지)>>");
//
//while(true) {        
//   
//   try {
//       int num = sc.nextInt(); //7 9 10
//       
//       if(num == -1)
//          break;
//       
//       list.add(num);
//  } catch (Exception e) {
//     System.out.println("잘못된 입력입니다. 다시 넣어 주세요");
//      sc = new Scanner(System.in);
//     continue;
//  }
//
//}
//
////큰값 구하기
//
//int max = 0;
//for (int num : list) {
//  if(num > max)
//     max = num;
//}
//
//System.out.println("가장 큰수는" + max);
//
//System.out.println(list);