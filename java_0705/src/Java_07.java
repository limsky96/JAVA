
class Account{
   int balance = 1000;
   
   public void withdraw(int money) {
      if(balance >= money) {
         try {Thread.sleep(1000); //sleep : 해당 프로그램을 멈춘다
         } catch (InterruptedException e) {      
            e.printStackTrace();
         }
         balance = balance - money;
      }
   }
}

class RunnableAccount implements Runnable{
   Account acc = new Account();
   
   @Override
   public void run() {
      while(acc.balance > 0) {
         //100,200,300 중의 하나 값을 임으로 선택해서 출굼
         int money = (int)(Math.random()*3+1)*100; //3개랜덤뽑기하면 123 나오니까 100곱해주기
         acc.withdraw(money);
         System.out.println("balance:" + acc.balance);
      }
      
   }
}

public class Java_07 {

	public static void main(String[] args) {
		Runnable r = new RunnableAccount();
		
		Thread t1 = new Thread(r, "첫번째");
		Thread t2 = new Thread(r,"두번째");
		
		t1.start();
		t2.start();
		
//마이너스 값이 나오는 이유 : t1이 시작함과 동시에 t2도 시작해서 충돌 ?
	}

}
