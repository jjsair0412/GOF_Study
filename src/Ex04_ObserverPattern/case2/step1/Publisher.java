package Ex04_ObserverPattern.case2.step1;

import Ex04_ObserverPattern.case2.step1.Observer;

// Observable클래스를 대신하는 interface
public interface Publisher {
    public void addObserver(Observer o);
    public void deleteObserver(Observer o);
    public void notifiyObservers();
}
