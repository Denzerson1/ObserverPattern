public class Otherchannel implements Observer{

    private String txt;

    public Otherchannel() {
        this.txt = "";
    }

    public void update(String txt) {
        this.txt = txt;
        System.out.println("OtherChannel: " + txt);
    }

}
