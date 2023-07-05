import java.util.HashSet;
import java.util.Set;

class Num {
   private int num;
   public Num(int n) { num = n; }

   @Override
   public String toString() { return String.valueOf(num); }

   @Override
   public int hashCode() {
	   System.out.println("해시코드 호출 ");
      return num % 3; // num의 값이 같으면 부류도 같다.
   }

   @Override
   public boolean equals(Object obj) {   // num의 값이 같으면 true 반환 
	   System.out.println("이퀄즈 호출 ");
      if(num == ((Num)obj).num)
         return true;
      else
         return false;
   }
}

public class Java_07_hashset {
	public static void main(String[] args) { 
		Set<Num> set = new HashSet<>();
		
		set.add(new Num(3)); //sout출력값을 add 함수가 호출함 
		set.add(new Num(3));
		set.add(new Num(2));
		
		System.out.println(set.size());
	}
}
