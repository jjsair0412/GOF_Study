package Ex08_BridgePattern.step3;

public class RobotModel2 implements IRobot {
    @Override
    public void powerOn() {
        System.out.println("type 2 : power on");
    }

    @Override
    public void powerOff() {
        System.out.println("type 2 : power off");
    }

}
