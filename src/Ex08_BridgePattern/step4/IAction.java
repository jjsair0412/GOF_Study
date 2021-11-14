package Ex08_BridgePattern.step4;

import Ex08_BridgePattern.step3.IRobot;

// IRobot, RobotModel1, RobotModel2의 변경 없이 기능을 추가하는 방법
public class IAction {
    private Ex08_BridgePattern.step3.IRobot iRobot;

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
