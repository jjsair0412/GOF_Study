package Ex06_FacadePattern.case2;

public class Light {
    private boolean turnedOn = false;

    public void turnOn(){
        turnedOn = true;
        System.out.println("라이트 켬");
    }
    public void turnOff(){
        turnedOn = false;
        System.out.println("라이트 끔");
    }
    public boolean isTrunedOn(){
        return turnedOn;
    }
}
