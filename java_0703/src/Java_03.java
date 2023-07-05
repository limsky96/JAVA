import java.util.ArrayList;
import java.util.List;

public class Java_03 {  // 원 총넓이의 합 

	public static void main(String[] args) {
		List<Double> radius1 = new ArrayList<>();
        radius1.add(10.0);
        radius1.add(20.0);
        radius1.add(30.0);
        double total = 0.0;
        
        for (double radius : radius1) {
            double area = Math.PI * radius * radius;
            System.out.println("반지름: " + radius + ", 넓이: " + area);
            total += area;
        }
        
        System.out.println("총 넓이 : " + total);

	}

}
