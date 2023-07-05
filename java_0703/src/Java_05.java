import java.util.Iterator;
import java.util.LinkedList;

public class Java_05 { //기본 자료형 데이터의 저장과 참조


	public static void main(String[] args) {
		   LinkedList<Integer> list = new LinkedList<>();
		   list.add(10);    // 저장 과정에서 오토 박싱 진행
		   list.add(20); 
		   list.add(30); 
		   
		   int n;
		   for(Iterator<Integer> itr = list.iterator(); itr.hasNext(); ) {//증감자 없어서 바로 앞으로 옴 itr.hasNext();에서 f/t체크  
		      n = itr.next();    // 오토 언박싱 진행
		      System.out.print(n + "\t");
		   }
		   System.out.println();


	}

}
