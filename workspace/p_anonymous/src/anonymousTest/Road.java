package anonymousTest;

public class Road {
   public static void main(String[] args) {
      Nike jamsil = new Nike();
//      강남점 객체화
      Nike gangnam = new Nike();
//      강남점 등록
      gangnam.register(new FormAdapter() {
         
         @Override
         public String[] getMenu() {
            return new String[] {"축구공", "농구공", "운동화", "축구화"};
         }
      });
         
      System.out.println("==================================");
      
      jamsil.register(new Form() {
         
         @Override
         public void sell(String order) {
            System.out.println("어서오세요 나이키 잠실점입니다.");
            System.out.println("필요한 것 있으시면 말씀해주세요.");
            for (int i = 0; i < getMenu().length; i++) {
               if(getMenu()[i].equals(order)) {
                  System.out.println(order + " 판매 완료");
               }
            }
            System.out.println("멤버십 적립되었습니다.");
            System.out.println("안녕히 가세요.");
         }
         
         @Override
         public String[] getMenu() {
            return new String[] {"축구공", "농구공", "운동화", "축구화"};
         }
      });
   }
}
