class A {
	public void a() {
		System.out.println("함수 a ");
	}
	
	public void a(int a) { //함수 오버로딩 
		System.out.println("함수 a" + a);
	}
	
	public void a(double a) {  
		System.out.println("함수 a" + a);
	}
	
	public void a(int a, int b) {
		System.out.println("함수 a" + (a + b));
	}
}
//생성자의 오버로딩 
class Person {
	private int regiNum; // 주민등록번호
	private int passNum; // 여권번호
	
	Person(int rnum, int pnum) {
		regiNum = rnum; // this. 생략 한거임 
		passNum = pnum;
	}
	
	Person(int rnum) {
		regiNum = rnum; //this(rnum, 0); -> 자기 자신의 변수또는 함수 호출 (this 생성자) 
		passNum = 0;
		
	}
	void showPersonalInfo() {
	    	System.out.println("주민등록 번호: " + regiNum);
	        if(passNum != 0)
	            System.out.println("여권 번호: " + passNum + '\n');
	        else
	            System.out.println("여권을 가지고 있지 않습니다. \n");
	}
}

public class Java_02_over {

	public static void main(String[] args) {
	
		A a = new A();
		a.a();
		a.a(7);
		a.a(7,3);
		a.a(10.0);

		System.out.println(100); //int
		System.out.println(true);  //boolean
		System.out.println(10.0); //double 등... 데이터타입이 있는 
		System.out.println(a); // 출력 : a@주소값 
		System.out.println("아아"); // String
		
		
		//여권 있는 사람의 정보를 담은 인스턴스 생성
		Person jung = new Person(335577, 112233);
		
		// 여권없는 사람의 정보를 담은 인스턴스 생성
		Person hong = new Person(775544);
		
		jung.showPersonalInfo();
		hong.showPersonalInfo();
		

	}

}
