package bank;

public class Bank {
   private String name;
   private String account;
   private String phone;
   private String password;
   private int money;

   public Bank() {
      ;
   }

   public Bank(String name, String account, String phone, String password, int money) {
      super();
      this.name = name;
      this.account = account;
      this.phone = phone;
      this.password = password;
      this.money = money;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getAccount() {
      return account;
   }

   public void setAccount(String account) {
      this.account = account;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public int getMoney() {
      return money;
   }

   public void setMoney(int money) {
      this.money = money;
   }

//   계좌번호 중복검사
   public final static Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
      Bank bank = null;

      for (int i = 0; i < arrBank.length; i++) {	// arrBank 행만큼 반복
         int j = 0;

         for (j = 0; j < arCount[i]; j++) {	// arCount 만큼 반복 (100만큼 반복은 필요 없기 때문. 있는 유저만큼만 반복!)
            if (arrBank[i][j].getAccount().equals(account)) {	// 행 * 열 돌아서 받은 계좌와 이미 있는 계좌 같은지 확인
               bank = arrBank[i][j];	// bank에 그 자리를 넣어주고 계좌가 있는 자리에서 멈추고
               break;	// 중단
            }
         }

         if (j != arCount[i]) {	// 아무곳에도 없다면
            break;	// 중단 즉 bank = null
         }
      }

      return bank;
   }

//   핸드폰 번호 중복검사
   public final static Bank checkPhone(Bank[][] arrBank, int[] arCount, String phone) {
      Bank bank = null;

      for (int i = 0; i < arrBank.length; i++) {	// arrBank 행만큼 반복
         int j = 0;

         for (j = 0; j < arCount[i]; j++) {
            if (arrBank[i][j].getPhone().equals(phone)) {	// arrBank에 받은 핸드폰 값이랑 원래있던 핸드폰 값이랑 같은지 확인
               bank = arrBank[i][j];	// bank를 그 자리에 넣어주고 멈춤
               break;
            }
         }

         if (j != arCount[i]) {	// 만약 같은 값이 없다면
            break;	// 멈춤
         }
      }

      return bank;
   }

//   로그인
   public final static Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
      Bank user = checkAccount(arrBank, arCount, account);
      if(user != null) {	// 유저가 맞다면
         if(user.password.equals(password)) {	// 유저의 비밀번호와 입력 비밀번호가 같은지 검사
            return user;
         }
      }
      
      return null;
   }

//   입금
   public void deposit(int money) {
      this.money += money;
   }

//   출금
   public void withdraw(int money) {
      this.money -= money;
   }

//   잔액 조회
   public int showBalance() {
      return money;
   }

}
