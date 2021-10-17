package Ex01_DI;

import java.util.Date;

public class UnderstandDi {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date = " + date);

        hi h = new Member(); // 상위클래스인 hi 인터페이스를 통해 하위클래스 Member를 생성하게 되면,
        h.hi();
//        h.name;  기존 하위클래스 Member의 속성이나 기능에는 접근할 수 없다. 접근하려면 추상클래스를 사용해야 한다.
//        h.nickname; 얘도 접근이 불가능하다.
        Member m = new Member("진성","주진성"); // 그러나 하위클래스 자체를 생성해준다면 가능
        System.out.println("이름 = "+m.name);
        System.out.println("별명 = "+m.nickname);
    }

    public static void getDate(Date d){
        Date date2 = d;
        System.out.println("date = " + date2);
    }

    public static void memberUse1(){
        // memberUse1에서 Member 객체를 직접 인스턴스화 했기 때문에, 강한 결합이다.
        Member m1 = new Member();
    }

    public static void memberUse2(Member m){
        // Member를 외부에서 생성된것을 주입받기 때문에, 약한 결합이다.
        // 이것이 Di이다.
        Member m2 = m;
    }
}

// Member를 사용한다 --> Member의 기능에 의존한다 라는 의미이다.
class Member implements hi{
    String name;
    String nickname;

    public Member(){

    }
    public Member(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public void hi() {
        System.out.println("hi");
    }
}

interface hi{
    void hi();
}
