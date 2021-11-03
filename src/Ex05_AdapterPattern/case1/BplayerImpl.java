package Ex05_AdapterPattern.case1;

public class BplayerImpl implements BPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("(B) "+fileName);
    }

    @Override
    public void stop() {

    }
}
