package Ex05_AdapterPattern.case2;

public class BplayerImpl extends BPlayer {

    @Override
    public void playFile(String fileName) {
        System.out.println("(B) :"+fileName);
    }

    @Override
    public void stopFile() {

    }
}
