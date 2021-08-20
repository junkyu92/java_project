package 자바심화2;

public class Account {
   String name;
   String num;
   int money;
   
   @Override
   public String toString() {
      return "[이름: " + name + ", 계좌번호: " + num + ", 잔고: " + money + "]";
   }
      
}