package Ex04_ObserverPattern.case2.step2;

import java.util.ArrayList;
import java.util.List;

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
        for(int i = 0; i<observers.size(); i++){
            observers.get(i).update(play);
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
