package Ex01_SingletonPattern.case1.step2;

// DAO의 기능을 하는 클래스
public class Database {
    private static Database singleton;
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
    // synchronized를 통해 동시에 getInstance메서드가 참조되더라도, 차례대로 작동하게끔 할 수 있다.
    public synchronized static Database getInstance(String name){
        if(singleton==null){ // 싱글턴이라는 변수가 최초엔 NULL이기 때문에
            singleton = new Database(name); // singleton에 Database()객체가 생성되어 static변수인 singleton에 대입
        }
        // singleton변수를 반환한다. singleton이 null이 아닐 경우에는 if문을 안타기 때문에 기존의 만들어두었던 Database객체를 반환시킨다.
        return singleton;
    }

    public String getName(){
        return name;
    }
}
