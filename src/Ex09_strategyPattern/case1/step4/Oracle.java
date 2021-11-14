package Ex09_strategyPattern.case1.step4;

public class Oracle extends DataBase {
    public Oracle() {
        name = "Oracle";
        rows = 50;
    }

    @Override
    public void connectDatabase() {
        System.out.println(name + " 에 접속했습니다.");
    }
}
