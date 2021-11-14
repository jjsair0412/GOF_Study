package Ex08_BridgePattern.step2;

public class RobotModel1 implements IRobot {
    @Override
    public void powerOn() {
        System.out.println("type 1 : power on");
    }

    @Override
    public void powerOff() {
        System.out.println("type 1 : power off");
    }

    @Override
    public void doCook() {
        System.out.println("요리를 합니다");
    }
}
