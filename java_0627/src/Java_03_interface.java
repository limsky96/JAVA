
interface Printable{
   public void print(String doc);
}

interface Movable{
   public void move();
}

class Printer implements Printable, Movable{

   @Override
   public void move() {
      System.out.println("움직입니다..");
   }

   @Override
   public void print(String doc) {
      System.out.println(doc);
   }
   
}


class SamsungPrinter implements Printable{
   @Override
   public void print(String doc) {
      System.out.println("삼성 프린터 " + doc + " 프린트 되었습니다.");
   }
}

class LGPrinter implements Printable{
   @Override
   public void print(String doc) {
      System.out.println("LG 프린터 " + doc + " 프린트 되었습니다.");
   }
}

// 협업 = 외주
interface ICalculator {  
	abstract public int add(int num1, int num2);
	abstract public int sub(int num1, int num2);
	abstract public int mul(int num1, int num2);
	abstract public int div(int num1, int num2);
}

class Calculator implements ICalculator{
	@Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int div(int num1, int num2) {
        return num1 / num2;
    }
}

//추상 클래스와 인터페이스의 차이


//interface = abstract =  자식이 구현하라 
abstract class House{
	abstract public void build2();
	
	public void build() {
		System.out.println("집을 짓습니다.");
	}
}
class House2 extends House{
	@Override
	public void build2() {
		System.out.println("집을 짓습니다.2");
	}
}

public class Java_03_interface {
    public static void main(String[] args) {
    	
    	House2 house = new House2();
    	house.build2();
    	
    	
    	 Printer printer = new Printer();
//       printer.move();
//       printer.print("아아아");
       
//       SamsungPrinter samsung = new SamsungPrinter();
//       samsung.print("안녕하세요.");
//       
//       LGPrinter lg = new LGPrinter();
//       lg.print("안녕하세요.");
       Printable printer1 = new SamsungPrinter();
       printer1.print("프린트 합니다.");


        // ICalculator 인터페이스 사용
        ICalculator calculator = new Calculator();

        int add = calculator.add(3, 5);
        int sub = calculator.sub(7, 2);
        int mul = calculator.mul(4, 6);
        int div = calculator.div(9, 3);

        System.out.println("덧셈 결과: " + add);
        System.out.println("뺄셈 결과: " + sub);
        System.out.println("곱셈 결과: " +mul);
        System.out.println("나눗셈 결과: " + div);
    }
}