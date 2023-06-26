import java.util.Scanner;

class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
	}
}

public class Java_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rectangle[] rectangles = new Rectangle[2];

		 for (int i = 0; i < rectangles.length; i++) {
	            System.out.print("사각형 #" + (i + 1) + "의 가로 길이를 입력하세요: ");
	            int width = scanner.nextInt();
	            System.out.print("사각형 #" + (i + 1) + "의 세로 길이를 입력하세요: ");
	            int height = scanner.nextInt();

	            rectangles[i] = new Rectangle(width, height);
	        }

	        int totalArea = 0;
	        for (int i = 0; i < rectangles.length; i++) {
	            totalArea += rectangles[i].getArea();
	        }
		
		
		//////
//        rectangle[0] = new Rectangle(40, 50);
//        rectangle[1] = new Rectangle(20, 50);
//
//        int totalArea = 0;
//        for (int i = 0; i < rectangle.length; i++) {
//            totalArea += rectangle[i].getArea();
//        }

        System.out.println("사각형의 총 넓이: " + totalArea);
    }
}

