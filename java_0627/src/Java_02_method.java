// 메소드 오버라이딩 = 상속관계에서 똑같은 함수(리턴타입, 함수이름, 파라미터 종류와 갯수)로 바디만 달리 하는 것.
class Cake {
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake {
	// cake의 yummy 메소드를 오버라이딩 함 
	public void yummy() { 
		System.out.println("Yummy Cheese Cake");
	}
}

// 다형성 + 오버라이딩 = 응용 
class Robot{
	public void work() {} // polymorphysm 적용 
}
class DanceRobot extends Robot{
	public void work() {
		System.out.println("춤추는 로봇 입니다.");
	}
}
class DrawRobot extends Robot{
	public void work() {
		System.out.println("그림을 그는 로봇 입니다.");
	}
}
class WashRobot extends Robot{
	public void work() {
		System.out.println("세탁 로봇 입니다.");
	}
}

public class Java_02_method {

	public static void main(String[] args) {
		
		Robot[] arrRobot = {new DanceRobot(), new DrawRobot(), new WashRobot()}; //다형성
		
		for(Robot robot : arrRobot) {
			robot.work();
		}
		
		
		
		
		
		Cake c1 = new CheeseCake();
		CheeseCake c2 = new CheeseCake();
		
		c1.yummy();
		c2.yummy();

	}

}
