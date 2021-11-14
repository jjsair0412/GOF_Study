package Ex08_BridgePattern.step4;

import Ex08_BridgePattern.step3.IRobot;

public class Clean extends IAction{
    public Clean(IRobot iRobot) {
        super(iRobot);
    }
    public void doClean(){
        System.out.println("청소를 합니다.");
    }
}
