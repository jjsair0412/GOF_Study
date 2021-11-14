package Ex09_strategyPattern.case1.step4;

public class TestPattern {
    public static void main(String[] args){
        DatabaseUse myDB = new DatabaseUse();

        myDB.setDatabase(new Oracle());
        myDB.connect();
        myDB.select();

        System.out.println("db 변경");

        myDB.setDatabase(new MySql());
        myDB.connect();
        myDB.select();

        System.out.println("db 변경");

        myDB.setDatabase(new Informix());
        myDB.connect();
        myDB.select();
    }
}
