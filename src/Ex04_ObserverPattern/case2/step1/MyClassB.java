package Ex04_ObserverPattern.case2.step1;

import java.util.Observable;

public class MyClassB implements Observer {

    private boolean bPlay; // 실행 여부 ( 이게 변하면 연락이 가게 된다. )


    @Override
    public void update(boolean play) {
        this.bPlay = play;
        myActControl();
    }

    public void myActControl(){
        if(bPlay){
            System.out.println("클래스 B : 동작을 시작합니다.");
        }else{
            System.out.println("클래스 B : 동작을 정지합니다.");
        }
    }

}
