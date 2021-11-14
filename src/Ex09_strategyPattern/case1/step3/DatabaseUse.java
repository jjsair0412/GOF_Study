package Ex09_strategyPattern.case1.step3;

enum DBTYPE {MySQL, Informix, Oracle}

public class DatabaseUse {
    private DataBase db;

    public void connect(DBTYPE dbtype){
        switch (dbtype){
            case MySQL:
                db = new MySql();
                break;
            case Informix:
                db = new Informix();
                break;
            case Oracle:
                db = new Oracle();
                break;
        }

        if(db == null){
            System.out.println("데이터베이스륾 먼저 선택해주세요.");
        }else{
            db.connectDatabase();
        }
    }

    public void select(){
        db.selectData();
    }

}
