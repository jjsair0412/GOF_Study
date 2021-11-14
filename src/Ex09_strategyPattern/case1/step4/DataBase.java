package Ex09_strategyPattern.case1.step4;

public abstract class DataBase {
    public String name;
    public double rows;

    // DB마다 접속 라이브러리가 다름
   public abstract void connectDatabase();

    public void insertData(){
        System.out.println(name + "에 데이터 추가");
    }

    public void selectData(){
        System.out.println(name+"에서 데이터를 "+rows+"개 조회");
    }
}
