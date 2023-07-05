class Box<T> {
   private T ob;

   public void set(T o) {
      ob = o;
   }

   public T get() {
      return ob;
   }
}

class Apple {
    public String toString() {
        return "I am an apple.";
    }    
}

class Orange {
    public String toString() {
        return "I am an orange.";
    }
}

// 제네릭이 데이터타입을 파라미터화 시킴 
class DBox<L, R> {
	   private L left;   // 왼쪽 수납 공간
	   private R right;   // 오른쪽 수납 공간

	   public void set(L o, R r) {
	      left = o;
	      right = r;
	   }

	   @Override
	   public String toString() {
	      return left + " & " + right;
	   }
	}


// 제네릭 = 타입을 컴파일 시점에서 미리 정하는 것 
public class Java_01 {

	public static void main(String[] args) {
		   Box<Apple> aBox = new Box<Apple>();    // T를 Apple로 결정
		   Box<Orange> oBox = new Box<Orange>();    // T를 Orange로 결정

		   aBox.set(new Apple());   // 사과를 상자에 담는다.
		   oBox.set(new Orange());   // 오렌지를 상자에 담는다.
		   
		   Apple ap = aBox.get();   // 사과를 꺼내는데 형 변환 하지 않는다.
		   Orange og = oBox.get();   // 오렌지를 꺼내는데 형 변환 하지 않는다.

		   System.out.println(ap);
		   System.out.println(og);


		   
		   
		   DBox<String, Integer> box = new DBox<String, Integer>();
		   box.set("Apple", 25);
		   System.out.println(box);
		   box.set("Orange", 33);
		   System.out.println(box);
	}

}
