package Ex08_BridgePattern.step2;

public class TestPattern {
    public static void main(String[] args){
        // case 1에서 기능을 추가한다.
        IRobot robot1 = new RobotModel1();
        robot1.powerOn();
        robot1.powerOff();
        robot1.doCook();

        System.out.println("--------------------------------");

        IRobot robot2 = new RobotModel2();
        robot2.powerOn();
        robot2.powerOff();
        robot2.doCook();
    }
}
