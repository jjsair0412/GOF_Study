package Ex04_ObserverPattern.case2.step2;

// Observable클래스를 대신하는 interface
public interface Publisher {
    public void addObserver(Observer o);
    public void deleteObserver(Observer o);
    public void notifiyObservers();
}
