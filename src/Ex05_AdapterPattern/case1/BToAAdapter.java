package Ex05_AdapterPattern.case1;

public class BToAAdapter implements APlayer {
    private BPlayer media;

    public BToAAdapter(BPlayer media){
        this.media = media;
    }

    @Override
    public void play(String fileName) {
        System.out.println("Using Adapter : ");
        media.play(fileName); // A의 메서드로 B를 호출했다.
    }

    @Override
    public void stop() {
    }
    // 버그가 발생한다면 어댑터 클래스만 보면 된다.
}
