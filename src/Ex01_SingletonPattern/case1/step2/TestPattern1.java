package Ex01_SingletonPattern.case1.step2;

public class TestPattern1 {
    public static void main(String[] args){
//        Database d1 = new Database("1"); // d1이라는 객체 생성
//        Database d2 = new Database("2");
//        Database d3 = new Database("3");
//        Database d4 = new Database("4");
//        Database d5 = new Database("5");
//        Database d6 = new Database("6");

        // 객체 6개 생성
        // 여기서 문제가 발생한다.
        // 예를들어서 객체하나당 메모리소모가 20메가라면, 총 120메가만큼의 메모리가 소모되었을 것이다.
        // 이것이 많아지면 많아질수록 메모리소모가 심할것이기 때문에, 객체생성의 개수를 제한하는 싱글턴 패턴을 이용한다.
        System.out.println("database use");

        Database d7;
        // 객체를 인스턴스화 할때, Database클래스에 만들어두었던 getInstance()를 이용해 인스턴스화 한다.
        d7 = Database.getInstance("첫번째 데이터베이스");
        System.out.println("d7.getName() = " + d7.getName());

        Database d8;
        d8 = Database.getInstance("두번째 데이터베이스");
        System.out.println("d8.getName() = " + d8.getName());
        // 결과는 둘다 첫번째 데이터베이스가 출력된다.
        // 두번째 d8에서는 getInstance()에 if문을 들어가지 않기 때문에, 기존에 d7에서 넣어줬었던 "첫번째 데이터베이스"가 출력되는것이다.

    }
}
