package Ex08_BridgePattern.step3;

// 인터페이스 구현체의 변경 없이 기능을 추가하는 step3
public class TestPattern {
    public static void main(String[] args){
        IRobot robot1 = new RobotModel1();
        Cook work = new Cook(robot1);
        work.doCook();
        work.powerOn();
        work.powerOff();

        System.out.println("--------------------------------");

        IRobot robot2 = new RobotModel2();
        Cook work2 = new Cook(robot2);
        work2.doCook();
        work2.powerOn();
        work2.powerOff();
    }
}
