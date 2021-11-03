package Ex06_FacadePattern.case2;

public class Radio {
    private boolean turnedOn = false;

    public void turnOn(){
        turnedOn = true;
        System.out.println("라디오 켬");
    }
    public void turnOff(){
        turnedOn = false;
        System.out.println("라디오 끔");
    }
    public boolean isTrunedOn(){
        return turnedOn;
    }
}
