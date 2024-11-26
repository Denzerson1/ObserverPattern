
public class OtherChannel implements Observer {

    private NewsRoom newsRoom;

    public OtherChannel(NewsRoom newsRoom) {
        this.newsRoom = newsRoom;
    }
    public void update() {
        String txt = this.newsRoom.getTxt();
        System.out.println("OtherChannel: " + txt);
    }
}
