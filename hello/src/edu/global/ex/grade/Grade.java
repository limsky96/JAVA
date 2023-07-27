package edu.global.ex.grade;

public class Grade {
   private double kor, eng, math;

   public Grade(double kor, double eng, double math) {
      this.kor = kor;
      this.eng = eng;
      this.math = math;
   }
   
   public double getTotal() {
      return kor+eng+math;
   }
   
   public double getAvg() {
      return getTotal()/3.0;
   }
   
   public char getGrade() {
      double avg = getAvg();
      char grade= '가';
      if(avg>=90) {
         grade='수';
      } else if(avg>=80) {
         grade='우';
      } else if(avg>=70) {
         grade='미';
      } else if(avg>=60) {
         grade='양';
      } else {
         grade='가';
      }
      return grade;
   }
}
