package edu.global.ex;

//빈 = 데이터 멤버에 대한 getter, setter + 디폴트 생성자
public class Circle {
	  static final double PI = 3.1415;
      private double radius;

      public Circle() { // 얘를 빼먹으면 절대 ! 안됨 !! 디폴트 생성자가 있어야 빈에서 에러가 안남 !!
    	  
      }
    
      public Circle(double rad) { //초기화 시키기 위한 생성자 만듦
         radius = rad;
      }
      
      public double getRadius() {
      return radius;
	   }
	
	   public void setRadius(double radius) {
	      this.radius = radius;
	   }      
      

      public void showPerimeter() {
         double peri = (radius * 2) * PI;
         System.out.println("둘레: " + peri);
      }

      public double getArea() {
         double area = (radius * radius) * PI;
         return area;
      }
      
	
	   public static double getPi() {
	      return PI;
	   }
   }