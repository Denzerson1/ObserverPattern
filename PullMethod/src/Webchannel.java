public class Webchannel implements Observer {

    private NewsRoom newsRoom;

    public Webchannel(NewsRoom newsRoom) {
        this.newsRoom = newsRoom;
    }
    public void update() {
        String txt = this.newsRoom.getTxt();
        System.out.println("Webchannel: " + txt);
    }
}
