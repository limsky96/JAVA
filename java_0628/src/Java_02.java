import java.util.Scanner;

// 에러처리 / 예외처리
// 1. Try catch finally
// 2.throws
public class Java_02 {

	public static void main(String[] args) {
		//예외처리 
		Scanner sc = new Scanner(System.in);
		
		
		// try catch finally 
		try {
			int num = sc.nextInt();
			System.out.println(num);
//			System.out.println(3/0);
		}catch (Exception e) {
			// TODO : handle exception
			System.out.println("캐치 안 입니다."); // 에러 있으면 출력~ 
		} finally {
			System.out.println("파이널리 입니다."); // 에러가 없으면 출력~ 캐치 건너뜀 
		}
		
		System.out.println("프로그램을 종료 입니다.");
		
		
		
//	      Person kim = new Person("홍길동",35);
//	      Person park = new Person("홍길동",35);
//	      Person heo = new Person("홍길동",34);
//	      
//	      if(kim.equals(park))
//	         System.out.println("같은 사람입니다.");
//	      else
//	         System.out.println("다른 사람입니다.");
//	      
//	      if(kim.equals(heo))
//	         System.out.println("같은 사람입니다.");
//	      else
//	         System.out.println("다른 사람입니다.");
//	      
//	}
//}
//
//class Person {
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//
//        if (obj == null || getClass() != obj.getClass()) {
//            return false;
//        }
//
//        Person otherPerson = (Person) obj;
//
//        return name.equals(otherPerson.getName()) && age == otherPerson.getAge();
    }
}