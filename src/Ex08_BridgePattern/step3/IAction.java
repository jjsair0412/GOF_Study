package Ex08_BridgePattern.step3;

public class IAction {
    private IRobot iRobot;

    public IAction(IRobot iRobot){
        this.iRobot = iRobot;
    }

    void powerOn(){
        iRobot.powerOn();
    }

    void powerOff(){
        iRobot.powerOff();
    }
}
