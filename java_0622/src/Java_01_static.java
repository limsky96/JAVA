// 1. 먼저(new 객체생성보다) 한 번 올려 공유 ( method area 에 ) 
class InstCnt{ //인스턴스
	static int instNum =0; // 클래스 변수 (static변수) 
	
	InstCnt() { //생성자
		instNum++;
		System.out.println("인스턴스 생성 : " + instNum);
	}
}

class AccessWay{ // 접근 방법 
	static int num =0;
	
	AccessWay() {incrCnt();}
	void incrCnt() {
		num++; // 클래스 내부에서 이름을 통한 접근 
	}
}

//static sum 예제 
class Accumulator {
	private static int sum =0;
	
	public static void add(int i) {
		sum = sum + i;
	}
	public static void showResult() {
		System.out.println("sum = " + sum);
			
	}

}





public class Java_01_static {

	public static void main(String[] args) {
//		InstCnt cnt1 = new InstCnt(); // 2. InstCnt 를 한 번 쭈욱 스캔 (static있는 지 체크함)
//		InstCnt cnt2 = new InstCnt();
//		InstCnt cnt3 = new InstCnt();
		System.out.println(InstCnt.instNum++);
		System.out.println(InstCnt.instNum);
		
		AccessWay way = new AccessWay();
		way.num++; // 1) 외부에서 인스턴스의 이름을 통한 접근 
		AccessWay.num++; // 2) 외부에서 클래스의 이름을 통한 접근 -> 클래스 변수 사용 ! ( 1)보다 더 좋음 )
		System.out.println("num = " + AccessWay.num);
		
		// sum = 55
		Accumulator acc = new Accumulator();
		
		for(int i= 0; i<= 10; i++) {
			acc.add(i);
		}
	     acc.showResult();
		
	}

}
