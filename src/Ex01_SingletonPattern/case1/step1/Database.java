package Ex01_SingletonPattern.case1.step1;

// DAO의 기능을 하는 클래스
public class Database {
    private static Database singleton;
    private String name;

    public Database(String name){
        super();
        this.name=name;
    }

    //싱글턴 패턴 도입부분
    public static Database getInstance(String name){
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
