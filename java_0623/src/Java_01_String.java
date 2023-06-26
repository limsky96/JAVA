
public class Java_01_String {

	public static void main(String[] args) {
		// 문자열
		String str1 = "Coffee";
		String str2 = "Bread";
		
		String str3 = str1.concat(str2);
		System.out.println(str3);
		
		String str4 = "Fresh".concat(str3); // Coffee, Bread, Fresh 와 같은 변수를 리터럴이라 함  
		System.out.println(str4);

		// Lexicographically
		String st1 = "Lexicographically";
		String st2 = "lexicographically";
		int cmp;
		   
		if(st1.equals(st2))
		   System.out.println("두 문자열은 같습니다.");
		else
		   System.out.println("두 문자열은 다릅니다.");
		   
		cmp = st1.compareTo(st2); // 사전 순 
		if(cmp == 0)
		   System.out.println("두 문자열은 일치합니다.");
		else if (cmp < 0) // cmp < 0 이면 사전 앞, 크면 뒤 
		   System.out.println("사전의 앞에 위치하는 문자: " + st1);
		else
		   System.out.println("사전의 앞에 위치하는 문자: " + st2);
		   
		if(st1.compareToIgnoreCase(st2) == 0) // case를 무시하고 비교 
		   System.out.println("두 문자열은 같습니다."); // 당연히 같다 !
		else
		   System.out.println("두 문자열은 다릅니다.");

		// valueOf 
		double e = 2.718281;
		String se = String.valueOf(e);

		// 문자열 "123"이 저장된 인스턴스의 생성
		StringBuilder stbuf = new StringBuilder("123");
			   
		stbuf.append(45678);   // 문자열 덧붙이기
		System.out.println(stbuf.toString());
			   
		stbuf.delete(0, 2);    // 문자열 일부 삭제
		System.out.println(stbuf.toString());
			   
		stbuf.replace(0, 3, "AB");    // 문자열 일부 교체
		System.out.println(stbuf.toString());

		stbuf.reverse();    // 문자열 내용 뒤집기
		System.out.println(stbuf.toString());

		String sub = stbuf.substring(2, 4);  // 일부만 문자열로 반환
		System.out.println(sub);

		
	}

}
