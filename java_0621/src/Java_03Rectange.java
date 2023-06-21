class Rectange {
		private int width, height; //접근제한자, 자기 클래스 내에서만 작용한다. 

		private int getArea() {
			return width * height;
		}
		
		public int getArea2() {
			return width*height;
		}
}


public class Java_03Rectange { // private 은 외부클래스에 작용 안 한다.

	public static void main(String[] args) {
		Rectange rec = new Rectange();
		rec.getArea2();

	}

}
