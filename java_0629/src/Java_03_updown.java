import java.util.Random;
import java.util.Scanner;


public class Java_03_updown {

	public static void main(String[] args) {
		Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int Count = 0;
        boolean	bl = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1~100까지의 숫자를 맞춰보세요."); 
        

        while (!bl) {
            System.out.print("숫자를 입력하세요: ");
            int user = scanner.nextInt();
            Count++;

            if (user == secretNumber) {
                System.out.println("정답입니다! 축하합니다.");
                bl = true;
            } else if (user < secretNumber) {
                System.out.println("Up!");
            } else {
                System.out.println("Down!");
            }
        }

        System.out.println(Count + "회 만에 맞췄어요.");
        scanner.close();

	}

}


//try catch 
//Scanner scanner = new Scanner(System.in);
//int answer = (int)(Math.random()*100+1);
//int num;
//int count =1;
//while(true) {
//   System.out.println("1~100 사이의 숫자를 맞혀보세요");
//   try {
//      num = scanner.nextInt();
//      if(num > answer)      System.out.println("DOWN");
//      else if(num < answer)   System.out.println("UP");
//      else if(num == answer) break;
//      count++;
//   }catch(Exception e) {
//      scanner.nextLine();
//      System.out.println("제대로 숫자를 입력하세요.");
//   }
//}
//System.out.println("정답입니다. "+ count+"회 만에 맞췄어요.");
//}
//}
