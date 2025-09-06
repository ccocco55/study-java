package com.app.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnecter {
   public static Connection getConnection() {
      Connection connection = null;
      
      String userName = "dbms";
      String password = "1234";
      String url = "jdbc:mysql://localhost:3306/jdbc?useSSL=false&serverTimezone=Asia/Seoul";
      
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         connection = DriverManager.getConnection(url, userName, password);
      } catch (ClassNotFoundException e) {
         System.out.println("드라이버 로딩 실패");
         e.printStackTrace();
      } catch (SQLException e) {
         System.out.println("연결 정보 오류");
         e.printStackTrace();
      }
      
      return connection;
   }
}
