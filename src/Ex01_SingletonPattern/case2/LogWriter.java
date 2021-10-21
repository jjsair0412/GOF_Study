package Ex01_SingletonPattern.case2;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class LogWriter {
    private static LogWriter Singleton = new LogWriter();
    private static BufferedWriter bw;

    private LogWriter() {
        try{
            bw = new BufferedWriter(new FileWriter("log.txt"));
        }catch (Exception e){ }
    }

    public static LogWriter getInstance(){
        return Singleton;
    }

    public synchronized void log(String str){
        try{
            bw.write(str + "\n");
            bw.flush();
        }catch (Exception e){

        }
    }

    @Override
    protected void finalize() throws Throwable {
        try{
            super.finalize();
            bw.close();
        }catch (Throwable e){ }
    }
}
