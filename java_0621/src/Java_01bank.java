class BankAccount1 {
//	String accNumber;// 계좌번호
//	String ssNumber; // 주민번호
//	int balance; // 예금잔액
	int balance =0; //초기화 목
	
	BankAccount1(){
		System.out.println("생성자시작");} // 생성자 함수 (디폴트 생성자 = 컴파일러가 개발자가안넣게 되면 기본적으로 넣음)
	
	BankAccount1(int balance){
		this.balance = balance;
		System.out.println("생성자 시작2");
	}
	
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }    

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() {
        System.out.println("잔액 : " + balance);
        return balance;
    }
}

public class Java_01bank {
	
	   public static void check(BankAccount acc) {
	        acc.checkMyBalance();
	    }
	public static void main(String[] args) {
//		BankAccount yoon = new BankAccount(); //계좌 생성
//		yoon.initAccount("12-34-89", "990990-9090990", 10000);
	BankAccount1 ref = new BankAccount1();
	BankAccount1 ref2 = new BankAccount1(2000);
	}
}

//public void initAccount(String acc, String ss, int bal) { // 생성자 
//	accNumber = acc;
//	ssNumber = ss;
//	balance = bal; // 계좌 개설시 예금액으로 초기화 
//}