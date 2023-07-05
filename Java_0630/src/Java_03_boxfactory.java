class BoxFactory {
   public static <T> Box<T> makeBox(T o) {
      Box<T> box = new Box<T>();   // 상자를 생성하고,
      box.set(o);   // 전달된 인스턴스를 상자에 담아서,
      return box;   // 상자를 반환한다.
   }
}

public class Java_03_boxfactory {

	public static void main(String[] args) {
		
		Box<String> sBox = BoxFactory.<String>makeBox("Sweet");
		System.out.println(sBox.get());
		
		Box<Double> dBox = BoxFactory.<Double>makeBox(7.59);   // 7.59에 대해 오토 박싱 진행됨
		System.out.println(dBox.get());
		
//		Box<String> sBox1 = BoxFactory.makeBox("Sweet");
//		Box<Double> dBox1 = BoxFactory.makeBox(7.59);       // 7.59에 대해 오토 박싱 진행됨

	}

}
