package Ex01_SingletonPattern.case1.step1;

public class TestPattern2 {
    static int nNum = 0;
    public static void main(String[] args){
        Runnable task = () ->{
          try{
              nNum++; // nNum이 증가
              Database database = Database.getInstance(nNum + "번째 Database");
              System.out.println("This is the"+database.getName() + "!!!");
          }catch (Exception e){
          }
        };

        for(int i = 0; i<10; i++){
            // for문을 이용해서 task 스레드 10개 실행
            Thread t = new Thread(task);
            t.start(); // for문의 속도가 너무 빨라, singleton처럼 작동하지 않고, 10개의 스레드가 전부다 생성된것을 볼 수 있다.
            // 따라서 Thread를 이용할때는 Singleton패턴이 취약하다.
        }
    }
}
