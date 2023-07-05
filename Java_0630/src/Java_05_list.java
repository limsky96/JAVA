import java.util.ArrayList;		// 배열 기반 자료구조이지만 공간의 확보 및 확장은 
import java.util.LinkedList;
import java.util.List;			// ArrayList 인스턴스가 스스로 처리한다.


class MyLinkedList {
	int num;
	MyLinkedList myLinkedList;
	

	}



public class Java_05_list {

	public static void main(String[] args) {
		
		MyLinkedList my1 = new MyLinkedList();
		my1.num = 10;
		
		MyLinkedList my2 = new MyLinkedList();
		my1.num = 11;
		my2.myLinkedList = my2;
		
		
		
		my2.myLinkedList=new MyLinkedList();
		my2.num = 13;
		
//		List<String> list = new ArrayList<>(); // 컬렉션 인스턴스 생성
//		   
//		   // 컬렉션 인스턴스에 문자열 인스턴스 저장
//		   list.add("Toy");
//		   list.add("Box");
//		   list.add("Robot");
//
//		   // 저장된 문자열 인스턴스의 참조
//		   for(int i = 0; i < list.size(); i++)
//		   System.out.print(list.get(i) + '\t');
//		   
//		  for (String str : list) {
//			  System.out.println(str+ '\t'); // 전체를 할 땐 인핸스드 for문이 나음  
//		  }
//		   
//		   System.out.println();
//
//		   list.remove(0); // 첫 번째 인스턴스 삭제
//
//		   // 첫 번째 인스턴스 삭제 후 나머지 인스턴스들을 참조
//		   for(int i = 0; i < list.size(); i++)
//		      System.out.print(list.get(i) + '\t');
//		   System.out.println();
//
//		  // 배열 기반 자료구조이지만 공간의 확보 및 확장은 
//		  // ArrayList 인스턴스가 스스로 처리한다.
		
		
		List<String> list = new LinkedList<>();    // 유일한 변화!!!
		   
		   // 컬렉션 인스턴스에 문자열 인스턴스 저장
		   list.add("Toy");
		   list.add("Box");
		   list.add("Robot");

		   // 저장된 문자열 인스턴스의 참조
		   for(int i = 0; i < list.size(); i++)
		      System.out.print(list.get(i) + '\t');
		   System.out.println();

		   list.remove(0); // 첫 번째 인스턴스 삭제

		   // 첫 번째 인스턴스 삭제 후 나머지 인스턴스들을 참조
		   for(int i = 0; i < list.size(); i++)
		      System.out.print(list.get(i) + '\t');
		   System.out.println();


	}

}
