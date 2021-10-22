package Ex04_ObserverPattern.case1;

import java.util.Observable;

// 감시용 객체
// Observable을 상속받는다면, 따로 다른 설정을 해주지 않아도 감시가 된다.
public class PlayController extends Observable {
    private boolean bPlay; // 실행 여부

    public PlayController(){

    }

    // 데이터를 전달받아 플래그 값을 변경하고
    // 새로운 데이터가 들어왔음을 알린다.
    public void setFlag(boolean bPlay){
        this.bPlay = bPlay; // 값이 변경되면, ( 값이 변경된다면 setChanged()와 notifyObservers() 메서드들을 호출한다.
        setChanged(); // 내용이 변경되었을때 호출하는 메서드
        notifyObservers(); // 옵저버들에게 연락하는 메서드
    }

    // 실행 여부 플래그값 반환
    public boolean getFlag(){
        return bPlay;
    }
}
