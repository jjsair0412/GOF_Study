package Ex09_strategyPattern.case1.step3;

public class Informix extends DataBase{

    public Informix(){
        name = "Informix";
        rows = 40;
    }
    @Override
    public void connectDatabase() {

        // 연결설정부분
        System.out.println(name + "에 접속했습니다.");
    }
}
