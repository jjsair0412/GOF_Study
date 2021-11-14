package Ex09_strategyPattern.case1.step4;


public class DatabaseUse {
    private DataBase db;

    public void setDatabase(DataBase db){
        this.db = db;
    }

    public void connect(){
        if(db == null){
            System.out.println("데이터베이스를 먼저 선택하세요");
        }else{
            // 구체적인 DB를 몰라도 기능의 사용이 가능하다.
            db.connectDatabase();
        }
    }

    public void select(){
        db.selectData();
    }

}
