package Ex02_FlyweightPattern.case1.step1;

public class TestPattern {
    public static void main(String[] args){
        // 중복생성을 막기 위해, String은 Flyweight 패턴이 적용되어있다.
        String str1 = new String("홍길동");
        String str2 = new String("홍길동");
        String str3 = "홍길동";
        String str4 = "홍길동";

        System.out.println("Flyweight Pattern");
    }
}
