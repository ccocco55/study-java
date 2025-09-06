package list.task.food;

import java.util.Scanner;

import list.task.DBConnecter;

public class Order {
	public static void main(String[] args) {
		Food food = new Food();
		Restaurant restaurant = new Restaurant();

		Scanner sc = new Scanner(System.in);
		String temp = null;
		String menu = null;
		String type = null;
		String choiceMessage = " 1. 음식 추가 \n 2. 음식의 분류 조회 \n 3. 분류안 음식 전체 조회 \n 4. 음식 분류 수정 \n 5. 분류안 음식 개수 조회 \n 6. 종료";
		String searchMessage = "찾고싶은 음식이름을 입력하세요.";
		String nameRearch = "찾고싶은 분류의 음식이름을 입력하세요.";
		String redefineMessage = "변경 할 음식 이름을 입력해주세요.";
		String redefineMessage2 = "변경 할 분류를 입력해주세요";
		String checkNumberMessage = "개수를 알고싶은 분류를 입력해주세요.";
		int price = 0;
		int choice = 0;

//		while (true) {
//			System.out.println(choiceMessage);
//			choice = sc.nextInt();
//			if (choice == 6) {
//				break;
//			}
//			switch (choice) {
//			case 1: {
//				System.out.println("추가 할 음식의 이름 :");
//				menu = sc.next();
//
//				System.out.println("가격 :");
//				price = sc.nextInt();
//
//				System.out.println("음식 종류 :");
//				type = sc.next();
//				restaurant.addFood(new Food(menu, price, type));
//				break;
//			}
//			case 2: {
//				System.out.println(searchMessage);
//				menu = sc.next();
//				temp = restaurant.searchByType(menu);
//				if (temp != null) {
//					System.out.println(temp);
//
//				} else {
//					System.out.println(menu + "안 메뉴가 없습니다.");
//				}
//				break;
//			}
//			case 3: {
//
//				System.out.println(nameRearch);
//				type = sc.next();
//				temp = restaurant.getTypeByName(type);
//				if (temp != null) {
//
//					System.out.println(temp);
//				} else {
//					System.out.println(type + "안 메뉴가 없습니다.");
//
//				}
//				break;
//			}
//			case 4: {
//				System.out.println(redefineMessage);
//				menu = sc.next();
//				if (menu != null) {
//					System.out.println(redefineMessage2);
//					type = sc.next();
//					
//					System.out.println(restaurant.redefine(menu, type));
//					
//				}
//				else {
//					System.out.println("메뉴가 등록 되어있지 않습니다.");
//				}
//
//			}
//			break;
//			case 5: {
//				System.out.println(checkNumberMessage);
//				type = sc.next();
//
//				System.out.println(restaurant.checkNumber(type) + "개 입니다.");
//			}
//				break;
//			}

	}

}
