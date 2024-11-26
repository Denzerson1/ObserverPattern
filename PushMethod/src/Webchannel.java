public class Webchannel implements Observer {

    String txt;

    public Webchannel() {
        this.txt = "";
    }

    public void update(String txt) {
        this.txt = txt;
        System.out.println("Webchannel: " + txt);
    }
}
