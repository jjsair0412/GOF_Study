package Ex08_BridgePattern.step3;

public class Cook extends IAction{
    public Cook(IRobot iRobot) {
        super(iRobot);
    }

    public void doCook(){
        System.out.println("요리를 합니다.");
    }
}
