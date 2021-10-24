package Ex04_ObserverPattern.case2.step2;

public class MyClassA implements Observer {
    Publisher observer; // 등록될 옵저버
    private boolean bPlay; // 실행 여부 ( 이게 변하면 연락이 가게 된다. )

    public MyClassA(Publisher o){
        this.observer = o;
        observer.addObserver(this);
    }

    @Override
    public void update(boolean play) {
        this.bPlay = play;
        myActControl();
    }

    public void myActControl(){
        if(bPlay){
            System.out.println("클래스 A : 동작을 시작합니다.");
        }else{
            System.out.println("클래스 A : 동작을 정지합니다.");
        }
    }

}
