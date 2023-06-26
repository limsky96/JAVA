

class A {
	private int a;
	
	public A() { //super(a);
		
	}
	
	public A(int a) {
		this.a= a;
	}
	
	public void aa() {
		System.out.println(a);
	}
}

//reuse 재사용하기 위해 상속이 나왔음 
class B extends A{ // 상속 
	private int b;
	
	public B(int b) {
		this.b=b;
	}

	
	//기본적으로 부모의 함수 및 변수의 접근 방법은 super=부모 
	public B(int a, int b) {
		//this.a =a;
		//super.a = a;
		super(a); // this 자기 자신 생성자 호출 , super부모 멤버변수 접근방법 (super생성자를 통해 기본적으로 접근) 
		this.b = b;
		
	}

	public void bb() {
		aa();
		this.aa();
		super.aa();
		System.out.println(b);
	}

}


public class Java_06 {

	public static void main(String[] args) {
		A a = new A(10);
		System.out.println(a.a);

		B b = new B(20, 30);
		System.out.println(b.a);
		System.out.println(b.b);
		//b.aa();  aa는 부모에 있음에도 B가 객체라서 이렇게 
		  b.aa();
	      b.bb();
	}

}
