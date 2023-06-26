//new 객체를 생성하면 초기화 = 기본값을 가진다.
public class Java_01 {
	
	static int sumOfAry(int[] ar) {
		int sum = 0;
		for(int i=0; i<ar.length;i++)
			sum += ar[i];
		return sum;
	}
	
	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 5, 6, 7}; // = new Int[7]; ar[0] = 1.....
		int sum = sumOfAry(ar);
		
		System.out.println(sum);
		
		double e = 3.141517;
		System.out.println(e);
		
	
	}


	static int[] makeNewIntAry(int len) {
		int[] ar = new int[len];
		return ar;
		}
}
