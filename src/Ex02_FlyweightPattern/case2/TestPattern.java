package Ex02_FlyweightPattern.case2;

public class TestPattern {
    public static void main(String[] args){
        // 공통되는 부분을 만들어놓고, 맨날맨날 새로 생성하는것이 아니라 재사용할떄는 만들어놧던것을 재활용하는것이 플라이웨이트 패턴이다.
        FlyweightFactory flyweight = new FlyweightFactory();
        flyweight.getSubject("a");
        flyweight.getSubject("b");
        flyweight.getSubject("c"); // 여기까지는 다 새로만들어서 map에 넣어줌

        flyweight.getSubject("a"); // 이미 만들어놓은 객체가 있기 때문에 재사용한다.
        flyweight.getSubject("c"); // 재사용한다.

        /**
         * 결과 :
         * 새로 생성 a
         * 새로 생성 b
         * 새로 생성 c
         * 재사용 a
         * 재사용 c
         */
    }
}
