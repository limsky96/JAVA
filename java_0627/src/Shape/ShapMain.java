package Shape;

import Shape.Circle;
import Shape.Shape;
import Shape.Rectangle;

class Price{
	double price = 0;
	Price(double price){
		this.price = price;
	}
}

class Computer extends Price{
	public Computer(double price) {
		super(price);
	}
	
}
// 인터페이스 안에 올 수 있는 것은 함수 구현(x) -> 추상 메소드와 상수만 ! 
// 인터페이스는 단독으로 쓰이는 것이 아닌 자손이 구현하는 .. 

//인터페이스를 사용하는 이유 
//1. 선배들이 사용(표준 = 강제 = 규약 = 프린트드라이버)
//2. 다중 상속 지원
interface Printable{
	abstract public void print(String doc); // 함수 선언 = 함수 정의 = abstract = 추상메소드 

	public abstract void move();
}

interface Movable{
	abstract public void move();
}


class Printer implements Printable, Movable{ // implements = 구현 하다 + interface 명이 뒤에 옴 
	
	@Override
	public void print(String doc) {
		System.out.println(doc);
	}
	 @Override
	 public void move() {
		 System.out.println("움직입니다.");
	 }

}

public class ShapMain {

	public static void main(String[] args) {
		Printable printer = new Printer(); // interface도 다형성 적용됨, 독 객체생성안댐 기본적인 구현이 없어서 
		printer.move();
		printer.print("ddd");
		
		
		Shape[] shape = {new Circle(10), new Rectangle(10,20)};
		
		//
		double area = 0;
		for(Shape s : shape) {
			area = area +s.getArea();
		}
		System.out.println(area);
		
	}

}

