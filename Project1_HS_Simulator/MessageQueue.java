import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by braden on 1/29/16.
 */
public class MessageQueue {

    private Queue<Message> queue;

    public MessageQueue() {
        this.queue = new LinkedList<>();
    }

    public synchronized void send(Message t) {
        queue.add(t);
    }

    public synchronized Message receive() {
        return queue.poll();
    }

    public synchronized boolean isEmpty() {
        return queue.isEmpty();
    }
}

