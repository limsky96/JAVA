class MyThread1 extends Thread {
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("-");
			
			String name = Thread.currentThread().get();
			System.out.println(getName());
		}
	}//run()
}

class MyThread2 extends Thread {
	public void run() {
		for(int i=0; i<3;i++) {
			System.out.println("|");
		}
	} //run()
}



public class Java_04_threadtest_multi {

	public static void main(String[] args) {
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();

	    th1.start(); // Start the first thread
        th2.start(); // Start the second thread
	}
}

