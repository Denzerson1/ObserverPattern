public class NewsRoom extends Subject {
    private String txt;
    public NewsRoom() {
        this.txt = "erster Eintrag";
    }

    public void setTxt(String txt) {
        this.txt = txt;
        notifyObserver(txt);
    }

    public String getTxt() {
        return this.txt;
    }

}
