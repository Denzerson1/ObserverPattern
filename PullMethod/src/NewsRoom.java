public class NewsRoom extends Object{
    private String txt;

    public NewsRoom() {
        this.txt = "erster eintrag";
    }

    public String getTxt() {
        return this.txt;
    }

    public void setText(String txt) {
        this.txt = txt;
        notifyObserver();
    }
}
