package Ex08_BridgePattern.step4;


public class TestPattern {
    public static void main(String[] args){
        // IAction을 상속받는 클래스를 늘려서, 각 구현체에게 다른 기능을 줄 수 있다.
        IRobot robot1 = new RobotModel1();
//        Cook work1 = new Cook(robot1);
//        work1.doCook();
//        work1.powerOn();
//        work1.powerOff();

        System.out.println("--------------------------------");

        IRobot robot2 = new RobotModel2();
//        Clean work2 = new RobotModel2(robot2);
//        work2.powerOff();
//        work2.powerOn();
//        work2.doClean();
    }
}
