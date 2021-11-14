package Ex08_BridgePattern.step1;

public class TestPattern {
    public static void main(String[] args){
        // 이렇게 IRobot이라는 interface를 구현한 클래스는 계속 늘어날 수 있다.
        IRobot robot1 = new RobotModel1();
        robot1.powerOn();
        robot1.powerOff();

        System.out.println("--------------------------------");

        IRobot robot2 = new RobotModel2();
        robot2.powerOn();
        robot2.powerOff();
    }
}
