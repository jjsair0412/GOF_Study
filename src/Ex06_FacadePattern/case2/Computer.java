package Ex06_FacadePattern.case2;

public class Computer {
    private boolean turnedOn = false;

    public void turnOn(){
        turnedOn = true;
        System.out.println("컴퓨터를 켬");
    }
    public void turnOff(){
        turnedOn = false;
        System.out.println("컴퓨터를 끔");
    }
    public boolean isTrunedOn(){
        return turnedOn;
    }
}
