package Ex05_AdapterPattern.case2;

import Ex05_AdapterPattern.case2.APlayer;

public class AplayerImpl implements APlayer {
    @Override
    public void play(String fileName) {
        System.out.println("(A) "+fileName);
    }

    @Override
    public void stop() {

    }
}
