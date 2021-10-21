package Ex02_FlyweightPattern.case1.step2;

public class TestPattern {
    public static void main(String[] args) {
        // 자바에서는 객체를 생성할 때에도 플라이웨이트 패턴을 적용하고 있다.
        // 서로다른 객체끼리 메모리공간을 공유한다면, 값도 공유하게 할 수 있다.
        MyData md1 = new MyData();
        md1.xpos = 10;
        md1.ypos = 11;
        md1.name = "주진성";

        MyData md2 = new MyData();
        md2 = md1; // md1의 메모리공간과, md2의 메모리공간이 같아진다.

        MyData md3 = new MyData();
        md3.xpos = 20;
        md3.ypos = 21;
        md3.name = "손오공";

        md2.name = "전우치"; // 따라서 md2의 name을 바꾼다면 md1의 name도 전우치로 같이바뀐다.
        md2.xpos = 5; // md2의 xpos를 바꾼다면, md1의 xpos도 5로 바뀐다.
    }
}

class MyData{
    int xpos;
    int ypos;
    String name;
}