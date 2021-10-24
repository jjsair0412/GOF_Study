package Ex04_ObserverPattern.case2.step1;

import java.util.ArrayList;
import java.util.List;
import Ex04_ObserverPattern.case2.step1.Observer;

public class PlayController implements Publisher {
    private List<Observer> observers = new ArrayList<>();
    private boolean play;

    @Override
    public void addObserver(Observer o) {
        observers.add(o); // 옵저버 리스트에 옵저버 추가
    }

    @Override
    public void deleteObserver(Observer o) {
        int index = observers.indexOf(o);
        observers.remove(index); // 옵저버리스트에서 옵저버 삭제
    }

    @Override
    public void notifiyObservers() {
        for(Observer observer : observers){
            observer.update(play); // 모든 옵저버들을 돌면서 해당 옵저버의 업데이트문을 실행
        }
    }

    public void setFlag(Boolean play){
        this.play = play;
        notifiyObservers();
    }

    public boolean getFlag(Boolean play){
        return play;
    }
}
