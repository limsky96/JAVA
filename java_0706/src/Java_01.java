class Account {
	int balance = 1000;
	
	public void withdraw(int money) {
		if(balance >= money) {
			try { Thread.sleep(10000);}catch(Exception e) {}
			balance -= money;
		}
	}//withdraw
}

class RunnableEx24 implements Runnable{
	Account acc = new Account();
	
	public void run() {
		while(acc.balance>0) {
			//100, 200, 300 중의 한 값을 임의로 선택해서 출급(withdraw_
			int money = (int)(Math.random()*3+1)*100;
			acc.withdraw(money);
			System.out.println("Balance:"+acc.balance);
		}
	} //run
}


public class Java_01 { // 동기화 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
