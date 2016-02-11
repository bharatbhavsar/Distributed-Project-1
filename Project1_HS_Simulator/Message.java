/**
 * Created by braden on 1/29/16.
 */
public class Message {

    private int originId;
    private String direction;
    private int hops;
    private int leader;

    public Message(int id, String direction, int hops, int leader) {
        this.originId = id;
        this.direction =  direction;
        this.hops = hops;
        this.leader = leader;
    }

    public Message(int id) {
        this.originId = id;
    }

    public int getOriginId() {
        return originId;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String str) {
        this.direction = str;
    }

    public int getHops() {
        return hops;
    }

    public void setHops(int i) {
        this.hops = i;
    }

    public int getLeader() {
        return leader;
    }
}

