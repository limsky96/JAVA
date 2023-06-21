// 객체 지향언어 (Object Oriented Programing, OOP) = 자바 
class Student{  // class 는 개발자가 여러개 만들 수 있다.
	int age; // 다이렉트로 접근함 -> 실무에서는 잘 사용 안 함 , 전체 써먹을 수 있는 age 
	char gender;
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) { // gender누르고 source > getters and setters 하면 자동생
		this.gender = gender;
	}

	// 데이터 멤버를 컨트롤 하는 set, get 함수 
	public void setAge(int age) { // age를 set하는 함수 
		this.age = age; // this는 문법. 나중에 배움
	}
	
	public int getAge() { // age를 return하는 함수 (get함수, set과 세트인 함수 )
		return age;
	}
}

class Circle {
	double radius;
	//final double PI = 3.14;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI; // Math.PI =  final double PI = 3.14;
	}
	
}

// rectangle
class Rectangle {
	double width, height;
	
	void setWidthHeight(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return width * height;
	}
}

// starprint
class StarPrint {

	   void printTriangle(int num) {

	      for (int i = 1; i <= num; i++) {
	         for (int j = 1; j <= i; j++) {
	            System.out.print("*");
	         }
	         System.out.println();
	      }

	   }

	   void printReverseTriangle(int num) {

	      for (int i = 1; i <= num; i++) {
	         for (int j = i; j <= num; j++) {
	            System.out.print("*");
	         }
	         System.out.println();
	      }
	   }
	}
 
 // 객체 
class GetSum {
	int num;
	
	public void setNum(int num) {
		this.num = num;
	}

	public int getNum(int num) {
		return num;
	}
	
	int sum() {
		int sum=0;
		for(int i = 1; i <=num; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
	
// 구구단
class Gugudan {
	
	void printGugu(int num){
		for(int i = 1; i <= num; i++) { 
			for(int j = 1; j <= num; j++) 
				System.out.println(i + " * " + j + " = " + ( i * j));
			}
	}
}
	
// 성적
class Grade {
	int kor, eng, math;
	double avg;
	char grade;
	
	public void setGrade (int kor, int eng, int math) { // public 안 써도 됨 
		this.kor=kor;		// public void와 void는 차이가 있지만 현재단계에선 비슷함 
		this.eng=eng;
		this.math=math;
	}
	
	public double getAvg() {
		final double TOTAL = (kor + eng + math);
		avg = TOTAL/3.0;
		return avg; // 3줄을 1줄로 쓰면 return (kor+eng+math)/3.0 ;
	}
	
	public void getGrade() { // char getGrade()
		// char ch= '가';
		//double avg = getAvg();
		
		if (avg >= 90)		
			System.out.println("수");
		else if (avg >= 80)
			System.out.println("우");
		else if (avg >= 70)
			System.out.println("미");
		else if (avg >= 60)
			System.out.println("양");
		else
			System.out.println("가");
	
	}
	
	
}






public class MainClass_02 {
	public static void main(String[] args) { // main을 가진 변수
		
		Rectangle rec = new Rectangle(); //참조형 변수선언, 참조는 기본적으로 new
		rec.setWidthHeight(10, 10);
		System.out.println(rec.getArea());
		System.out.println(rec); // rec가 어디에 저장됐는지의 주소 
		
		
		
		
		/////////////////
		Student 백지효 = new Student(); // 객체 -> 객체(인스턴스)를 생성해야 class사용가능 
		Student 김민성 = new Student(); // (=object) 
		
		//
//		백지효.age = 3;
//		김민성.age = 14;
		
		백지효.setAge(40);
		백지효.setGender('M');
		
		char gender = 백지효.getGender();
		System.out.println(gender);
		
		int age = 백지효.getAge();
		System.out.println(age);
		
		김민성.setAge(30);
	
		
		System.out.println(백지효.age); // 위에 선언 안 해주면 0이 디폴트 값으로 나옴 (컴파일러)
		System.out.println(김민성.age);
		
		//Java_02_class rec = new Java_02_class();
		
		rec.width = 3;
		rec.height = 5;
		
		System.out.println(rec.width);
		System.out.println(rec.height);
		
		//
		int num =0; // 변수 선언 
		
		Circle circle; // Circle : 참조형 데이터타입(int 포함 8개의 데이터타입 아님! 나머지는 참조형)  
		circle = new Circle(); // 참조형은 기본적으로 new를 한다 -> 객체 생성 
		circle.setRadius(10);
		
		System.out.println(circle.getArea());
		
		
		//Starprint
		StarPrint strPrint = new StarPrint();
		
		strPrint.printTriangle(3);
		System.out.println();
		strPrint.printReverseTriangle(3);
		
		// 객체 
		GetSum getsum = new GetSum(); // 객체생성
		
		num = 100;
		getsum.setNum(num); // getsum 객체의 setNum함수 호출, num값 50 저장
		num = getsum.sum(); // getsum객체의 sum함수 호출, 1-50까지 합 구함
		System.out.println(num);
	
		// 구구단
		Gugudan gugudan = new Gugudan();
		gugudan.printGugu(10);
		gugudan.printGugu(20);
		
		//국영수
		Grade grade= new Grade();
		
		grade.setGrade(80, 80, 90);
		//System.out.println(grade.kor + ", " +grade.eng + ", " + grade.math); 내가 입력한 점수 값 확
		System.out.println(grade.getAvg());
		grade.getGrade();
		
		//Grade grade2 = new Grade(); 를 통해 새로운 객체를 생성해야 새로운 값을 출력할 수 있다.
		//System.out.println(grade2.getAvg()); // grade부분을 사람이름(성적표)로 대입하면 이해 쉬
		//System.out.println(grade2.getGrade);
	}

}
