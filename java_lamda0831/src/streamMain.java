import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

class ToyPriceInfo { // 장난감 모델 별 가격 정보
	   private String model; // 모델 명
	   private int price; // 가격

	   public ToyPriceInfo(String m, int p) {
	      model = m;
	      price = p;
	   }

	   public int getPrice() {
	      return price;
	   }
	}


public class streamMain {

   public static void main(String[] args) {
	   
	   // 배열 내에 있는 수 들의 합을 구하시오.
	   int[] arr = {1,2,3,4,5};
	   
	   int sum=0;
	   for (int i : arr) {
		sum += i;
	}
	  System.out.println(sum);
	  
	  // int를 담아놓는 Stream 객체
//	 IntStream stm1 = Arrays.stream(arr); // 데이터 {1,2,3,4,5} 
//	 IntStream stm2 = stm1.filter((n) -> n%2 ==1);
//	 sum = stm1.sum(); // 최종 연산 (한 번 쓰 소진됨)
	 
	 // 위보다는 아래를 쓰는 편 
	 sum = Arrays.stream(arr)
		   .filter((n)-> n%2 ==1)
		   .sum();
	 
	 System.out.println(sum);
	 
	 String[] names = {"yoon", "park", "lee"};
	 
	 Arrays.stream(names).forEach(s-> System.out.println(s));
	 Arrays.stream(names).forEach(System.out::println); //더블클론 
	 
	 
	 Arrays.stream(names)
	 		.filter(s -> s.length() == 3) // true라서 길이가 3인 것 'lee' 만 나옴 ! 
	 		.forEach(System.out::println);

	 System.out.println("==============================");
	 List<String> ls = Arrays.asList("box","robot","simple");
	 
	 ls.stream()
	 	.map(s-> s.length()) // box, robot, simpe 글자 수 
	 	.forEach(System.out::println);
	 
	 System.out.println("==============================");
	 
	 ls.stream()
	 	.map(s-> s.length()) 
	 	.forEach(System.out::println);	 
	 
     List<ToyPriceInfo> ls1 = new ArrayList<>();
     ls1.add(new ToyPriceInfo("GUN_LR_45", 200));
     ls1.add(new ToyPriceInfo("TEDDY_BEAR_S_014", 350));
     ls1.add(new ToyPriceInfo("CAR_TRANSFORM_VER_7719", 550));
	 
     sum = ls1.stream() // stream객체로 변경 
    		 .filter(p -> p.getPrice() < 500)
    		 .mapToInt(t -> t.getPrice())
    		 .sum();

     System.out.println(sum);
	 
	  
	 
   }

}