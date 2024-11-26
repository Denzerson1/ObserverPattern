public class    Garage extends Subject{

    private int anzahl;

    public Garage() {
        this.anzahl = 0;
        System.out.println("Anzahl anfang: " + anzahl);
    }

    public void increment() {
        if(anzahl > 0) {
            anzahl++;
        }
    }

    public void decrement() {
        if(anzahl > 0) {
            anzahl--;
        }
    }

    public int getAnzahl() {
        return this.anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
        notifyObserver();
    }

}
