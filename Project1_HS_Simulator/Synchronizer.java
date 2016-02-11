import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by braden on 2/8/16.
 */
public class Synchronizer {


    int numThreads;
    AtomicInteger counter;
    public AtomicBoolean finished;

    public Synchronizer(int numThreads) {
        finished = new AtomicBoolean(false);
        counter = new AtomicInteger(0);
        this.numThreads = numThreads;
    }

    public synchronized boolean isFinished() {
        return finished.get();
    }

    public void incrementCounter() {
        counter.set(counter.incrementAndGet());
        if (counter.intValue() == numThreads) {
            finished.set(true);
        }
    }

}
