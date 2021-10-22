package Ex04_ObserverPattern.case1;

import java.util.Observable;
import java.util.Observer;

// Observer를 implements해준다.
public class MyClassA implements Observer {

    Observable observable; // 등록될 Observable
    private boolean bPlay; // 실행 여부 ( 이게 변하면 연락이 가게 된다. )

    public MyClassA(Observable o){
        this.observable = o;
        observable.addObserver(this); // 옵저버에 현재 클래스를 등록해준다.
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof PlayController){
            PlayController myController = (PlayController) o;
            this.bPlay = myController.getFlag();
            myActControl();
        }
    }

    public void myActControl(){
        if(bPlay){
            System.out.println("클래스 A : 동작을 시작합니다.");
        }else{
            System.out.println("클래스 A : 동작을 정지합니다.");
        }
    }
}
