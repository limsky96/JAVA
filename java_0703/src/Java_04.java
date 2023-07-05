import java.util.ArrayList;
import java.util.List;

public class Java_04 {

	public static void main(String[] args) {
		//반지름 1~10 의 총 넓이의 합  
		  List<Double> radiius = new ArrayList<>();
	        
	        for (int radius = 1; radius <= 10; radius++) {
	            radiius.add((double) radius);
	        }
	        
	        double total = 0.0;
	        
	        for (double radius : radiius) {
	            double area = Math.PI * radius * radius;
	            total += area;
	        }
	        
	        System.out.println("총 넓이 : " + total);

	}

}
