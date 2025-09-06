package list.task.User;

import java.net.PasswordAuthentication;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import list.task.DBConnecter;

public class Page {
   public static void main(String[] args) {
      User user = new User();
      UserService userService = new UserService();
      
      user.setEmail("test@gmail.com");
      user.setPassword("1234");
      user.setName("test");
      user.setPhone("01012341234");
      
      try {
         userService.join(user);
      } catch (NoSuchAlgorithmException e) {
         e.printStackTrace();
      }
      System.out.println(DBConnecter.users);
      
      user = userService.checkEmail("test@gmail.com");
      System.out.println(user);
      
      try {
         user = userService.login(new User("test@gmail.com", "1234"));
         if(user != null) {
            System.out.println("로그인 성공");
            System.out.println(user);
         }else {
            System.out.println("로그인 실패");
         }
      } catch (NoSuchAlgorithmException e) {
         e.printStackTrace();
      }

      
      
   }
}














