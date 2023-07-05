import java.util.ArrayList;
import java.util.List;

public class Java_02 { // spring, summer, fall, winter을 리스트에 넣어 글자의 총 합 

	public static void main(String[] args) {
		List<String> season = new ArrayList<>();
		
        season.add("spring");
        season.add("summer");
        season.add("fall");
        season.add("winter");
        int total = 0;
     
        for (String str : season) { //for(int i=0; i<strList.size();i++){
            total += str.length(); //String str = strlist.get(i);
        }						  //sum = sum + str.length();
        						 // sout(sum);
        System.out.println("글자 총 합 : " + total);

	}

}
