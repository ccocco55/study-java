package bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
//   화면
   
   public static void main(String[] args) {
      Bank[][] arrBank = new Bank[3][100];
      int[] arCount = new int[arrBank.length];
      String[] arBankName = { "신한은행", "국민은행", "카카오뱅크" };

      String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4. 나가기";
      String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 선택 메뉴로 돌아가기";
      Scanner sc = new Scanner(System.in);

      int bankNumber = 0, choice = 0, myBankNumber = 0;
      String account = null, password = null, phone = null, name = null;
      Bank user = null;
      int money = 0, withdrawMoney = 0, temp = 0;
      Random random = new Random();
      int passwordCheck = 0, phoneCheck = 0;

      String accountMessage = "계좌번호: ";
      String nameMessage = "예금주: ";
      String passwordMessage = "비밀번호(4자리): ";
      String phoneMessage = "핸드폰번호(- 제외): ";
      String depositMessage = "입금액: ";
      String withdrawMessage = "출금액: ";
      String errorMessage = "다시 시도해주세요.";
      String loginFailMessage = "계좌번호 혹은 비밀번호를 다시 확인해주세요.";
      
      while(true) {	// 은행 선택 while 문
         System.out.println(message);
         bankNumber = sc.nextInt();
         
         if(bankNumber == 4) {	// 은행 선택 4 선택시 나가기
            break;
         }
         
         bankNumber--;
         
         while(true) {	// 메뉴 선택 while 문 
            System.out.println(menu);
            choice = sc.nextInt();
            
            if(choice == 6) {	// 메뉴 6번 선택시 은행 선택 메뉴로 돌아가기
               break;
            }
            
            switch(choice) {
            case 1: // 계좌 개설
               
               Bank[] arBank = {new Shinhan(), new Kookmin(), new Kakao()};	// arBank에 은행 배열 만들기
               
               while(true) {
                  account = String.valueOf(random.nextInt(900000) + 100000);	// 랜덤으로 100000-999999 계좌 계설
                  account = bankNumber + account;	// 은행고유 번호 + 랜덤 계좌
                  if(Bank.checkAccount(arrBank, arCount, account) == null) {	// 계좌 중복 있는지 확인 아니면 다시 와일문 반복 후 중복 없는 계좌번호 출력
                     break;
                  }
               }
               
               System.out.println(nameMessage);
               name = sc.next();
               
               while(true) {
                  System.out.println(passwordMessage);	
                  password = sc.next();
                  passwordCheck = 0;	// 비밀번호 초기화(드래야 다음 데이터 안 쌓임)
                  
                  if(password.length() == 4) {	// 비밀번호 4자리 확인
                     for (int i = 0; i < password.length(); i++) {	// 4번 반복
                        char c = password.charAt(i);	// 비밀번호 아스키코드로 변환
                        if(c >= 48 && c <= 57) {	// 숫자 아스키코드에 포함인지 확인
                           passwordCheck++;	// 문자 1개 가 숫자일때마다 카운트 +1
                        }
                     }
                  }
                  
                  if(passwordCheck == 4) {	// 4개 다 숫자이면 끝
                     break;
                  }
               }
               
               while(true) {
                  System.out.println(phoneMessage);
                  phone = sc.next();
                  phoneCheck = 0;	// 핸드폰 번호 초기화
                  
                  phone = phone.replaceAll("-", "");	// -을 빈 공백으로 초기화 해줌
                  
                  if(phone.length() == 11) {	// 핸드폰 번호 11자리 인것 확인
                     for (int i = 0; i < phone.length(); i++) {	// 11번 반복
                        char c = phone.charAt(i);	// 숫자 아스키코드로 변환
                        if(c >= 48 && c <= 57) {	// 숫자에 포함 되는지 확인
                           phoneCheck++;	// 숫자일떄마다 +1
                        }
                     }
                     
                     if(phoneCheck == 11) {	//핸드폰 번호 11자리 다 숫자인지 확인 됐으면
                        if(Bank.checkPhone(arrBank, arCount, phone) == null) {	// 핸드폰 번호 중복 검사
                           break;	//나감
                        }
                     }
                  }
               }
               
               user = arBank[bankNumber];	// 사용자 arBank 은행번호 행에 열 담기
               
               user.setAccount(account);	// 사용자 계좌 담기
               user.setName(name);	// 사용자 이름 담기
               user.setPassword(password);	// 사용자 비밀번호 담기
               user.setPhone(phone);	// 사용자 핸드폰 번호 담기
               
               arrBank[bankNumber][arCount[bankNumber]++] = user;	// 사용자는 arrBank 배열 은행번호 행에  arCount열 은행번호번째에 담고 다음 사용자 부터는 +1
               
               System.out.println(arBankName[bankNumber] + " 가입을 진심으로 환영합니다.");
               System.out.println("고객님의 소중한 계좌번호: " + account);
               break;
            case 2: // 입금 하기
               System.out.println(accountMessage);
               account = sc.next();
               
               System.out.println(passwordMessage);
               password = sc.next();
               
               user = Bank.login(arrBank, arCount, account, password);	// 로그인
               
               if(user != null) {	// 알맞은 유저가 있다면
                  myBankNumber = user.getAccount().charAt(0) - 48;	//	유저 계좌번호 맨 첫째 자리 아이스키코드 검사 후 은행 번호 추출
                  if(myBankNumber == bankNumber) {	// 내 은행 번호와 은행 번호 같을때
                     System.out.println(depositMessage);
                     money = sc.nextInt();
                     
                     if(money > 0) {	// 0보다 돈이 많다면
                        user.deposit(money);
                        System.out.println("현재 잔액: " + user.getMoney() + "원");
                     }else {
                        System.out.println(errorMessage);
                     }
                  }else {
                     System.out.println(arBankName[myBankNumber] + " 은행에서만 입금 서비스를 이용하실 수 있습니다.");	// 내 은행번호와 은행번호가 안맞으면 입금 불가
                  }
                  
//                  현 로직에서 instanceof를 통해 고객의 은행사를 구분하는 것은 무리가 있다.
//                  그래서 계좌번호 맨 앞 숫자로 검사하는 것이 낫다.
//                  if(bankNumber == 0) {
//                     if(user instanceof Shinhan) {
//                        System.out.println(depositMessage);
//                        money = sc.nextInt();
//                        
//                        user.deposit(돈);
//                     }
//                  }else if(bankNumber == 1) {
//                     if(user instanceof Kookmin) {
//                        System.out.println(depositMessage);
//                        money = sc.nextInt();
//                        
//                        user.deposit(돈);
//                     }
//                  }else if(bankNumber == 2) {
//                     if(user instanceof Kakao) {
//                        System.out.println(depositMessage);
//                        money = sc.nextInt();
//                        
//                        user.deposit(돈);
//                     }
//                  }
               } else {
                  System.out.println(loginFailMessage);
               }
               break;
            case 3: // 출금 하기
               System.out.println(accountMessage);
               account = sc.next();
               
               System.out.println(passwordMessage);
               password = sc.next();
               
               user = Bank.login(arrBank, arCount, account, password);
               
               if(user != null) {	// 사용자가 존재한다면
                  System.out.println(withdrawMessage);
                  withdrawMoney = sc.nextInt();
                  
                  temp = user instanceof Kookmin ? (int) (withdrawMoney * 1.5) : withdrawMoney;	// 유저가 국민에 포함되어 있으면, 출금금액 * 1.5 아니면 출금금액 그대로
                  
                  if(withdrawMoney > 0) {	// 출금금액이 0보다 큰지
                     if(temp <= user.getMoney()) {	// 위 검사한 출금금액이 유저가 가지고 있는 돈보다 많으면
                        user.withdraw(withdrawMoney);	// 출금
                        System.out.println("현재 잔액: " + user.getMoney() + "원");
                        
                     }else {
                        System.out.println(errorMessage);
                     }
                     
                  }else {
                     System.out.println(errorMessage);
                  }
               } else {
                  System.out.println(loginFailMessage);
               }
               break;
            case 4: // 잔액 조회
               System.out.println(accountMessage);
               account = sc.next();
               
               System.out.println(passwordMessage);
               password = sc.next();
               
               user = Bank.login(arrBank, arCount, account, password);	// 로그인
               if(user != null) {	// 만약 유저가 존재한다면, 
                  System.out.println("현재 잔액: " + user.showBalance() + "원");
               }
               break;
            case 5: // 계좌번호 찾기
               System.out.println(phoneMessage);
               phone = sc.next();
               
               System.out.println(passwordMessage);
               password = sc.next();
               
               user = Bank.checkPhone(arrBank, arCount, phone);	// 유저의 핸드폰 번호 유효 검사
               if(user != null) {	// 유저가 존재한다면,
                  while(true) {	// 다시 계좌 번호 만들어주기
                     account = String.valueOf(random.nextInt(900000) + 100000);
                     account = bankNumber + account;
                     if(Bank.checkAccount(arrBank, arCount, account) == null) {
                        break;
                     }
                  }
//            	   System.out.println(user.getAccount());	// 기존 계좌번호 알려주기
                  
                  user.setAccount(account);
                  System.out.println("고객님의 소중한 계좌번호: " + account);
               }else {
                  System.out.println(errorMessage);
                  
               }
               break;
               
               default:
                  System.out.println(errorMessage);
                  break;
            }
            
         }
      }
   }
}















