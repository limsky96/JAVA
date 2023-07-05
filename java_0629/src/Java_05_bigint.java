import java.math.BigDecimal;
import java.math.BigInteger;

public class Java_05_bigint {
	public static void main(String[] args) {
		   // long형으로 표현 가능한 값의 크기 출력
		   System.out.println("최대 정수: " + Long.MAX_VALUE);
		   System.out.println("최소 정수: " + Long.MIN_VALUE);
		   System.out.println();

		   // 매우 큰 수를 BigInteger 인스턴스로 표현
		   BigInteger big1 = new BigInteger("100000000000000000000");
		   BigInteger big2 = new BigInteger("-99999999999999999999");

		   // BigInteger 기반 덧셈 연산
		   BigInteger r1 = big1.add(big2);
		   System.out.println("덧셈 결과: " + r1);

		   // BigInteger 기반 곱셈 연산
		   BigInteger r2 = big1.multiply(big2);
		   System.out.println("곱셈 결과: " + r2);
		   System.out.println();

		   // 인스턴스에 저장된 값을 int형 정수로 반환
		   int num = r1.intValueExact();
		   System.out.println("From BigInteger: " + num);
		   
		   // 정수연산 ( 잘 ㅏㅇㄴ씀) 
		   BigDecimal d1 = new BigDecimal("1.6");
		   BigDecimal d2 = new BigDecimal("0.1");
		   System.out.println("덧셈 결과: " + d1.add(d2));
		   System.out.println("곱셈 결과: " + d1.multiply(d2));
		   
		   
		   System.out.println("로그 25: " + Math.log(25));
		   System.out.println("2의 16승: "+ Math.pow(2, 16)); // pow : 16승 

		}
		
//	덧셈 		public BigDecimal add(BigDecimal augend)
//	뺄셈 		public BigDecimal subtract(BigDecimal subtrahend)
//	곱셈 		public BigDecimal multiply(BigDecimal multiplicand)
//	나눗셈 	public BigDecimal divide(BigDecimal divisor)

}
