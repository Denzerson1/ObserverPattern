public class KartenApp implements Observer{

    private Garage garage;

    public KartenApp(Garage garage) {
        this.garage = garage;
    }

    public void update() {
        anzeige();
    }

    public void anzeige() {
        int anzahl = garage.getAnzahl();
        System.out.println("KartenApp: " + anzahl);
    }
}
