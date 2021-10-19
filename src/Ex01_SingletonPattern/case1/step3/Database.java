package Ex01_SingletonPattern.case1.step3;

// DAO의 기능을 하는 클래스
public class Database {
    private static Database singleton = new Database("porducts");
    private String name;

//    public Database(String name){
//        super();
//        this.name=name;
//    }
    
    private Database(String name){
        try{
            Thread.sleep(100);
            this.name=name;
        }catch (Exception e){
        }
    }

    //싱글턴 패턴 도입부분
    public static Database getInstance(String name){
        return singleton;
    }

    public String getName(){
        return name;
    }
}
