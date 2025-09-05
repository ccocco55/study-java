package list.task.food;

import java.util.ArrayList;

import list.task.DBConnecter;

public class Restaurant {
//	- 음식 추가
	public void insert(Food food) {
		DBConnecter.foods.add(new Food(food));
	}
	
//	- 음식 이름으로 음식 종류 조회
	public String findKindByName(String name) {
		for (Food food : DBConnecter.foods) {	// Food클래스에 food부터 DBConnecter에 foods가 들어 있는 수 만큼 비교 
			if(food.getName().equals(name)) {	// food에 이름과 사용자가 입력한 이름 같은지
				return food.getKind();	// 같으면 음식 종류 리턴
			}
		}
		return null;
	}
	
	
//	- 사용자가 원하는 종류의 음식 전체 조회
	public ArrayList<Food> findAllByKind(String kind){
		ArrayList<Food> foundFoods = new ArrayList<Food>();
		for (Food food: DBConnecter.foods) {
			if(food.getKind().equals(kind)) {	// food 안에 들어있는 종류와 사용자가 입력한 종류가 같은지 검사
				foundFoods.add(new Food(food));	// 같으면 foundFoods 배열 안에 같은 종류의 음식 추가
			}
		}
		
		return foundFoods;
	}
	
//	- 음식 종류 수정 후 가격 10% 상승
	public void update(Food food) {
		for (Food foundFood : DBConnecter.foods) {
			if(foundFood.getName().equals(food.getName())) {
				foundFood.setKind(food.getKind());	// 음식 종류 수정
				foundFood.setPrice((int)(foundFood.getPrice() * 1.1));	// 음식 가격 10프로 상승
			}
		}
	}
	
//	- 사용자가 원하는 종류의 음식 개수 조회
	public int getCountByKind(String kind) {
//		int count = 0;
		ArrayList<Food> foods = new ArrayList<Food>();
		for (Food food : DBConnecter.foods) {
			if(food.getKind().equals(kind)) {
//				count++;
				foods.add(food);	// 카운트로 안세고 foods에 담기
			}
		}
//		return count;
		return foods.size();	// foods에 크기 리턴
	}
}













