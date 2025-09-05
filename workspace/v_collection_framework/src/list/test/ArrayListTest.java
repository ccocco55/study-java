package list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListTest {

   public static void main(String[] args) {
//      <?>: 제네릭(이름이 없는)
//      객체화 시 타입을 지정하는 기법
//      자료구조를 설계할 때 데이터의 타입을 지정할 수 없기 때문에 임시로 타입을 선언하다.
//      따로 다운 캐스팅할 필요가 없으며, 지정할 타입에 제한을 줄 수 있기 때문에 Object가 아닌 제네릭으로 선언한다.
      ArrayList<Integer> datas = new ArrayList<Integer>();
      
      datas.add(40);
      datas.add(50);
      datas.add(90);
      datas.add(70);
      datas.add(10);
      datas.add(80);
      datas.add(60);
      datas.add(30);
      datas.add(20);
      
      System.out.println(datas.toString());
      System.out.println(datas.size());
      
//      정렬
      Collections.sort(datas);
      System.out.println(datas);
      
//      가운데를 기준으로 좌우 바꾸기
      Collections.reverse(datas);
      System.out.println(datas);
      
//      요소 랜덤하게 섞기
      Collections.shuffle(datas);
      System.out.println(datas);
      
//      추가(삽입), 60을 30뒤에 삽입한다.
//      int index = datas.indexOf(30);
//      if(index != -1) {
//         datas.add(index + 1, 60);
//         System.out.println(datas);
//      }else {
//         System.out.println("찾는 데이터가 없습니다.");
//      }
      
//      수정, 10을 1로 수정한다.
//      int index = 0;
//      if(datas.contains(10)) {
//         index = datas.indexOf(10);
//         System.out.println(datas.set(index, 1) + "이 1로 수정되었습니다.");
//         System.out.println(datas);
//      }
      
//      삭제(값으로 삭제), 20을 삭제한다.
      if(datas.remove(Integer.valueOf(20))) {
         System.out.println("삭제완료");
         System.out.println(datas);
      }
      
//      삭제(인덱스로 삭제), 50을 삭제한다.
      int index = datas.indexOf(50);
      if(index != -1) {
         System.out.println(datas.remove(index) + " 삭제 완료");
         System.out.println(datas);
      }
   }
}
