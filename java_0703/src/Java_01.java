import java.util.ArrayList;
import java.util.List;

public class Java_01 { // 1부터 10까지의 합 

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
        int sum = 0;
        
        for (int i = 1; i <= 10; i++) {
        	num.add(i); // i값을 num list에 추가 
            sum += i;
        }
        //int sum=0;
        //for (Integer num : num) {
        //sum = sum+num;
        //sout(num); 해도 출력됨 
        System.out.println(sum);
	}

}
