package Ex05_AdapterPattern.case2;


public class TestPattern {
    public static void main(String[] args){
        APlayer player = new BToAAdapter();
        player.play("aaa.mp3");
    }
}
