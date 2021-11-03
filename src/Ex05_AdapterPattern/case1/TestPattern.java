package Ex05_AdapterPattern.case1;

public class TestPattern {
    public static void main(String[] args){
        APlayer player1 = new AplayerImpl();
        player1.play("aaa.mp3");

        // 계약기간 만료로 APlayerImpl()을 사용할 수 없게 되었다고 생각하자.

        BPlayer player2 = new BplayerImpl();
        player2.play("bbb.mp3");

        // 이렇게 처음부터 다 코딩할 수 있겠지만, 나머지 코드들이 존재한다고 쳤을때
        // 기존에 잘 동작하던 코드와 이번에 새로 도입된 Bplayer같은 코드들이
        // 변경 없이 사용하고 싶을 때 어댑터 패턴을 적용한다.

        player1 = new BToAAdapter(new BplayerImpl()); // 어댑터 적용
        player1.play("ccc.mp3");
        // 이렇게해주면 현재 모든 코드가 Aplayer에 맞게 코딩되어 있기 때문에
        // Aplayer에 대입되는 객체만 수정해주면 문제없이 동작한다.
    }
}
