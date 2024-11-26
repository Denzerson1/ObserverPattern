public class Webchannel implements Observer {

    private NewsRoom subject;

    public Webchannel() {
        this.subject = new NewsRoom();
    }

    public void update(String txt) {
        System.out.println("Webchannel: " + txt);
    }
}
