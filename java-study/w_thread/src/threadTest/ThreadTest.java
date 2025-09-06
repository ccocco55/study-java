package threadTest;

public class ThreadTest {
   public static void main(String[] args) {
//      각 쓰레드는 각자의 자원에 접근한다.
//      즉, 자원을 공유하지 않는다.
      
//      Thread1 thread1 = new Thread1("♥");
//      Thread1 thread2 = new Thread1("★");
      
//      thread1.run();
//      thread2.run();
      
//      thread1.start();
//      thread2.start();
      
//      Runnable resource1 = new Thread2();
//      Runnable resource2 = new Thread2();
//      
//      Thread thread1 = new Thread(resource1, "?");
//      Thread thread2 = new Thread(resource2, "!");
//      
//      thread1.start();
//      thread2.start();
      
//      자원 공유
      Thread2 resource = new Thread2();
      
      Thread thread1 = new Thread(resource, "&");
      Thread thread2 = new Thread(resource, "|");
      Thread thread3 = new Thread(resource, "~");
      
      thread1.start();
      
      try {thread1.join();} catch (InterruptedException e) {;}
      
      thread2.start();
      thread3.start();
      
      System.out.println("main 쓰레드");
   }
}














