package Ex09_strategyPattern.case1.step3;

public class TestPattern {
    public static void main(String[] args){
        DatabaseUse myDB = new DatabaseUse();

        myDB.connect(DBTYPE.MySQL);
        myDB.select();

        System.out.println(" db 변경 ");
        myDB.connect(DBTYPE.Informix);
        myDB.select();

        System.out.println(" db 변경 ");
        myDB.connect(DBTYPE.Oracle);
        myDB.select();
    }
}
