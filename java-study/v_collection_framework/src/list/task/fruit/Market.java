package list.task.fruit;

import java.util.ArrayList;

import list.task.DBConnecter;

public class Market {
//   - 과일 추가
   public void insert(Fruit fruit) {
      DBConnecter.fruit.add(new Fruit(fruit));	// DBConnecter에 과일 추가
   }

//   - 과일 삭제
   public void remove(String name) {
      for (int i = 0; i < DBConnecter.fruit.size(); i++) {
         if(DBConnecter.fruit.get(i).getName().equals(name)) {
            DBConnecter.fruit.remove(i);	// 사용자가 찾은 과일 DBC에서 삭제
         }
      }
   }
//   - 과일 가격이 평균 가격보다 낮은 지 검사
   public boolean checkPrice(int price) {
      int total = 0;
      double average = 0.0;
      
      for (int i = 0; i < DBConnecter.fruit.size(); i++) {
         total += DBConnecter.fruit.get(i).getPrice();	// 전체 과일 가격 
      }
      average = (double)total / DBConnecter.fruit.size();	// 전체 과일의 평균 가격 구하기
      
      return average < price;	// 평균보다 비싼지 안비싼지 리턴
   }
   
//   - 과일 전체 조회
   public ArrayList<Fruit> findAll(){
      ArrayList<Fruit> fruits = new ArrayList<Fruit>();
      
      for (int i = 0; i < DBConnecter.fruit.size(); i++) {
         fruits.add(new Fruit(DBConnecter.fruit.get(i)));
      }
      
      return fruits;
   }
   
//   - 과일 이름으로 가격 조회
   public int findPriceByName(String name) {
//      빠른 for문 / forEach문 / 향상된 for문
      for (Fruit fruit: DBConnecter.fruit) {
         if(fruit.getName().equals(name)) {
            return fruit.getPrice();
         }
      }
      
      return -1;	// 과일이 없으면 -1 리턴
   }
}
















