class BankAccount {
	int balance =0; //예금잔액
	
	public int deposit(int amount) { // 예금 
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) { //출금 
		balance -= amount;
		return balance;
	}
	
	public int checkMyBalance() { // 잔액조회 
		System.out.println("잔액 : " + balance);
		return balance;
	}	
}

public class Java_01 {
	public static void main(String[] args) {
		String name = "홍길동"; // 참조형데이터 String + name에 주소값이 들어감 
		
		String str1 = "HAPPY";
		String str2 = "BD";
		System.out.println(str1 + " " + str2);
		
		//BankAccount ref;
		//ref = new BankAccount(); // 주소값 들어감 
		//ref = null; // 관계 끊음 (주소값이 사라짐) 
		
		BankAccount ref = new BankAccount();
//		BankAccount	ref2 = ref1;
		
//		//각 인스턴스를 대상으 예금을 진행
//		ref1.deposit(3000); 
//		ref2.deposit(2000);
//		
//		// 각 인스턴스를 대상으로 출금을 진행
//		ref1.withdraw(400); // 5000-400
//		ref2.withdraw(300); // 4600-300
//		
//		// 각 인스턴스를 대상으로 잔액 조회
//		ref1.checkMyBalance();
//		ref2.checkMyBalance();

		
		ref.deposit(3000);
		ref.withdraw(300);
		check(ref); // '참조 값'의 전달 
	}
	
	//매개변수 = 파라미터
	public static void check(BankAccount acc) {  // acc = ref
		acc.checkMyBalance();
	}
}
