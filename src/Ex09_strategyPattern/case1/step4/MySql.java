package Ex09_strategyPattern.case1.step4;

public class MySql extends DataBase {
    public MySql(){
        name = "MySQL";
        rows = 20;
    }

    @Override
    public void connectDatabase() {

        // 연결설정부분
        System.out.println(name+ " 에 접속했습니다.");
    }
}
