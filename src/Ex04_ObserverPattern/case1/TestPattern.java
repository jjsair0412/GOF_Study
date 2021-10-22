package Ex04_ObserverPattern.case1;

public class TestPattern {
    public static void main(String[] args){
        PlayController controller = new PlayController();

        MyClassA classA = new MyClassA(controller);
        MyClassB classB = new MyClassB(controller);

        System.out.println("모든 클래스 일시 정지");
        controller.setFlag(false);

        System.out.println();

        System.out.println("모든 클래스 실행");
        controller.setFlag(true);

        System.out.println();

        /**
         * 결과 :
         * 모든 클래스 일시 정지
         * 클래스 B : 동작을 정지합니다.
         * 클래스 A : 동작을 정지합니다.
         *
         * 모든 클래스 실행
         * 클래스 A : 동작을 시작합니다.
         *
         * 마지막에 클래스 B에서 동작을 시작합니다가 안뜬 이유는, 모든클래스 일시정지가 되면서
         * 클래스 B를 옵저버에서 삭제시켰기 때문이다.
         */
    }
}
