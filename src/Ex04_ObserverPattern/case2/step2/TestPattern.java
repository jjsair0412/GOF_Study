package Ex04_ObserverPattern.case2.step2;

public class TestPattern {
    public static void main(String[] args){
        PlayController pager = new PlayController();
        Observer ob1 = new MyClassA(pager);
        Observer ob2 = new MyClassB(pager);

        System.out.println("모든 클래스 일시정지");
        pager.setFlag(false);

        System.out.println("모든 클래스 다시 시작");
        pager.setFlag(true);
    }
}
