package Ex06_FacadePattern.case2;

public class HomeFacade {
    private Computer computer;
    private Light light;
    private Radio radio;

    public HomeFacade(Computer computer, Light light, Radio radio){
        this.computer = computer;
        this.light = light;
        this.radio = radio;
    }

    public void HomeIn(){
        System.out.println("집에 들어오면 컴퓨터, 라디오, 전등 켬");
        if(!computer.isTrunedOn()){
            computer.turnOn();
        }
        if(!light.isTrunedOn()){
            light.turnOn();
        }
        if(!radio.isTrunedOn()){
            radio.turnOn();
        }
    }

    public void HomeOut(){
        System.out.println("집에서 나가면 컴퓨터, 라디오, 전등 끔");
        if(computer.isTrunedOn()){
            computer.turnOff();
        }
        if(light.isTrunedOn()){
            light.turnOff();
        }
        if(radio.isTrunedOn()){
            radio.turnOff();
        }
    }
}
