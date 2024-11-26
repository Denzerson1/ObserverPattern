public class Otherchannel implements Observer{

    NewsRoom newsRoom;

    public Otherchannel() {
        newsRoom = new NewsRoom();
    }

    public void update(String txt) {
        System.out.println("OtherChannel: " + txt);
    }

}
