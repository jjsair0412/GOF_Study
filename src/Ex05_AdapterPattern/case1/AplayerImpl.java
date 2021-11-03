package Ex05_AdapterPattern.case1;

public class AplayerImpl implements APlayer{
    @Override
    public void play(String fileName) {
        System.out.println("(A) "+fileName);
    }

    @Override
    public void stop() {

    }
}
