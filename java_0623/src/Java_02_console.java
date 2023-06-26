import java.util.Scanner; // scanner 포함시킴 util !!!
// Circle
class Circle2{
	   private double radius; //변수선언 > 게터세터 넣기
	   
	   public Circle2() {}
	   public Circle2(double radius) {
		   this.radius = radius;
	   }

	   public double getRadius() {
	      return radius;  //원의 넓이를 가져오는 함수
	   }

	   public void setRadius(double radius) { //외부값받아서 원의넓이를 변경하는 함수
	      this.radius = radius;
	   }
	   
	   public double getArea() {
	      return radius * radius * Math.PI;  //원의 넓이 곱하는 함수만듦
	   }
	   
	}

// Recatangle
class Recatangle2 {
		private double a;
		private double b;
		
		public Recatangle2() {}
		public Recatangle2(double a, double b) {
			this.a = a;
			this.b =b;
		}
		public double getArea() {
			return a * b ;
		}
}

// 성적표
class Grade2 {
		String name;
	   int kor, eng, math; //인스턴트 변수

	   void setGrade(int kor, int eng, int math) { 
	      this.kor = kor;
	      this.eng = eng;
	      this.math = math; 
	   }

	   double getAvg() { 
	      return (kor + eng + math) / 3.0;
	   }

	   char getGrade() {
	      char ch = '가';
	      double avg = getAvg(); 
	      
	      if(avg >=90) {
	         ch='수';
	      }
	      else if (avg >=80) {
	         ch='우';
	      }
	      else if (avg >=70) {
	         ch='미';
	      }
	      else if (avg >=60) {
	         ch='양';
	      }
	      
	      return ch;
	   }
	}

public class Java_02_console {

	public static void main(String[] args) {
		
		//총점 
//		   Scanner sc = new Scanner(System.in);
//		   
//		   System.out.println("국어 : ");
//		   int kor = sc.nextInt();
//		   System.out.println("영어 : ");
//		   int eng = sc.nextInt();
//		   System.out.println("수학 : ");
//		   int math = sc.nextInt();
//		   
//		   System.out.println("총점: " + (kor+eng+math));
		   
//		   int num1 = sc.nextInt();
//		   int num2 = sc.nextInt();
//		   int num3 = sc.nextInt();
//
//		   int sum = num1 + num2 + num3;
//		   System.out.printf("%d + %d + %d = %d \n", num1, num2, num3, sum);

		
		// 원 넓이 
//		   Scanner circle = new Scanner(System.in);
//		   Circle2 circle2;
//		   
//		   System.out.print("반지름 : ");
//		   double radius = circle.nextDouble();
//		   
//		   circle2 = new Circle2(radius);
//		   
//		   System.out.println("넓이 : " + circle2.getArea());
		   
	   // Recatangle
//		   Scanner rectangle = new Scanner(System.in);
//		   Recatangle2 rectangleObject;
//
//	        boolean continueProgram = true;
//
//	        while (continueProgram) { 
//	            System.out.print("가로: ");
//	            double a = rectangle.nextDouble();
//	            System.out.print("세로: ");
//	            double b = rectangle.nextDouble();
//
//	            rectangleObject = new Recatangle2(a, b);
//	            System.out.println("넓이: " + rectangleObject.getArea());
//
//	            System.out.print("계속하시겠습니까? (Yes/No): ");
//	            String continueChoice = rectangle.next();
//	            if (continueChoice.equalsIgnoreCase("No")) {
//	                continueProgram = false;
//	            }
//	        }
//
//	        rectangle.close();
	        //
	        Scanner scanner = new Scanner(System.in);

	        boolean continueProgram1 = true;

	        while (continueProgram1) {
	            System.out.print("이름: ");
	            String name = scanner.nextLine();

	            System.out.print("국어 성적: ");
	            int kor = scanner.nextInt();

	            System.out.print("영어 성적: ");
	            int eng = scanner.nextInt();

	            System.out.print("수학 성적: ");
	            int math = scanner.nextInt();

	            // 개행 문자(\n) 제거
	            scanner.nextLine();

	            Grade2 grade = new Grade2();
	            grade.setGrade(kor, eng, math);

	            System.out.print(name + "님의");
	            System.out.print("평균은 : " + grade.getAvg() + "이고 ");
	            System.out.println("성적은 " + grade.getGrade() + "입니다.");

	            System.out.print("계속하시겠습니까? (Yes/No): ");
	            String continueChoice = scanner.nextLine();

	            if (continueChoice.equalsIgnoreCase("No")) {
	                continueProgram1 = false;
	            }
	        }

	        scanner.close();
	        //강사
//	        while (true) {
//	            sc = new Scanner(System.in);         
//
//	            System.out.print("이름:");
//	            name = sc.next();
//	            
//	            System.out.print("국어:");
//	            kor = sc.nextInt();
//
//	            System.out.print("영어:");
//	            eng = sc.nextInt();
//	            
//	            System.out.print("수학:");
//	            math = sc.nextInt();
//	            
//	            grade = new Grade2(name, kor, eng, math);
//
//	            grade.showInfo();
//	            
//
//	            System.out.print("계속?");
//	            String choice = sc.next();
//
//	            if (choice.compareToIgnoreCase("yes") == 0 || choice.compareToIgnoreCase("y") == 0)
//	               continue;
//	            else
//	               break;
//	         }
//
//	         System.out.println("종료되었습니다.");
	        }
}

