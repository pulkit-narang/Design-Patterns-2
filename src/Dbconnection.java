import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Dbconnection {
    private Dbconnection()
    {

    }
    private static Dbconnection inst;

    private static Lock l=new ReentrantLock();
    public static Dbconnection getdbconnection()
    {
        if(inst==null) {
            l.lock();
            if (inst == null) {
                inst = new Dbconnection();
            }
            l.unlock();
        }
        return inst;

    }
}
