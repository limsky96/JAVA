class AA{
	
	public void aa() {
		System.out.println("aa 함수 입니다.");
	}
	
}
class BB extends AA{
	public void bb() {
		System.out.println("bb 함수 입니다.");
	}
	
}




public class Java_01_polymorphysm {
	public static void main(String[] args) {
		AA aa = new AA();
		System.out.println(aa);
		
		BB bb = new BB();
		System.out.println(bb);
		bb.aa();
		
		AA aaa = new BB(); // 에러 안 남
		aaa.aa();
		//aaa. bb(); 에러 
		
		//BB bbb = new AA(); // 에러 
	}
}
