package Ex05_AdapterPattern.case2;


// extends와 implements를 동시에 사용해서 다중상속을 흉내내야 한다.
public class BToAAdapter extends BplayerImpl implements APlayer {

    @Override
    public void play(String fileName) {
        // A의 메서드로 b의 메서드를 호출한다.
        System.out.println("Using Adapter : ");
        playFile(fileName);
    }

    @Override
    public void stop() {
    }
    // 버그가 발생한다면 어댑터 클래스만 보면 된다.
}
